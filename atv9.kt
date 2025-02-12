//atv9-Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.//
fun main() {
    println("Digite o valor em Fahrenheit: ")
    val F = readLine()!!.toDouble()
    val C = 5.0 / 9.0 * (F - 32)
    println("Em Celsius: $C")
}
