//atv8-Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.//
fun main() {
    println("Digite o valor por hora: ")
    val valorH = readLine()!!.toInt()
    println("Digite quantas horas trabalhadas: ")
    val numeroH = readLine()!!.toInt()
   val salario = valorH*numeroH
    println("O salario é $salario")
}
