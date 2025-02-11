
//atv4//
fun main() {
    println("Digite a primeira nota: ")
    val nota01 = readLine()!!.toInt()
    println("Digite a segunda nota: ")
    val nota02 = readLine()!!.toInt()
    println("Digite a terceira nota: ")
    val nota03 = readLine()!!.toInt()
    println("Digite a quarta nota: ")
    val nota04 = readLine()!!.toInt()
    val soma = nota01+nota02+nota03+nota04
    val media= soma/4
    println("A média das notas é : $media")
}