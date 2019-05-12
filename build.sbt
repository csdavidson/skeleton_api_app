name := """play-scala-seed"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.8"

crossScalaVersions := Seq("2.12.8", "2.11.12")

// Note: using PostgreSQL 10.6.0.0

libraryDependencies ++= Seq(
	guice,

	// Scalike JDBC and friends
	"org.scalatestplus.play"    %% "scalatestplus-play"     % "4.0.2"       % Test      ,
	"org.scalikejdbc"           %% "scalikejdbc"            % "3.3.2"                   ,
	"org.scalikejdbc"           %% "scalikejdbc-test"       % "3.3.2"       % "test"    ,
	"org.scalikejdbc"           %% "scalikejdbc-config"     % "3.3.2"                   ,
	"com.h2database"            %  "h2"                     % "1.4.197"                 ,
	"ch.qos.logback"            %  "logback-classic"        % "1.2.3"                   ,
	"ch.qos.logback"            %  "logback-classic"        % "1.2.3"                   ,
	"org.postgresql"            % "postgresql"              % "42.2.5"                  ,
)

