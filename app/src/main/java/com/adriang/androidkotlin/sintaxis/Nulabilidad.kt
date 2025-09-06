package com.adriang.androidkotlin.sintaxis

fun main(){

    var name:String? = null

    //!! Con 2 signos de admiracion le dices a la maquina que estas seguro que no es nulo
    //println(name!![0]) //Se puede acceder a un fragmento del string, posicion 0 "A"



    println(name?.get(3) ?: "Es nulo pendejo")
    //Nulabilidad, ?
}