(ns core.nlp.impl.pure-nlp
  (:require [core.nlp.protocols :as nlpp])
  (:use core.nlp.utils)
  (:require [core.nlp.implementations :as imp])
  (:require [clojure.string :as string]))

(set! *warn-on-reflection* true)
(set! *unchecked-math* true)

;; =======================================================================
;; Implementation


(extend-protocol nlpp/PImplementation
  clojure.lang.PersistentVector
    (implementation-key [s] :pure-nlp)
    (meta-info [s]
      {:doc "Pure NLP implementation in Clojure"})
    (tokenize [s] (drop 1 (string/split
                           (string/lower-case s)
                           #"[^a-z0-9äöüáéíóúãâêîôûàèìòùçñ]+"))))

;; =====================================
;; Register implementation

(imp/register-implementation [1])
