-ignorewarnings
-dontobfuscate
-dontoptimize
-dontpreverify
-verbose
#-printseeds  logs/printseeds
#-printusage  logs/printusage

-keep class scala.Dynamic
-keepattributes *Annotation*
-keepattributes EnclosingMethod
-keepattributes Signature

-keep class com.test.** { *; }

-keep class retrofit.** { *; }
-keep class com.fasterxml.jackson.** { *; } # .databind, .scala ???
-keepclasseswithmembers class * { @retrofit.http.* <methods>; }
-keep class org.bouncycastle.** { *; }
-keep class com.android.volley.** { *; }

#-keep class scala.reflect.** { *; }
#-keep class java.lang.reflect.** { *; }
#-keep class macroid.** { *; }
-keep class org.sqldroid.** { *; }
-keep class com.typesafe.slick.** { *; }
-keep class android.** { *; }