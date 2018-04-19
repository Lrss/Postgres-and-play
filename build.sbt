name := "PostgresAndPlay"
 
version := "1.0" 
      
lazy val `postgresandplay` = (project in file(".")).enablePlugins(PlayScala)
      
scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  jdbc , ehcache , ws , specs2 % Test , guice ,

  // Web libraries
  "org.webjars" % "bootstrap" % "3.1.+" exclude("org.webjars", "jquery"),
  "org.webjars" % "jquery"    % "3.2.0"
)

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

      