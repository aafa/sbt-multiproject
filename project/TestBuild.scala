import android.Keys._
import android.protify.Keys._
import sbt.Keys._
import sbt._

object TestBuild extends Build {


  lazy val root = {
    Project(id = "root", base = file(".")).settings(android.Plugin.androidCommands: _*)
  } aggregate(app, core)

  lazy val core: Project = Project(id = "core", base = file("core")) settings (android.Plugin.androidBuildApklib ++ Seq(
  ) ++ Dependencies.libs ++ commonSettings: _*)


  lazy val app: Project = Project(id = "app", base = file("apps/app")) settings (appsSettings: _*) dependsOn core

  lazy val appsSettings = android.Plugin.androidBuild ++ commonSettings ++ protifySettings ++ Seq(
    localProjects in Android += LibraryProject(core.base),
    transitiveAndroidLibs in Android := false,

    run <<= run in Android,
    install <<= install in Android,

//    dexMulti in Android := true,
//    dexMainFileClasses in Android := Settings.dexFiles,

    useProguard in Android := proguard,
    proguardScala in Android := proguard,
    useProguardInDebug in Android := proguard,

    proguardCache in Android ++= Settings.proguardCache,
    proguardOptions in Android ++= Settings.proguardCommons,

    dexMaxHeap in Android := "4G",
    apkbuildExcludes in Android ++= Settings.apkExcludeStrings
  )

  private val proguard: Boolean = true


  lazy val commonSettings = Seq(
    scalaVersion := Versions.scalaVersion,
    platformTarget in Android := Versions.platformTarget,
    minSdkVersion in Android := "21"
  )


}
