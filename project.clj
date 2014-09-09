(defproject me.arnaudsj/core.nlp "0.1.0"
  :description "core.matrix : NLP programming API for Clojure"
  :url "http://arnaudsj.github.io/core.nlp/"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [criterium "0.4.3"]
                 [me.arnaudsj/corenlp "3.4"]]
  :plugins [[lein-marginalia "0.7.1"]]
  :profiles {:dev {:dependencies [[midje "1.6.3"
                                   :exclusions [org.clojure/clojure]]]
                   :plugins [[lein-midje "3.1.3"]]}})
