

object Settings {


  lazy val dexFiles: Seq[String] = io.Source.fromFile("core/main-dex-list.txt").getLines().toSeq

  lazy val apkExcludeStrings: Seq[String] = Seq(
    "META-INF/LICENSE.txt",
    "META-INF/LICENSE",
    "META-INF/NOTICE.txt",
    "META-INF/NOTICE",
    ".readme",
    "reference.conf"
  )

  lazy val proguardCommons = io.Source.fromFile("project/proguard.pro").getLines().toSeq

  lazy val proguardCache = Seq(
    "org.scaloid"
  )
}
