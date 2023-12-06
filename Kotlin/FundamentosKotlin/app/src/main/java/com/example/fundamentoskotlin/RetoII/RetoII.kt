package com.example.fundamentoskotlin.RetoII

class RetoII {
}

fun main(){
    var nombreA:String
    var tipo:String
    var cantSong:Int
    var songs = mutableListOf("")
    var artista = mutableListOf("")
    var año = mutableListOf("")
    var reps = mutableListOf(0)
    var popular = mutableListOf("")
    var noPopular = mutableListOf("")
    var totalReps:Int = 0
    var p:String=""

    println("Digite el nombre del album")
    nombreA= readLine()!!.toString()
    println("Digite el tipo de musica del album")
    nombreA= readLine()!!.toString()
    println("Digite la cantidad de canciones del album")
    cantSong= readLine()!!.toInt()
    for (i in 1..cantSong){
        println("Digite el nombre de la cancion")
        var songsi= readLine()!!.toString()
        songs.add(songsi)
        println("Digite el nombre del artista")
        var nombreAi= readLine()!!.toString()
        artista.add(nombreAi)
        println("Digite el año de la cancion")
        var añoi= readLine()!!.toString()
        año.add(añoi)
        println("Digite el numero de reproducciones de esa cancion")
        var repsi= readLine()!!.toInt()
        reps.add(repsi)
    }

    var maximo = reps.maxOrNull()

    for((index,element) in songs.withIndex()){
        if (maximo == reps[index]){
            p=songs[index]
        }
        totalReps += reps[index]

        if (reps[index] < 1000){
            noPopular.add(songs[index])
        } else {
            popular.add(songs[index])
        }
    }

    println("el total de visualizaciones del album es de ${totalReps} y la cancion ${p} con mas reps tuvo ${maximo}")

    println("Canciones Populares")
    for((index,element) in popular.withIndex()){
        println("${element}")
    }

    println("Canciones no Populares")
    for((index,element) in noPopular.withIndex()){
        println("${element}")
    }

    for(i in 0..songs.size -1){
        if (i == 0){
            continue
        } else {
            println("${songs[i]},interpretada por ${artista[i]}, se lanzó en ${año[i]},  cantidad de reproducciones ${reps[i]}")
        }
    }

}