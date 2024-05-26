import mill._, scalalib._

import $ivy.`com.goyeau::mill-scalafix::0.4.0`
import com.goyeau.mill.scalafix.ScalafixModule
import mill.scalalib._

object $name$ extends RootModule with ScalaModule with ScalafixModule {
  def scalaVersion = "3.3.3"

  def ivyDeps = Agg(
    ivy"com.outr::scribe::3.13.5"
  )

  def scalacOptions =
    Seq("-Wunused:all", "-feature", "-deprecation")

}
