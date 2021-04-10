package com.example.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios) {
        println(salario)
    }

    println("----------------")
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Média salarial: ${salarios.average()}")

    val salarioMaiorQue = salarios.filter { it > 2500.0 }
    println("----------------")
    salarioMaiorQue.forEach { println(it) }

    println("----------------")
    println(salarios.count { it in 2000.0..5000.0 })

    println("----------------")
    println(salarios.find { it == 2250.0 })
    println(salarios.find { it == 500.0 })

    println("----------------")
    println(salarios.any { it == 1000.0 })
    println(salarios.any { it == 1500.0 })
    println(salarios.any { it > 900.0 })
}