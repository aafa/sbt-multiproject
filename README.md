
## Predex files collision in a multiproject setup



Steps to reproduce

1. First `run` to create proguard cache
2. Second `run` to create predex cache 
3. Change something in [project library](core/src/main/scala/com/test/core/activity/CoreMainActivity.scala)
4. Hitting `run` once more will get you exception
```
java.lang.IllegalArgumentException: Source /Users/aafa/Projects/github/sbt-multiproject/apps/app/target/android-bin/predex-libraries/classes-fea1db6a2e85fdeda8f2073688c847728e688fa4.jar/classes.dex and destination /Users/aafa/Projects/github/sbt-multiproject/apps/app/target/android-bin/predex-libraries/classes-fea1db6a2e85fdeda8f2073688c847728e688fa4.jar/classes.dex must be different
```

See full [console.log](console.log) for details