package operation

class ModularOperation: AbstractOperation() {
    override fun operate(num1: Double, num2: Double): Double = num1 % num2
}