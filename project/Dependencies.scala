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

    libraryDependencies += aar("com.google.android.gms" % "play-services" % "6.1.71"),
    libraryDependencies += aar("com.android.support" % "multidex" % "1.0.1"),
    libraryDependencies += aar("org.macroid" %% "macroid" % "2.0.0-M3"),
    libraryDependencies += aar("com.fortysevendeg" %% "macroid-extras" % "0.2"),
    libraryDependencies += aar("com.instabug.library" % "instabugsupport" % "1.2.1"),

    libraryDependencies += aar("com.android.support" % "multidex" % "1.0.1"),
    libraryDependencies += "com.hanhuy.android" % "protify-agent" % "0.6",
    libraryDependencies += "io.realm" % "realm-android" % "0.82.1",
    libraryDependencies += "com.github.nscala-time" %% "nscala-time" % "1.4.0",
    libraryDependencies += "org.scaloid" %% "scaloid" % "3.6.1-10"
  )

}
