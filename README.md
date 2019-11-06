# fibonacci-java

[![Build Status](https://travis-ci.org/xaoc-303/fibonacci-java.svg?branch=master)](https://travis-ci.org/xaoc-303/fibonacci-java)

## recursive if-else

| v | # | 30 | 35 | 40 | 45 |
| --- | --- | --- | --- | --- | --- |
| 1.8.0_192 | [Java](./src/fibo/Fibo.java) (compiled) | 0,01626378 | 0,05006661 | 0,41549475 | 4,47823378 |
| | [Total](https://github.com/xaoc-303/fibonacci) | | | | |

## optimization

| v | # | 30 | 35 | 40 | 45 |
| --- | --- | --- | --- | --- | --- |
| 1.8.0_192 | [Java](./src/fibo/Fibo.java) (compiled) | 0,01183933 | 0,01229628 | 0,01198657 | 0,01203628 |
| | [Total](https://github.com/xaoc-303/fibonacci) | | | | |

## run

```
javac -d out src/fibo/Fibo.java
time java -cp ./out fibo.Fibo f1 30
time java -cp ./out fibo.Fibo f2 30
```

```
curl https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.5.2/junit-platform-console-standalone-1.5.2.jar --output junit.jar --silent

javac -d out src/fibo/*
javac -d out -cp out:junit.jar tests/fibo/*
java -jar junit.jar --class-path out --scan-class-path
```
