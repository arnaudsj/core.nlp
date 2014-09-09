(ns core.nlp.impl.stanford-corenlp
  (:require [core.nlp.protocols :as nlpp])
  (:use core.nlp.utils)
  (:require [core.nlp.implementations :as imp])
  (:require [clojure.string :as string])
  (:require [corenlp :as stanford-corenlp]))

(set! *warn-on-reflection* true)
(set! *unchecked-math* true)

;; =======================================================================
;; Implementation


(extend-protocol nlpp/PImplementation
  clojure.lang.PersistentVector
    (implementation-key [s] :stanford-corenlp)
    (meta-info [s]
      {:doc "Stanford CoreNLP implementation"})
    (tokenize [s] (stanford-corenlp/tokenize s)))

;; =====================================
;; Register implementation

(imp/register-implementation [2])
