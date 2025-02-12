//atv10- Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.//
fun main() {
    println("Digite o valor em Celsius: ")
    val C = readLine()!!.toDouble()
    val F = C * 1.8 + 32
    println("Em Fahrenheit: $F")
}
