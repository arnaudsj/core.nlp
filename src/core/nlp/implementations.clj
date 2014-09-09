(ns core.nlp.implementations
  (:use [core.nlp.utils])
  (:require [core.nlp.protocols :as nlpp]))

;; ==========================================================================
;; Implementation utilities
;;
;; Tools to support the registration / management of core.nlp implementations
;; ==========================================================================

;; map of known implementation tags to namespace imports
;; we use this to attempt to load an implementation
(def KNOWN-IMPLEMENTATIONS
  (array-map
   :pure-nlp 'core.nlp.impl.pure-nlp
   :stanford-corenlp 'core.nlp.impl.stanford-corenlp
   :clean-nlp :TODO
   :gate :TODO))

;; default implementation to use
;; should be included with clojure.core.matrix for easy of use
(def DEFAULT-IMPLEMENTATION :pure-nlp)

;; current implementation in use
(def ^:dynamic *nlp-implementation* DEFAULT-IMPLEMENTATION)

;; hashmap of implementation keys to canonical objects
;; objects must implement PImplementation protocol at a minimum
(defonce canonical-objects (atom {}))

(defn get-implementation-key
  "Returns the implementation code for a given object"
  ([m]
    (cond
      (keyword? m) m
      ;;(nlpp/is-scalar? m) nil
      :else (nlpp/implementation-key m))))

(defn register-implementation
  "Registers an implementation for use. Should be called by all implementations
   when they are loaded."
  ([canonical-object]
    (swap! canonical-objects assoc (nlpp/implementation-key canonical-object)
           canonical-object)))
(defn try-load-implementation
  "Attempts to load an implementation for the given keyword.
   Returns nil if not possible, a non-nil value otherwise."
  ([k]
    (if-let [ns-sym (KNOWN-IMPLEMENTATIONS k)]
      (try
        (do
          (require ns-sym)
          (if (@canonical-objects k) :ok
              :warning-implementation-not-registered?))
        (catch Throwable t nil)))))

(defn get-canonical-object
  "Gets the canonical object for a specific implementation. The canonical object
  is used to call implementation-specific protocol functions where required
  (e.g. creation of new arrays of the correct type for the implementation)"
  ([]
    (get-canonical-object *nlp-implementation*))
  ([m]
    (let [k (get-implementation-key m)
          obj (@canonical-objects k)]
      (if k
        (or obj
           (if (try-load-implementation k) (@canonical-objects k))
           (when-not (keyword? m) m)
           (error "Unable to find implementation: [" k "]"))
        nil))))
