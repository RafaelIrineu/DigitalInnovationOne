package com.example.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val maria = Funcionario("Maria", 1000.0, "PJ")
    val jose = Funcionario("Jose", 4000.0, "CLT")

    val funcionarios = listOf(joao, maria, jose)

    funcionarios.forEach { println(it) }

    println("--------------------")
    println(funcionarios.find { it.nome == "Maria" })

    println("--------------------")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("--------------------")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }


}


data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String =
        """
            Nome:       $nome
            Salário:    $salario
        """.trimIndent()
}