[![Build Status](https://travis-ci.org/dcoxall/learning-spring.svg?branch=master)](https://travis-ci.org/dcoxall/learning-spring)

learning-spring
===============

To help me learn Java and the Swing framework I choose to build a basic web
application to give me a good idea of how everything works.

Development
-----------

learning-spring was created to run in a container and so has been configured to
work using the [fig] development tool.

To get started run:

    $ fig up

Running the tests (through fig)
-------------------------------

    $ fig run app "./gradlew" test

Running the tests (without fig)
-------------------------------

    $ ./gradlew test

[fig]: http://www.fig.sh
