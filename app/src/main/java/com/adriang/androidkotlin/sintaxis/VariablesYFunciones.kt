package com.adriang.androidkotlin.sintaxis

//Variable global
val age:Int = 23
var age2:Int = 23
val floatExample:Float = 23.4f

fun main() {

    variableNumerica()
    showMyName("Negro Jose")
    showMyAge(23)
    add(26, 76)
    val mySubtract = substract(10,5)
    println(mySubtract)

    /**
     * val constante
     * var variable
     */
//    val name = "Adrian"
//    val number = 14
//
//    /**
//     * Funciones aritmeticas
//     */
//
//    println("Sumar")
//    println(age + age2)
//
//    println("Restar")
//    println(age - age2)
//
//    println("Multiplicar")
//    println(age * age2)
//
//    println("Division")
//    println(age / age2)
//
//    println("Modulo")
//    println(age % age2)
//
//
//    val exampleSum: Float = age + floatExample
//    println(exampleSum)
//
//
//    var stringConcatenada:String = "Hola"
//    println(stringConcatenada)
//    //Una mejor manera de concatenar
////    stringConcatenada = "Hola me llamo $stringExample y tengo $age anios"
//    println(stringConcatenada)
//
//    val example123:String = age.toString()

}

fun variableNumerica(){
    /**
     * Variables Numericas
     */

    //Int
    age2 = 24
    println(age2)

    //Long
    val exampleLong:Long = 30

    //Float

    //Double
    val doubleExample:Double = 213123.44324
}

fun variablesBoolean(){
    /**
     * Variables booleanas
     */

    //Boolean

    val booleanExample:Boolean = true
    val booleanExample2:Boolean = false
    val booleanExample3:Boolean
}

fun variablesAlfaNumericas(){
    /**
     * Variables Alfanumericas
     */

    //Char
    val charExample1:Char = 'e'
    val charExample2:Char = '3'
    val charExample3:Char = '@'

    //String
    val stringExample:String = "Adrian Garcia"
    println(stringExample)
}

fun showMyName(currentName:String){
    println("Me llamo $currentName")
}

fun showMyAge(currentAge:Int){
    println("Tengo $currentAge anios" )
}

fun add(firstNumber: Int, secondNumber: Int){
    println(firstNumber + secondNumber)
}

fun substract(firstNumber: Int, secondNumber: Int): Int{ //Voy a devolver un Int
    return firstNumber - secondNumber
}

fun substractCool(firstNumber: Int, secondNumber: Int): Int = firstNumber - secondNumber //Funcion mas simplificada
