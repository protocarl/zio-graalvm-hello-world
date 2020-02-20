name := "zio-graalvm-hello-world"

version := "0.1"

scalaVersion := "2.13.1"

resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies += "dev.zio" %% "zio" % "1.0.0-RC17+421-424ddcd4-SNAPSHOT"

enablePlugins(GraalVMNativeImagePlugin)

graalVMNativeImageGraalVersion := Some("20.0.0-java11")

graalVMNativeImageOptions ++= Seq(
  "--no-fallback",
  "--initialize-at-build-time",
  "--enable-http",
  "--enable-https",
  "--enable-all-security-services"
)
