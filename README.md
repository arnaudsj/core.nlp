core.nlp
========
[![Gitter](https://badges.gitter.im/Join Chat.svg)](https://gitter.im/arnaudsj/core.nlp?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

core.nlp provides natural language processing as a language extension for Clojure

The central objective of `core.nlp` is to make natural language processing
idiomatic, productive, elegant and fast within the Clojure environment.

```clojure
(tokenize "a quick fox jumps")

=> ["a" "quick" "fox" "jumps"]

```

Key goals of `core.nlp`:

 - Provide a clear, standard API / abstraction for **NLP processing and analysis** in Clojure
 - Enable **pluggable** support for different underlying NLP library implementations
 - Provide a general purpose pure clojure implementation (pure-nlp)
 - Provide a **foundation** library for other projects
 - Enable **high performance** and *scalable* NLP processing
 - Work with **big data** platforms such as Apache Spark, Storm or Hadoop

### Getting Started

To use `core.nlp`, you can get the latest released version from Clojars:

 - https://clojars.org/me.arnaudsj/core.nlp

[![Clojars Project](http://clojars.org/me.arnaudsj/core.nlp/latest-version.svg)](http://clojars.org/me.arnaudsj/core.nlp)

### Documentation

For `core.nlp` documentation and further examples see:

 - http://arnaudsj.github.io/core.nlp

### Status

`core.nlp` is currently under heavy development and only in its infancy, so use it at your own risks!

[![Build Status](https://travis-ci.org/arnaudsj/core.nlp.svg)](https://travis-ci.org/arnaudsj/core.nlp)

### Contributing

All contributions and ideas are welcome!

Bug, feature and enhancement request should be listed here:

 - https://github.com/arnaudsj/core.nlp/issues?state=open

For a more agile like view of the work of our team, please check out the Huboard:

 - https://huboard.com/arnaudsj/core.nlp

Discussions related to core.nlp generally take place on the "core.nlp" group:

 - https://groups.google.com/forum/?fromgroups#!forum/core-nlp

Or alternatively on the IRC Channel #core.nlp on irc.freenode.org


### Thanks YourKit!

YourKit supports open source projects with its full-featured Java Profiler.
YourKit, LLC is the creator of [YourKit Java Profiler](http://www.yourkit.com/java/profiler/index.jsp)
and [YourKit .NET Profiler](http://www.yourkit.com/.net/profiler/index.jsp),
innovative and intelligent tools for profiling Java and .NET applications.

### License

This library made open-source by Opinionlab

Copyright (C) 2014 Opinionlab

Distributed under the Eclipse Public License, the same as Clojure.


