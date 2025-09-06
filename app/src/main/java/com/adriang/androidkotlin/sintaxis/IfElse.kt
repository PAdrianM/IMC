package com.adriang.androidkotlin.sintaxis

fun main(){
//    ifBasico()
//    ifAnidado()
    ifBoolean()
    ifMultiple()
}

fun ifBasico(){
    val name = "Adrian"

    if (name.equals("Pepe")){
        println("La variable name es Adrian")
    } else {
        println("La variable es diferente de Adrian")
    }
}

fun ifAnidado(){

    val animal = "bird"
     if (animal.equals("dog")){
         println("Es un perro")
     } else if (animal.equals("cat")){
         println("Es un gato")
     } else if (animal.equals("bird")){
         println("Es un pajaro")
     } else if (animal.equals("")){
         println("no es ningun animal")
     }
}

fun ifBoolean(){

    val soyFeliz = true

    if (soyFeliz){
        println("Si soy feliz")
    } else
        println("No lo soy")
}

fun ifMultiple(){

    var age = 18
    var parentPermission = false
    var imHappy = true

    if (age.equals(18) || parentPermission && imHappy){
        println("Puedo beber una cerveza")
    }
}