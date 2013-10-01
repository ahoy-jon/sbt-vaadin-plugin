libraryDependencies ++= Seq(
  "com.vaadin" % "vaadin-client-compiler" % "7.1.6" % "provided"
)

vaadinSettings

javaOptions in compileWidgetsets := Seq("-Xss8M", "-Xmx512M", "-XX:MaxPermSize=512M")