package com.example.collections

fun main() {
    val nomes = Array(3) { "" }
    nomes[0] = "Maria"
    nomes[1] = "João"
    nomes[2] = "José"

    for (nome in nomes) {
        println(nome)
    }

    val nomes2 = arrayOf("Maria", "João", "José")
    nomes2.sort()
    nomes2.forEach { println(it) }
}