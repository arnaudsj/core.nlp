core.nlp
========

core.nlp provides nlp processing as a language extension for Clojure

The central objective of `core.nlp` is to make natural language processing
idiomatic, productive, elegant and fast in the Clojure environment.

```clojure
(tokenize "a quick fox jumps")

=> ["a" "quick" "fox" "jumps"]

```

Key goals of `core.nlp`:

 - Provide a clear, standard API / abstraction for **NLP processing and analysis** in Clojure
 - Enable **pluggable** support for different underlying NLP library implementations
 - Provide a general purpose pure clojure implementation (CljNLP)
 - Provide a **foundation** library for other projects
 - Enable **high performance** and *scalable* NLP processing
 - Work with **big data** platforms such as Apache Spark, Storm or Hadoop

### Getting Started

To use `core.nlp`, you can get the latest released version from Clojars:

 - https://clojars.org/me.arnaudsj/core.nlp

For code examples see:

 - https://github.com/arnaudsj/core.nlp/TODO

### Documentation

For `core.nlp` documentation and further examples see the Wiki:

 - https://github.com/arnaudsj/core.nlp/wiki

### Status

`core.nlp` is currently under heavy development, so use it at your own risks!

[![Build Status](https://travis-ci.org/arnaudsj/core.matrix.png?branch=master)](https://travis-ci.org/arnaudsj/core.nlp)

### Contributing

All contributions / ideas welcome!

There are a number of proposed enhancements listed as GitHub issues: these are a good place to start if you wish to contribute
to core.nlp:

 - https://github.com/arnaudsj/core.nlp/issues?state=open

Discussions related to core.nlp generally take place on the "NLP Clojure" group:

 - https://groups.google.com/forum/?fromgroups#!forum/nlp-clojure

If you are interested in writing a `core.nlp` implementation, see:

 - https://github.com/arnaudsj/core.nlp/wiki/Implementation-Guide

You can also find a protocol implementation summary here:

 - http://arnaudsj.github.io/core.nlp/summary.htm