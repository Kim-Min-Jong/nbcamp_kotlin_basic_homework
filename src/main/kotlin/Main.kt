import operation.*
import java.io.*

fun main() {
    while (true) {
        try {
            println("계산 모드를 선택해주세요 !")
            println("숫자 두 개를 띄어서 입력해주세요 ex)1 3 (숫자에 -1을 포함하면 종료됩니다.)")
            val br = System.`in`.bufferedReader()
            val (a, b) = br.readLine().split(" ").map { it.toDouble() }
            var result = 0.0
            lateinit var calc: Calculator

            if (a == -1.0 || b == -1.0)
                break
            println("어떤 연산할 할까요? 번호를 입력해주세요! 1)덧셈 2)뺄셈 3)곱셈 4)나눗셈 5)나머지")
            val operator = br.readLine().toInt()
            var operatorStr = ""
            when (operator) {
                1 -> {
                    val addOp: AbstractOperation = AddOperation()
                    calc = Calculator(addOp, a, b)
                    result = calc.operate()
                    operatorStr = "+"
                }

                2 -> {
                    val subOp: AbstractOperation = SubtractOperation()
                    calc = Calculator(subOp, a, b)
                    result = calc.operate()
                    operatorStr = "-"
                }

                3 -> {
                    val mulOp: AbstractOperation = MultiplyOperation()
                    calc = Calculator(mulOp, a, b)
                    result = calc.operate()
                    operatorStr = "*"
                }

                4 -> {
                    val divOp: AbstractOperation = DivideOperation()
                    calc = Calculator(divOp, a, b)
                    result = calc.operate()
                    operatorStr = "/"
                }
                5 -> {
                    val modularOp: AbstractOperation = ModularOperation()
                    calc = Calculator(modularOp, a, b)
                    result = calc.operate()
                    operatorStr = "%"
                }
                else -> {
                    println("잘못된 연산자입니다.")
                }
            }
            println("$a $operatorStr ${b}의 결과는 $result")
        } catch (e: Exception) { // 좋은 방법이라 생각하진 않지만 일단 입력 오류 방지
            println("잘못된 입력입니다.")
            continue
        }
    }
}