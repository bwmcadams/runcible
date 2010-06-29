package runcible.test.specs

import org.specs._
import org.specs.specification.PendingUntilFixed

import runcible.test.monsters.{Monstrosity, Syndicate}
import runcible.annotation.{BeanMethods, Scalify}

import scala.collection.JavaConversions._

@Scalify(classOf[Monstrosity])
@BeanMethods
class ScalaMonstrosity extends Monstrosity {
  override def getField1 = "wrong"
  override def frobnicate = "even worse"
}

object RuncibleSpecTest extends Specification with PendingUntilFixed {
  detailedDiffs
  shareVariables

  val ONE   = "ouch, scary"
  val TWO   = 123456
  val THREE = 1L :: 2L :: 3L :: Nil
  val FROB  = "ohai, " + ONE + " (" + TWO + "), but also [" + THREE.mkString(", ") + "]!"

  def what_a_monstrosity_does(monster: Monstrosity) = {
    "allow itself to be configured" in {
      monster.setField1(ONE)
      monster.setField2(TWO)
      monster.setField3(THREE.map(Long.box))

      monster.getField1 must_== ONE
      monster.getField2 must_== TWO
      monster.getField3.toList must containAll(THREE)
    }

    "frobnicate configured values" in {
      monster.frobnicate must_== FROB
    }
  }

  "a Java monstrosity" should {
    "be itself" in { what_a_monstrosity_does(new Monstrosity) }
  }

  "a more pleasant Scala monstrosity" should {
    "behave like its Java counterpart" in { what_a_monstrosity_does(new ScalaMonstrosity) }
  } pendingUntilFixed

  "a syndicate" should {
    "rake in a number of monstrosities" in {}
    "produce combined output of multiple frobnications" in {}
  }
}
