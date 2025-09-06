package com.adriang.androidkotlin.sintaxis

fun main(){

    mutableList()

}

fun inmutableList(){

    //Declarar una lista
    val readOnly:List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    println(readOnly.size) // Tamanio
    println(readOnly) // Accedo a la lista
    println(readOnly[0]) // Accedo a la posicion especifica de esa lista
    println(readOnly.last()) // Accedo a la ultima posicion con .last
    println(readOnly.first()) // Accedo a la primera posicion con .first

    val example = readOnly.filter { it.contains("V") } // "it" iteramos y que nos filtre las que contienen v

    println(example)

    readOnly.forEach { weekDay -> println(weekDay) }
}

fun mutableList(){

    var weekDays: MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    println(weekDays)

    weekDays.add(0,"AdrianDay")
    println(weekDays)

    if (weekDays.isEmpty()){

        //No se pintara nada porque no esta vacia
    } else{
        weekDays.forEach { println(it) }
    }

    if (weekDays.isNotEmpty()){
        weekDays.forEach { println(it) }
    }

    weekDays.last()
}