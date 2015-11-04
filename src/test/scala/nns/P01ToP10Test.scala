package nns

import org.scalatest.FunSuite

class P01ToP10Test extends FunSuite {
  test("P01:Listの最後の要素を返す") {
    assert(P01ToP10.last(List(1, 1, 2, 3, 5, 8)) == 8)
  }

  test("P02:Listの最後の1つ前の要素を返す") {
    assert(P01ToP10.penultimate(List(1, 1, 2, 3, 5, 8)) == 5)
  }

  test("P03:Listのn番目の要素を返す") {
    assert(P01ToP10.nth(2, List(1, 1, 2, 3, 5, 8)) == 2)
  }

  test("P04:Listの要素数を返す") {
    assert(P01ToP10.length(List(1, 1, 2, 3, 5, 8)) == 6)
  }

  test("P05:Listを反転する") {
    assert(P01ToP10.reverse(List(1, 1, 2, 3, 5, 8)) == List(8, 5, 3, 2, 1, 1))
  }

  test("P06:Listが回文か調べる") {
    assert(P01ToP10.isPalindrome(List(1, 2, 3, 2, 1)))
  }

  test("P07:ネストしたListを平らにする") {
    assert(P01ToP10.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) == List(1, 1, 2, 3, 5, 8))
  }

  test("P08:Listから重複を取り除く") {
    assert(P01ToP10.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List('a, 'b, 'c, 'a, 'd, 'e))
  }

  test("P09:Listの重複をサブリストにまとめる") {
    assert(P01ToP10.pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
  }

  test("P10:Listのランレングスエンコーディング") {
    assert(P01ToP10.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }
}
