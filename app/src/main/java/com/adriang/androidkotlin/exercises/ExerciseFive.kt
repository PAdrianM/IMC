package com.adriang.androidkotlin.exercises

/**
 *
 * Por lo general, la pantalla del teléfono se enciende y se apaga cuando se presiona el botón de encendido.
 * En cambio, si un teléfono plegable está plegado, su pantalla interna principal no se enciende cuando se presiona el botón de encendido.
 *
 * En el código inicial que se proporciona en el siguiente fragmento de código, escribe una clase FoldablePhone que se herede de la clase Phone. Debe contener lo siguiente:
 *
 * Una propiedad que indique si el teléfono está plegado
 * Un comportamiento de función switchOn() diferente del de la clase Phone para que solo encienda la pantalla cuando el teléfono no esté plegado
 * Métodos para cambiar el estado de plegado
 *
 *
 */

fun main(){

    val zFlip = Phone(false)

    zFlip.switchOff()

}


class Phone(var isScreenLightOn: Boolean = false){

    fun switchOn() {
        isScreenLightOn = true

        if (isScreenLightOn){
            println("Se enciende pantalla ya que el telefono esta desplegado")
        }
    }

    fun switchOff() {
        isScreenLightOn = false

        if (isScreenLightOn==false){
            println("El telefono esta plegado")
        }
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on desplegado" else "off plegado"
        println("The phone screen's light is $phoneScreenLight.")
    }
}