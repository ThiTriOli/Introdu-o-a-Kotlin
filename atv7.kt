//atv7-Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário//
fun main() {
    println("Digite o lado: ")
    val lado = readLine()!!.toInt()
    val area = lado*lado
    val resultado= area*2
    println("O dobro da área é $resultado")
}
