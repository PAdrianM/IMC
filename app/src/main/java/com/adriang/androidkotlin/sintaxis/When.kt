package com.adriang.androidkotlin.sintaxis

fun main(){

    getSemester(3)
}


fun getMonth(month:Int){

    when(month){
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Octubre")
        11 -> {
            //Puedo escribir mas codigo poniendo llaves
            println("Noviembre")
        }
        12 -> println("Diciembre")
        else -> println("Ingrese un mes correcto")
    }
}

fun getTrimester(month: Int){

    when(month){
        1, 2, 3 -> println("Primer Trimestre")
        4, 5, 6 -> println("Segundo Trimestre")
        7, 8, 9 -> println("Tercer Trimestre")
        10, 11, 12 -> println("Cuarto Trimestre")
        else -> println("Ingrese un trimestre valido")
    }
}

fun getSemester(month: Int):String{

    val result = when(month){
        in 1..6 ->  "Primer Semestre"
        in 7..12 ->  "Segundo Semestre" //Se usan rangos in 8..870
        !in 1..12 ->  "Ingrese un semestre valido" // Hay ciertos terminos a los que se les puede poner un negativo
        else ->  "dadasd"
    }
    return result
}

fun result(value:Any){

    when(value){
        is Int -> value + value
        is String -> println(value)
        is Boolean -> if(value) println("Holiwi")
    }
}