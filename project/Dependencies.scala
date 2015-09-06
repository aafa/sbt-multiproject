import sbt.Keys._
import sbt._

object Dependencies {

  lazy val resolverUrls =
    Seq(
      Resolver.mavenLocal,
      DefaultMavenRepository
    )

  lazy val libs: Seq[sbt.Setting[_]] = Seq (

    unmanagedBase := baseDirectory.value / "libs",

    resolvers ++= resolverUrls,

    libraryDependencies += "com.android.support" % "multidex" % "1.0.1",
    libraryDependencies += "com.hanhuy.android" % "protify-agent" % "0.6",
    libraryDependencies += "org.scaloid" %% "scaloid" % "3.6.1-10"
  )

}