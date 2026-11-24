fun main() {
  val correctAnswer = 52
  val userAnswer = " 5 2 "
  val answerIsCorrect = userAnswer.replace(" ", "").toInt() == correctAnswer
  println(answerIsCorrect)
}
