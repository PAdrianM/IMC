package com.adriang.androidkotlin.sintaxis

fun main(){

    //Indice 0-6
    //Tamnio 7
    val weekDays= arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    val numberToThen = arrayOf(1,2,3,4,5,6,7,8,9,10)

    //tamanios
    println(weekDays.size)

    //Modificar un arreglo
    weekDays[0] = "Monday"
    println(weekDays[0])

    //Bucles para recorrer arreglos

    for (position in weekDays.indices){ //Esta es una forma de dar la posicion por cada uno de los indices
        println("He pasado por aqui $position")
        println(weekDays[position]) //De esta manera accedo a mi arreglo y recorrerlo
    }

    //Otro ejemplo
    for ((position, value ) in weekDays.withIndex()){  //Esto me da la posicion y el valor
        println("La posicion $position, contiene $value")
    }

    for (weekDay in weekDays){  //Si quiero saber el valor
        println("Ahora es $weekDay")
    }

}