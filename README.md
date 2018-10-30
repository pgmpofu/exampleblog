# Introduction

This project was developed as part of the requirements for completing the MongoDB for Java Developers Course (MJ101) facilitated by [MongoDB University](https://university.mongodb.com/). The course outcome was a simple example blog using boilerplate code provided by the university.

## Setting Up The Development Environment

1. Install the latest JDK. This can be downloaded [here](http://www.oracle.com/technetwork/java/javase/downloads).

2. Install IntelliJ IDEA. Note that any IDE is sufficient. This project was developed using IntelliJ IDEA which can be downloaded [here](https://www.jetbrains.com/idea/download).

3. Install the latest version of Maven. If you would like to perform a manual install, instructions can be found [here](https://maven.apache.org/install.html). To install using Homebrew on Mac follow [these](http://brewformulas.org/Maven) instructions.

4.  Add the SLF4J Simple Binding [library](https://mvnrepository.com/artifact/org.slf4j/slf4j-simple) and the SLF4J API [library](https://mvnrepository.com/artifact/org.slf4j/slf4j-api) to your pom.xml file. This is important for logging and can be ignored if there is no desire to see the logs.

5. Install MongoDB. Installation instructions can be found [here](https://docs.mongodb.com/manual/installation/). The download can be found [here](https://www.mongodb.com/download-center)

6. Add the Freemarker Templating Engine [library](https://freemarker.apache.org/freemarkerdownload.html) to your pom.xml file. This library will help to develop web pages easily.

## Running The Application
1. Navigate to the main class

2. Right click and select Run

3. Navigate to localhost:4547/[insert class name]
