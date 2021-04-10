package com.example.collections

fun main() {
    val joao = Funcionarios("João", 2000.0, "CLT")
    val maria = Funcionarios("Maria", 1000.0, "PJ")
    val jose = Funcionarios("Jose", 4000.0, "CLT")

    val funcionario1 = setOf(joao, maria)
    val funcionario2 = setOf(jose)

    val resultUnion = funcionario1.union(funcionario2)
    resultUnion.forEach { println(it) }

    println("--------------------")
    val funcionario3 = setOf(joao, maria, jose)
    val resultSubtract = funcionario3.subtract(funcionario2)
    resultSubtract.forEach { println(it) }

    println("--------------------")
    val resultIntersect = funcionario3.intersect(funcionario2)
    resultIntersect.forEach { println(it) }
}
