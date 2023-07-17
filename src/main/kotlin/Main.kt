import operation.*
import java.io.*

fun main() {
    while (true) {
        try {
            println("숫자 두 개를 띄어서 입력해주세요 ex)1 3 (숫자에 -1을 포함하면 종료됩니다.)")
            println("가능한 연산은 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 구하기 입니다.")
            val br = System.`in`.bufferedReader()
            val (a, b) = br.readLine().split(" ").map { it.toDouble() }
            if (a == -1.0 || b == -1.0)
                break

            val operator = br.readLine()
            val calc = Calculator(a, b)
            var result = 0.0

            when (operator) {
                "+" -> {
                    val addOp: AbstractOperation = AddOperation()
                    calc.setOperation(addOp)
                    result = calc.operate()
                }

                "-" -> {
                    val subOp: AbstractOperation = SubtractOperation()
                    calc.setOperation(subOp)
                    result = calc.operate()
                }

                "*" -> {
                    val mulOp: AbstractOperation = MultiplyOperation()
                    calc.setOperation(mulOp)
                    result = calc.operate()
                }

                "/" -> {
                    val divOp: AbstractOperation = DivideOperation()
                    calc.setOperation(divOp)
                    result = calc.operate()
                }

                else -> {
                    println("잘못된 연산자입니다.")
                }
            }

            if (result.equals(0.0))
                continue
            else
                println("$a $operator ${b}의 결과는 $result")
        } catch (e: Exception) { // 좋은 방법이라 생각하진 않지만 일단 입력 오류 방지
            continue
        }
    }
}