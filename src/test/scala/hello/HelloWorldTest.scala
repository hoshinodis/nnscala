package hello

import org.scalatest.FunSuite

class HelloWorldTest extends FunSuite {
  test("与えられたSeqの奇数にnum_をつけてそれのみを返す") {
    val ip = new IntroductionProblem
    assert(ip.addNumToOdd(Seq(1,2,3)) == Seq("num_1", "num_3"))
  }
}
