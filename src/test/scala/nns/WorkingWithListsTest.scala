package nns

import org.scalatest.FunSuite

class WorkingWithListsTest extends FunSuite {
  test("P01:Listの最後の要素を返す") {
    assert(WorkingWithLists.last(List(1, 1, 2, 3, 5, 8)) == 8)
  }

  test("P02:Listの最後の1つ前の要素を返す") {
    assert(WorkingWithLists.penultimate(List(1, 1, 2, 3, 5, 8)) == 5)
  }

  test("P03:Listのn番目の要素を返す") {
    assert(WorkingWithLists.nth(2, List(1, 1, 2, 3, 5, 8)) == 2)
  }

  test("P04:Listの要素数を返す") {
    assert(WorkingWithLists.length(List(1, 1, 2, 3, 5, 8)) == 6)
  }

  test("P05:Listを反転する") {
    assert(WorkingWithLists.reverse(List(1, 1, 2, 3, 5, 8)) == List(8, 5, 3, 2, 1, 1))
  }

  test("P06:Listが回文か調べる") {
    assert(WorkingWithLists.isPalindrome(List(1, 2, 3, 2, 1)))
  }

  test("P07:ネストしたListを平らにする") {
    assert(WorkingWithLists.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) == List(1, 1, 2, 3, 5, 8))
  }

  test("P08:Listから重複を取り除く") {
    assert(WorkingWithLists.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List('a, 'b, 'c, 'a, 'd, 'e))
  }

  test("P09:Listの重複をサブリストにまとめる") {
    pending
    //assert(WorkingWithLists.pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
  }

  test("P10:Listのランレングスエンコーディング") {
    pending
    //assert(WorkingWithLists.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }

  test("P11:ランレングスエンコーディングの修正") {
    pending
    //assert(WorkingWithLists.encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e)))
  }

  test("P12:ランレングスエンコードされたListのデコード") {
    pending
    //assert(WorkingWithLists.decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) == List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }

  test("P13:ランレングスエンコーディング") {
    pending
    //assert(WorkingWithLists.encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }

  test("P14:Listの要素を二重にする") (pending)

  test("P15:Listの要素を与えられた数に複製する") (pending)

  test("P16:与えられた数毎にListからドロップする") (pending)

  test("P17:Listを二つに分ける") (pending)

  test("P18:Listを切り取る") (pending)

  test("P19:ListをN個左にローテーションする") (pending)

  test("P20:K番目をListから外す") (pending)

  test("P21:Listのある場所に要素を挿入する") (pending)

  test("P22:rangeを与えてListを作る") (pending)

  test("P23:Listからランダムに選択する") (pending)

  test("P24:Lotto") (pending)

  test("P25:Listランダムに並び替える") (pending)

  test("P26:指定した要素数の組み合わせList") (pending)

  test("P27:互いに素なグループに分ける") (pending)

  test("P28:サブリストの長さに応じてリストをソートする") (pending)
}
