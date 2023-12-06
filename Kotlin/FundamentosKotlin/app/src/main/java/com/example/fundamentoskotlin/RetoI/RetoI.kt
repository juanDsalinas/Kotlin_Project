package com.example.fundamentoskotlin.RetoI

class RetoI {
}

fun main(){
    var notificaciones = mutableListOf("")

    var cont:Int = 0
    var r:Int=(1..5).random()
    var res:String = "si"
    var nombre = arrayOf("","Youtube","Facebook","Instagram","Whatsapp","Twitter")
    var not:Int=(0..2).random()

    if(not == 1 || not == 0){
        notificaciones.add("El usuario Juan david salinas a ingresado al telefono")
        cont+=1
        while(res == "si"){
            if(notificaciones.size > 1){
                println("Tienes ${r} notificaciones nuevas")

                for(i in 1..r){
                    var nuevo:String="${nombre[r]} tienes una nueva notificacion"
                    notificaciones.add(nuevo)
                    println("${nuevo}")
                }

                cont+=r
                if(cont > 99){
                    println("Cuantas con 99+ notificaciones")
                } else {
                    println("Cuantas con ${cont} notificaciones")
                }

                println("Deseas seguir revisando tus notificaciones")
                res= readLine()!!.toString().lowercase()
            }
        }
    } else {
        println("No existen notificaciones disponibles")
    }
}