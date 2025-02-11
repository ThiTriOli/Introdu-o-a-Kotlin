//atv9//
fun main() {
    println("Digite o valor em Fahrenheit: ")
    val F = readLine()!!.toDouble()
    val C = 5.0 / 9.0 * (F - 32)
    println("Em Celsius: $C")
}