# zio-graalvm-hello-world
zio hello world example compiled with graalvm

# compile
`sbt graalvm-native-image:packageBin`

# run
`docker run -it -v $(pwd)/target:/target oracle/graalvm-ce:20.0.0-java11 /target/graalvm-native-image/zio-graalvm-hello-world`
