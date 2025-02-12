//atv6-Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.//
fun main() {
    println("Digite o raio: ")
    val raio = readLine()!!.toDouble()
    val area = (raio*raio)*3.14
    println("Área do círculo é: $area")
}
