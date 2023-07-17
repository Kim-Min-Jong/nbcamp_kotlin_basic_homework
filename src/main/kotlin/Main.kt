import java.io.*
fun main() {
    while(true) {
        println("숫자 두 개를 띄어서 입력해주세요 ex)1 3 (숫자에 -1을 포함하면 종료됩니다.)")
        println("가능한 연산은 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 구하기 입니다.")
        val br = System.`in`.bufferedReader()
        val (a, b) = br.readLine().split(" ").map{it.toDouble()}
        if(a == -1.0 || b == -1.0 )
            break

        val operator = br.readLine()
        val calc = Calculator(a,b)
        val result = calc.operation(operator)

        if(result == 0.0)
            continue
        else
            println("$a $operator ${b}의 결과는 $result")

    }
}