//atv8//
fun main() {
    println("Digite o valor por hora: ")
    val valorH = readLine()!!.toInt()
    println("Digite quantas horas trabalhadas: ")
    val numeroH = readLine()!!.toInt()
   val salario = valorH*numeroH
    println("O salario é $salario")
}