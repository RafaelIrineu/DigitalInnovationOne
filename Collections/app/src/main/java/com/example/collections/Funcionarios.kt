package com.example.collections

data class Funcionarios(
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
