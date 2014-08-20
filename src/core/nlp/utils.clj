(ns core.nlp.utils
  (:require [clojure.reflect :as r]))

;; Some of these are copies of methods from the library
;;   https://github.com/mikera/clojure-utils
;;
;; duplicated here to avoid an extra dependency

(set! *warn-on-reflection* true)
(set! *unchecked-math* true)

(defmacro error
  "Throws an error with the provided message(s)"
  ([& vals]
    `(throw (java.lang.RuntimeException. (str ~@vals)))))

(defmacro error?
  "Returns true if executing body throws an error, false otherwise."
  ([& body]
    `(try
       ~@body
       false
       (catch Throwable t#
         true))))

(defmacro error
  "Throws an error with the provided message(s)"
  ([& vals]
    `(throw (java.lang.RuntimeException. (str ~@vals)))))

;; useful macro: facilitates searching TODO while throwing an error at runtime
(defmacro TODO
  ([] `(error "TODO: not yet implemented"))
  ([& vals] `(error "TODO: " ~@vals)))

(defmacro iae
  "Throws IllegalArgumentException with provided string"
  [exception-str]
  `(throw (IllegalArgumentException. ~exception-str)))

(defmacro iae-when-not
  "Throws an IllegalArgumentException when the predicate is not satisfied"
  [pred? exception-str]
  `(when-not ~pred?
     (iae ~exception-str)))
