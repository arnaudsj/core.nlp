---
layout: tutorial
title: Welcome
---

### Why core.nlp?

core.nlp provides natural language processing as a language extension for Clojure

The central objective of `core.nlp` is to make natural language processing
idiomatic, productive, elegant and fast within the Clojure environment.

{% highlight clojure %}
(tokenize "a quick fox jumps")

=> ["a" "quick" "fox" "jumps"]
{% endhighlight %}

Key goals of `core.nlp`:

 - Provide a clear, standard API / abstraction for **NLP processing and analysis** in Clojure
 - Enable **pluggable** support for different underlying NLP library implementations
 - Provide a general purpose pure clojure implementation (pure-nlp)
 - Provide a **foundation** library for other projects
 - Enable **high performance** and *scalable* NLP processing
 - Work with **big data** platforms such as Apache Spark, Storm or Hadoop

### Getting Started

To use `core.nlp`, you can get the latest released version from Clojars:

 - [https://clojars.org/me.arnaudsj/core.nlp](https://clojars.org/me.arnaudsj/core.nlp)

### Documentation

For `core.nlp` documentation and further examples see:

 - [https://arnaudsj.github.io/core.nlp](https://arnaudsj.github.io/core.nlp)

### Status

`core.nlp` is currently under heavy development and only in its infancy, so use it at your own risks!

[![Build Status](https://travis-ci.org/arnaudsj/core.nlp.svg)](https://travis-ci.org/arnaudsj/core.nlp)

### Contributing

All contributions and ideas are welcome!

Bug, feature and enhancement request should be listed here:

 - [https://github.com/arnaudsj/core.nlp/issues?state=open](https://github.com/arnaudsj/core.nlp/issues?state=open)

For a more agile like view of the work of our team, please check out the Huboard:

 - [https://huboard.com/arnaudsj/core.nlp](https://huboard.com/arnaudsj/core.nlp)

Discussions related to core.nlp generally take place on the "core.nlp" group:

 - [https://groups.google.com/forum/?fromgroups#!forum/core-nlp](https://groups.google.com/forum/?fromgroups#!forum/core-nlp)

Or alternatively on the IRC Channel #core.nlp on irc.freenode.org

### License

This library made open-source by [Opinionlab, Inc.](http://www.opinionlab.com/)

Copyright (C) 2014 [Opinionlab, Inc.](http://www.opinionlab.com/)

Distributed under the Eclipse Public License, the same as Clojure.
