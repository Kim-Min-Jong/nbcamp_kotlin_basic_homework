import operation.*

class Calculator(
    private val operand1: Double,
    private val operand2: Double
) {
    private lateinit var operation: AbstractOperation
    fun setOperation(operation: AbstractOperation) {
        this.operation = operation
    }
    fun operate() = operation.operate(operand1, operand2)

}