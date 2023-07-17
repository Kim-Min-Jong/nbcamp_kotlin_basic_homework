import operation.AddOperation
import operation.DivideOperation
import operation.MultiplyOperation
import operation.SubtractOperation

class Calculator(
    private val operand1: Double,
    private val operand2: Double
) {
    fun addOperation(addOperation: AddOperation): Double = addOperation.operate(operand1, operand2)
    fun subOperation(subOperation: SubtractOperation): Double = subOperation.operate(operand1, operand2)
    fun mulOperation(mulOperation: MultiplyOperation): Double = mulOperation.operate(operand1, operand2)
    fun divOperation(divideOperation: DivideOperation): Double = divideOperation.operate(operand1, operand2)
}