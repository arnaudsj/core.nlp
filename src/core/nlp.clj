(ns core.nlp
  (:use [core.nlp.utils])
  (:require [core.nlp.impl pure-nlp])
  (:require [core.nlp.protocols :as nlpp])
  (:require [core.nlp.implementations :as imp :refer [*nlp-implementation*]])
)

;; core.nlp API namespace
;;
;; This is the public API for core.nlp
;;
;; General handling of operations is as follows:
;;
;; 1. User calls public API function defined in core.nlp
;; 2. The core.nlp function delegates to a protocol for the appropriate function
;;    with protocols as defined in core.nlp.protocols namespace. In most cases
;;    core.nlp will try to delegate as quickly as possible to the implementation
;; 3. The underlying nlp implementation implements the protocol to handle the
;;    API function call.
;; 4. The implementation decides what to do for the concrete operation.
;; 5. If the implementation does not understand one or more parameters, then it
;;    is expected to call the multimethod version in core.nlp.multimethods as
;;    this will allow an alternative implementation to be found via multiple
;;    dispatch.

(set! *warn-on-reflection* true)
(set! *unchecked-math* true)

;; =============================================================
;; nlp functions

(declare current-implementation)
(declare implementation-check)
(declare current-implementation-object)


(defn tokenize
  "Tokenizes a sentence"
  [s]
  (nlpp/tokenize s))



(defn set-current-implementation
  "Sets the currently active core.nlp implementation."
  ([m]
    (alter-var-root (var imp/*nlp-implementation*)
                    (fn [_] (imp/get-implementation-key m)))))
