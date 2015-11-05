package nns

//TODO:パターンマッチでも解く
object WorkingWithLists {
  def last[A](ls: List[A]) = ls.last

  def penultimate[A](ls: List[A]) = ls.init.last

  def nth[A](n: Int, ls: List[A]) = ls(n)

  def length[A](ls: List[A]) = ls.length

  def reverse[A](ls: List[A]) = ls.reverse

  def isPalindrome[A](ls: List[A]) = ls == ls.reverse

  def flatten[A](ls: List[A]): List[A] = ls

  def compress[A](ls: List[A]): List[A] = ls match {
    case Nil => Nil
    case h :: tail => h :: compress(tail.dropWhile(_ == h))
  }

  def pack[A](ls: List[A]): List[List[A]] = List(ls)

  def encode[A](ls: List[A]): List[List[A]] = List(ls)
}
