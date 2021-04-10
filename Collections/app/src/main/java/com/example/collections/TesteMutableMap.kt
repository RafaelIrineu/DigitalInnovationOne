package com.example.collections

fun main() {
    val joao = Funcionarios("João", 2000.0, "CLT")
    val maria = Funcionarios("Maria", 1000.0, "PJ")
    val jose = Funcionarios("Jose", 4000.0, "CLT")

    val repositorio = Repositorio<Funcionarios>()

    repositorio.create(joao.nome, joao)
    repositorio.create(maria.nome, maria)
    repositorio.create(jose.nome, jose)

    println(repositorio.findById(joao.nome))

    println("----------------------")
    repositorio.findAll().forEach { println(it) }

    repositorio.remove(joao.nome)
    println("----------------------")
    repositorio.findAll().forEach { println(it) }
}