resolvers += "Artifactory" at "https://artifactory.non-prod.g-rockers.equalexperts.io/artifactory/scala"

addSbtPlugin("gg.gov.revenue" % "sbt-release" % "7.5.0")

addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.3")

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "1.1")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.0")

