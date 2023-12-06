package com.example.fundamentoskotlin.RetoIII

class RetoIII {
}

fun main(){
    var productos = mutableListOf("celular nokia","logrimas de un ciego","audios de un mudo","bluelabel jonny walker").random()
    var participantes = mutableListOf("")
    var valorMaximo = mutableListOf(0)
    var numParticipantes:Int = 0
    var user:String
    var vallue:Int=0
    var total:Int=0
    var ganador:String="YO"
    var fin:String="si"

    while (fin == "si"){
        participantes.clear()
        valorMaximo.clear()
        println("Cuantos participantes van a subastar")
        numParticipantes = readLine()!!.toInt()
        for(i in 1..numParticipantes){
            println("registre su nombre participante numero ${i}")
            user= readLine()!!.toString()
            participantes.add(user)
        }
        println("El producto ${productos} ha sido puesto en subasta")

        for (i in 1..numParticipantes){
            println("Cuanto deseas apostar por este articulo participante numero ${i}")
            vallue= readLine()!!.toInt()
            valorMaximo.add(vallue)
            total += vallue

        }

        var maximo = valorMaximo.maxOrNull()

        for ((index, element)in participantes.withIndex()) {
            if (maximo == valorMaximo[index]) {
                ganador = element
                println("si entro")
            }
        }

        if (total > 0){
            println("el ganador de la subasta es ${ganador}")
        } else {
            println("La casa gana por un precio de 1")
        }

        println("¿Deseas volvar a subastar?")
        fin= readLine()!!.toString().lowercase()
    }
}