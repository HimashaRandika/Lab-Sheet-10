object Q2 {
  def countLetterOccurrences(words: List[String]): Int = {
    val totalLetterCount = words.map(_.length).reduce(_ + _)
    totalLetterCount
  }

  def main(args: Array[String]): Unit = {
    val inputWords = List("apple", "banana", "cherry", "date")
    val totalLetterCount = countLetterOccurrences(inputWords)
    println(s"Total count of letter occurrences: $totalLetterCount")
  }
}
