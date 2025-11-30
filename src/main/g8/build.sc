import mill._, scalalib._

import mill.scalalib._

object $name$ extends RootModule with ScalaModule {
  def scalaVersion = "3.7.4"

  def ivyDeps = Agg(
    ivy"com.outr::scribe::3.13.5"
  )

  def scalacOptions =
    Seq("-Wunused:all", "-feature", "-deprecation")

}
