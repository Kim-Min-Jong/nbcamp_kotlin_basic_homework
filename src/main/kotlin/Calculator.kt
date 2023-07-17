class Calculator(
    private val operand1: Double,
    private val operand2: Double
) {
    fun operation(operator: String): Double = when(operator) {
        "+" -> (operand1 + operand2)
        "-" -> (operand1 - operand2)
        "*" -> (operand1 * operand2)
        "/" -> (operand1 / operand2)
        else -> {
            println("잘못된 연산자입니다!")
            0.0
        }
    }
}