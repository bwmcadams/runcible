import sbt._

class RuncibleProject(info: ProjectInfo) extends DefaultProject(info) {
  val scala_tools_snapshots = "scala-tools snapshots" at "http://scala-tools.org/repo-snapshots"
  val scala_tools_releases = "scala-tools releases" at "http://scala-tools.org/repo-releases"
  val publishTo = Resolver.sftp("repobum", "ssh.phx.nearlyfreespeech.net", "/home/public/snapshots") as("repobum_repobum")

  val specs = "org.scala-tools.testing" %% "specs" % "1.6.5-SNAPSHOT" % "test->default"
}
