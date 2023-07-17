import operation.*

data class Calculator(
    private val operation: AbstractOperation,
    private val operand1: Double,
    private val operand2: Double
) {

    fun operate() = operation.operate(operand1, operand2)

}