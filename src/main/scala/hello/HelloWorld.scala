package hello

class IntroductionProblem {
  def addNumToOdd(ls: Seq[Int]) = ls.withFilter(_ % 2 == 1).map("num_" + _)
}

object Main extends App {
  println("Hello world")
}