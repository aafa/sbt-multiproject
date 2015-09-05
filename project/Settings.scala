import android.Keys._
import sbt._
import Keys._

object Settings {


  lazy val dexFiles: Seq[String] = Seq(
    "android/support/multidex/BuildConfig.class",
    "android/support/multidex/MultiDex$V14.class",
    "android/support/multidex/MultiDex$V19.class",
    "android/support/multidex/MultiDex$V4.class",
    "android/support/multidex/MultiDex.class",
    "android/support/multidex/MultiDexApplication.class",
    "android/support/multidex/MultiDexExtractor$1.class",
    "android/support/multidex/MultiDexExtractor.class",
    "android/support/multidex/ZipUtil$CentralDirectory.class",
    "android/support/multidex/ZipUtil.class",
    "com/android/test/runner/MultiDexTestRunner.class"
  )

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
