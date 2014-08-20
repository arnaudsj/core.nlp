(ns core.nlp.protocols)

(set! *warn-on-reflection* true)
(set! *unchecked-math* true)

;; ================================================================
;; core.nlp API protocols
;;
;; NLP implementations should extend these for full API support
;;
;; This namespace is intended for use by API implementers only
;; core.nlp users should not access these protocols directly
;;
;; ================================================================

;; ================================================================
;; PROTOCOLS FOR ALL IMPLEMENTATIONS
;;
;; A compliant core.nlp implementation must implement these.
;; Otherwise things will fail.

(defprotocol PImplementation
  "Protocol for general implementation functionality. Required to
   support implementation metadata and feature vector matrix construction."
  (implementation-key [s]
    "Returns a keyword representing this implementation.
     Each implementation should have one unique key.")
  (meta-info [s]
    "Returns meta-information on the implementation. It is expected that
     at least an element :doc containing a string describing an implementation
     is provided.")
  (tokenize [s]
    "Returns a new array containing the tokenized content."))
