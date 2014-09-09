(ns core.nlp-test
  (:require [core.nlp :refer :all])
  (:use midje.sweet))


(set-current-implementation :pure-nlp)
(facts "Using simple pure-clj-nlp"
       (tokenize  ["Mary had a little lamb"])
       => ["mary" "had" "a" "little" "lamb"])


(set-current-implementation :stanford-corenlp)
(facts "Using stanford-corenlp"
       (tokenize ["Mary had a little lamb"])
       => ["mary" "had" "a" "little" "lamb"])
