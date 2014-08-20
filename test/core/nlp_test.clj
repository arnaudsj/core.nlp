(ns core.nlp-test
  (:require [core.nlp :refer :all])
  (:use midje.sweet))

(facts "FIXME, I fail."
       (tokenize  ["Mary had a little lamb"])
       => ["mary" "had" "a" "little" "lamb"])
