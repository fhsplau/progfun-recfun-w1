package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {

    def calcRow(rowNumber: Int, prevRow: List[Int]): List[Int] =
      if (rowNumber == r) prevRow else calcRow(rowNumber + 1, calc(List(0) ::: prevRow ::: List(0),List()))


    def calc(row: List[Int], output: List[Int]):List[Int] =
      if(row.length==1) output else calc(row.tail, output:::List(row.head+row(1)))

    if (c == 0 || c == r) 1 else calcRow(0, List(1))(c)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = ???

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
