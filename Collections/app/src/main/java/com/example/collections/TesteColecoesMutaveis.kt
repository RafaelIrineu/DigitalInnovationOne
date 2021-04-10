package com.example.collections

fun main(){
    val joao = Funcionarios("João", 2000.0, "CLT")
    val maria = Funcionarios("Maria", 1000.0, "PJ")
    val jose = Funcionarios("Jose", 4000.0, "CLT")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("--------------------")
    funcionarios.add(jose)
    funcionarios.forEach { println(it) }

    println("--------------------")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("----------SET----------")
    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.forEach { println(it) }

    println("--------------------")
    funcionariosSet.add(jose)
    funcionariosSet.add(maria)
    funcionariosSet.forEach { println(it) }

    println("--------------------")
    funcionariosSet.remove(maria)
    funcionariosSet.forEach { println(it) }
}