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
