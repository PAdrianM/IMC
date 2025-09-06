package com.adriang.androidkotlin.exercises

/**
 *
 * A menudo, debes completar los perfiles de sitios web en línea que contienen campos obligatorios y no obligatorios.
 * Por ejemplo, puedes agregar tu información personal y un vínculo a otras personas que te refirieron para que registraras tu perfil.
 *
 * En el código inicial que se proporciona en el siguiente fragmento de código, escribe un programa que imprima los detalles del perfil de una persona.
 *
 *
 * RESULTADO
 *
 *Completa la función showProfile() para que el programa imprima estas líneas:
 *
 *
 * Name: Amanda
 * Age: 33
 * Likes to play tennis. Doesn't have a referrer.
 *
 * Name: Atiqah
 * Age: 28
 * Likes to climb. Has a referrer named Amanda, who likes to play tennis.
 */


fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        // Fill in code
        println("Name: $name")
        println("Age: $age")

        if (hobby.isNullOrEmpty()){
            println("Has not hobby ")
        }else{
            print("like to $hobby. ")
        }

        if (referrer == null){
            println("Doesn't have a referrer.")
        }else{
            print(" Has a referrer named ${referrer.name},")
            print(" who likes to play tennis")
        }

    }
}
