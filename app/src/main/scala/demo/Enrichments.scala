package demo

object Enrichments {
  implicit class IntImprovements(num: Int) {
    def increment = num + 1

    def double: Int = num * 2

    def stringify = num.toString
  }
}
