//atv3-Faça um Programa que peça dois números e imprima a soma.//
fun main() {
    println("Digite o primeiro número: ")
    val numero01 = readLine()!!.toInt()
    println("Digite o segundo número: ")
    val numero02 = readLine()!!.toInt()
    val soma = numero02 + numero01
    println("A soma foi $soma")
}
