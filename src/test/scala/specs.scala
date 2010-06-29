package runcible.test.specs

import org.specs._
import runcible.test.monsters.{Monstrosity, Syndicate}
import runcible.annotation.{BeanMethods, Scalify}

@Scalify(classOf[Monstrosity])
@BeanMethods
class Fluffy

object RuncibleSpecTest extends Specification {
  detailedDiffs()

  "a monstrosity" should {
    "allow itself to be configured" in {}
    "frobnicate configured values" in {}
  }

  "a syndicate" should {
    "rake in a number of monstrosities" in {}
    "produce combined output of multiple frobnications" in {}
  }
}
