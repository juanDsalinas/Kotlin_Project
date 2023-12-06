package com.example.fundamentoskotlin.RetoV

import kotlin.random.Random

class RetoV {
}

fun main() {
    var reU:String="no"


    var user = mutableListOf("3103256881")
    var pass = mutableListOf("1234")
    var saldo = mutableListOf(4500)
    var entro:Boolean=false
    var codigo:String=""

    for (i in 0..5){
        var generar= Random.nextInt(1,9)
        generar.toString()
        codigo += generar
        println(codigo)
        generar.toInt()
    }

    for (i in 1..3){
        println("Digite su numero de telefono")
        var usar= readLine()!!.toString()
        println("Digite su contraseña de 4 digitos")
        var poss= readLine()!!.toString()

        if (user[0] == usar && pass[0] == poss){
            println("Bienvenido, tu saldo es ${saldo[0]} ¿Que desea hacer?")
            entro = true
            reU = "si"
            break
        } else {
            println("¡Upps! Parece que tus datos de acceso no son correctos, llevas ${i} intento de 3")
        }
    }


    while (reU == "si") {

        if (entro == true){
            println("1 - Saca \n 2 - Envia \n 3 - Recarga \n 4 - Salir")
            var desi= readLine()!!.toInt()
            when(desi){
                1 -> {
                    println("elegiste sacar, por favor elige - 1 - Cajero - 2 - Punto Fisico")
                    var cajero= readLine()!!.toInt()
                    if (saldo[0] > 0 && saldo[0] < 2000){
                        println("No te alcanza")
                    } else {
                        println("elegista la opcion $cajero")
                        println("¿Cuanto deseas retirar?")
                        var resta= readLine()!!.toInt()
                        saldo[0] -= resta
                        println("tu codigo es ${codigo} ahora puedes ir a retirar")
                        println("tu saldo es ${saldo[0]}")
                    }
                }
                2 -> {
                    println("Digita el numero de telefono al cual deseas enviar dinero")
                    var destino= readLine()!!.toString()
                    println("¿cuanto dinero deseas enviar?")
                    var envio = readLine()!!.toInt()
                    if (saldo[0] - envio < 0){
                        println("Saldo insuficiente")
                    } else {
                        saldo -= envio
                        println("Enviaste ${envio} al numero ${destino}")
                    }
                    println("tu saldo es ${saldo[0]}")
                }

                3 -> {
                    println("Cuanto deseas recargar")
                    var recarga = readLine()!!.toInt()
                    saldo[0] += recarga
                    println("Recarga exitosa")
                    println("tu saldo es ${saldo[0]}")
                }
                4 -> {
                    println("Elegiste salir, bay")
                }
            }

            println("¿Deseas seguir en la aplicacion?")
            reU= readLine()!!.toString()
        }

    }



}
