//atv5-Faça um Programa que converta metros para centímetros.//
fun main() {
    println("Digite quantos metros: ")
    val metros = readLine()!!.toInt()
    val cent = metros * 100
    println("$metros metros = $cent centímetros")
}
