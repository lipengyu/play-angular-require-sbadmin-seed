// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository
resolvers += "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/"

// Use the Play sbt plugin for Play projects

//addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.3.8")
//
//addSbtPlugin("com.typesafe.sbt" % "sbt-jshint" % "1.0.1")
//
//addSbtPlugin("com.typesafe.sbt" % "sbt-less" % "1.0.0")
//
//addSbtPlugin("com.typesafe.sbt" % "sbt-rjs" % "1.0.1")
//
//addSbtPlugin("com.typesafe.sbt" % "sbt-digest" % "1.0.0")
//
//addSbtPlugin("com.typesafe.sbt" % "sbt-gzip" % "1.0.0")
//
//addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.0.0")

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.4.2")

addSbtPlugin("com.typesafe.sbt" % "sbt-jshint" % "1.0.3")

addSbtPlugin("com.typesafe.sbt" % "sbt-less" % "1.0.6")

addSbtPlugin("com.typesafe.sbt" % "sbt-rjs" % "1.0.7")

addSbtPlugin("com.typesafe.sbt" % "sbt-digest" % "1.1.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-gzip" % "1.0.0")

addSbtPlugin("net.ground5hark.sbt" % "sbt-concat" % "0.1.8")

addSbtPlugin("net.ground5hark.sbt" % "sbt-css-compress" % "0.1.3")

// This plugin automatically refreshes Chrome when you make changes to your app
//addSbtPlugin("com.jamesward" %% "play-auto-refresh" % "0.0.11")