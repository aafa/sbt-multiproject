import android.Keys._
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

    libraryDependencies += aar("com.android.support" % "multidex" % "1.0.1"),
    libraryDependencies += "org.scaloid" %% "scaloid" % "3.6.1-10"
  )

}
