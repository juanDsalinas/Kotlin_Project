package com.example.fundamentoskotlin.RetoIV

class RetoIV {
}

fun main(){
    var des:Boolean=true
    var res:Int

    var entradas = mutableListOf("patacones con ahogao","crema de brocoli","sopa de verduras","crema de zapallo")
    var descEntradas = mutableListOf("tajadas de patacon fritas con una cubierta de ahogao","brocolos herbidos y licuados","sopa vegetariana con verduras frescas","zapallo liquado")
    var priceEntradas = mutableListOf(10000,20000,15000,30000)

    var platosFuertes = mutableListOf("Tacos tipo gobernador","croquetas de papa con jamon","pescado empanizado","bistek de carne")
    var descFuertes = mutableListOf("tortillas fritas rellenadas con carne y verduras","fritura tipo empanada hecho con papa rellenas de jamos","pescado empanizado con acompañamiento de ensalada","corte de carne asadito + papa")
    var priceFuertes = mutableListOf(12000,10000,25000,40000)

    var postres = mutableListOf("fresas con crema","banana split","taiyaki","bocadillo")
    var descPostres = mutableListOf("una cama de fresa cubierta con chocolate y crema por encima","cama de bananos + frutas, bañado de helado y crema batida por encima","galleta en forma de pescado rellena de helado o chocolate","bocadillo de guayaba")
    var pricePostres = mutableListOf(10000,12000,15000,1000)

    var bebidas = mutableListOf("Limonada","Jugo de mora","Gaseosa Coca-cola","Agua")
    var descBebidas = mutableListOf("limones exprimidos + agua + panela","mora licuada + azucar","gaseosa de 700ml Coca-Cola","simplemente Agua")
    var priceBebidas = mutableListOf(1500,3000,2000,1000)

    while(des == true){
        println("¿Que deseas hacer? \n 1 - agregar plato \n 2 - mostrar todos los platos \n 3 - mostrar los platos por codigo \n 4 - modificar el menu \n 5 - modificar un plato \n 6 - eliminar un plato")
        res= readLine()!!.toInt()
        when(res) {
            1 -> {
                println("Agregar Plato")
                println("Digita la categoria del plato - entradas, platos fuertes, postres, bebidas")
                var categoria = readLine()!!.toString().lowercase()
                when (categoria) {
                    "entradas" -> {
                        println("Digita el nombre del plato")
                        var nombre: String = readLine()!!.toString()
                        println("Digita una descripcion del plato")
                        val descP = readln()!!.toString()
                        println("Digita el precio del plato")
                        val price = readLine()!!.toInt()
                        entradas.add(nombre)
                        descEntradas.add(descP)
                        priceEntradas.add(price)
                    }

                    "platos fuertes" -> {
                        println("Digita el nombre del plato")
                        var nombre: String = readLine()!!.toString()
                        println("Digita una descripcion del plato")
                        val descP = readln()!!.toString()
                        println("Digita el precio del plato")
                        val price = readLine()!!.toInt()
                        platosFuertes.add(nombre)
                        descFuertes.add(descP)
                        priceFuertes.add(price)
                    }

                    "postres" -> {
                        println("Digita el nombre del plato")
                        var nombre: String = readLine()!!.toString()
                        println("Digita una descripcion del plato")
                        val descP = readln()!!.toString()
                        println("Digita el precio del plato")
                        val price = readLine()!!.toInt()
                        postres.add(nombre)
                        descPostres.add(descP)
                        pricePostres.add(price)
                    }

                    "bebidas" -> {
                        println("Digita el nombre del plato")
                        var nombre: String = readLine()!!.toString()
                        println("Digita una descripcion del plato")
                        val descP = readln()!!.toString()
                        println("Digita el precio del plato")
                        val price = readLine()!!.toInt()
                        bebidas.add(nombre)
                        descBebidas.add(descP)
                        priceBebidas.add(price)
                    }

                }

            }

            2 -> {
                println("Mostrar todos los platos")
                println("Entradas")
                for ((index, element) in entradas.withIndex()) {
                    println("${entradas[index]}")
                }
                println("Platos fuertes")
                for ((index, element) in platosFuertes.withIndex()) {
                    println("${platosFuertes[index]}")
                }
                println("Postres")
                for ((index, element) in postres.withIndex()) {
                    println("${postres[index]}")
                }
                println("Bebidas")
                for ((index, element) in bebidas.withIndex()) {
                    println("${bebidas[index]}")
                }

            }

            3 -> {
                println("Mostrar codigos de los platos")
                println("Entradas")
                for ((index, element) in entradas.withIndex()) {
                    println("${entradas[index]} = ${index}")
                }
                println("Platos fuertes")
                for ((index, element) in platosFuertes.withIndex()) {
                    println("${platosFuertes[index]}  = ${index}")
                }
                println("Postres")
                for ((index, element) in postres.withIndex()) {
                    println("${postres[index]}  = ${index}")
                }
                println("Bebidas")
                for ((index, element) in bebidas.withIndex()) {
                    println("${bebidas[index]}  = ${index}")
                }

            }

            5 -> {
                println("Editar un plato")
                println("Digita el nombre de la categoria del plato")
                var categoria = readLine()!!.toString().lowercase()
                when (categoria) {
                    "entradas" -> {
                        println("Digita el codigo del plato")
                        var code = readLine()!!.toInt()

                        for ((index, element) in entradas.withIndex()) {
                            if (index == code) {
                                println("Digita el nombre de la entrada")
                                var nombre: String = readLine()!!.toString()
                                println("Digita una descripcion de la entrada")
                                val descP = readln()!!.toString()
                                println("Digita el precio de la entrada")
                                var price = readLine()!!.toInt()
                                entradas[index] = nombre
                                descEntradas[index] = descP
                                priceEntradas[index] = price
                                println("${entradas[index]}")
                                println("${descEntradas[index]}")
                                println("${priceEntradas[index]}")

                            }
                        }
                    }

                    "platos fuertes" -> {
                        println("Digita el codigo del plato")
                        var code = readLine()!!.toInt()

                        for ((index, element) in platosFuertes.withIndex()) {
                            if (index == code) {
                                println("Digita el nombre de la bebida")
                                var nombre: String = readLine()!!.toString()
                                println("Digita una descripcion de la bebida")
                                val descP = readln()!!.toString()
                                println("Digita el precio de la bebida")
                                var price = readLine()!!.toInt()
                                platosFuertes[index] = nombre
                                descFuertes[index] = descP
                                priceFuertes[index] = price

                            }
                        }
                    }

                    "postres" -> {
                        println("Digita el codigo del plato")
                        var code = readLine()!!.toInt()

                        for ((index, element) in postres.withIndex()) {
                            if (index == code) {
                                println("Digita el nombre del plato")
                                var nombre: String = readLine()!!.toString()
                                println("Digita una descripcion del plato")
                                val descP = readln()!!.toString()
                                println("Digita el precio del plato")
                                var price = readLine()!!.toInt()
                                postres[index] = nombre
                                descPostres[index] = descP
                                pricePostres[index] = price

                            }
                        }
                    }

                    "bebidas" -> {
                        println("Digita el codigo del plato")
                        var code = readLine()!!.toInt()

                        for ((index, element) in bebidas.withIndex()) {
                            if (index == code) {
                                println("Digita el nombre de la bebida")
                                var nombre: String = readLine()!!.toString()
                                println("Digita una descripcion de la bebida")
                                val descP = readln()!!.toString()
                                println("Digita el precio de la bebida")
                                var price = readLine()!!.toInt()
                                bebidas[index] = nombre
                                descBebidas[index] = descP
                                priceBebidas[index] = price

                            }
                        }
                    }

                    else -> {
                        println("Categoria Invalida")
                    }

                }

            }

            4 -> {

                println("Editar el menu")
                println("Digita el nombre de la categoria que deseas editar")
                var categoria = readLine()!!.toString().lowercase()
                when (categoria) {
                    "entradas" -> {
                        println("Digita el codigo del plato que deseas editar")
                        var code = readLine()!!.toInt()

                        for ((index, element) in entradas.withIndex()) {
                            if (index == code) {
                                println("Digita el nombre del plato")
                                var nombre: String = readLine()!!.toString()
                                println("Digita una descripcion del plato")
                                val descP = readln()!!.toString()
                                println("Digita el precio del plato")
                                var price = readLine()!!.toInt()
                                entradas[index] = nombre
                                descEntradas[index] = descP
                                priceEntradas[index] = price

                            }
                        }
                    }

                    "platos fuertes" -> {
                        println("Digita el codigo del plato que deseas editar")
                        var code = readLine()!!.toInt()

                        for ((index, element) in platosFuertes.withIndex()) {
                            if (index == code) {
                                println("Digita el nombre del plato")
                                var nombre: String = readLine()!!.toString()
                                println("Digita una descripcion del plato")
                                val descP = readln()!!.toString()
                                println("Digita el precio del plato")
                                var price = readLine()!!.toInt()
                                platosFuertes[index] = nombre
                                descFuertes[index] = descP
                                priceFuertes[index] = price

                            }
                        }
                    }

                    "postres" -> {
                        println("Digita el codigo del plato que deseas editar")
                        var code = readLine()!!.toInt()

                        for ((index, element) in postres.withIndex()) {
                            if (index == code) {
                                println("Digita el nombre del plato")
                                var nombre: String = readLine()!!.toString()
                                println("Digita una descripcion del plato")
                                val descP = readln()!!.toString()
                                println("Digita el precio del plato")
                                var price = readLine()!!.toInt()
                                postres[index] = nombre
                                descPostres[index] = descP
                                pricePostres[index] = price

                            }
                        }
                    }

                    "bebidas" -> {
                        println("Digita el codigo del plato que deseas editar")
                        var code = readLine()!!.toInt()

                        for ((index, element) in bebidas.withIndex()) {
                            if (index == code) {
                                println("Digita el nombre de la bebida")
                                var nombre: String = readLine()!!.toString()
                                println("Digita una descripcion de la bebida")
                                val descP = readln()!!.toString()
                                println("Digita el precio de la bebida")
                                var price = readLine()!!.toInt()
                                bebidas[index] = nombre
                                descBebidas[index] = descP
                                priceBebidas[index] = price

                            }
                        }
                    }

                    else -> {
                        println("Categoria Invalida")
                    }

                }

            }
            6 -> {

                println("Eliminar un plato")
                println("Digita el nombre de la categoria")
                var categoria = readLine()!!.toString().lowercase()
                when (categoria) {
                    "entradas" -> {
                        println("Digita el codigo del plato que deseas eliminar")
                        var code = readLine()!!.toInt()

                        var tamaño = entradas.size-1
                                if (code in 0 until entradas.size) {
                                    entradas.removeAt(code+1)
                                    descEntradas.removeAt(code+1)
                                    priceEntradas.removeAt(code+1)
                                    println("Elemento en la posición ${code} eliminado. ${entradas[code]}")
                                } else {
                                    println("La posición $code está fuera del rango de la lista.")
                                }
                    }

                    "platos fuertes" -> {
                        println("Digita el codigo del plato que deseas eliminar")
                        var code = readLine()!!.toInt()

                        for ((index, element) in platosFuertes.withIndex()) {
                            if (index == code) {
                                    platosFuertes.remove(platosFuertes[code])
                                    descFuertes.remove(descFuertes[code])
                                    priceFuertes.remove(priceFuertes[code])


                            }
                        }
                    }

                    "postres" -> {
                        println("Digita el codigo del plato que deseas eliminar")
                        var code = readLine()!!.toInt()

                        for ((index, element) in postres.withIndex()) {
                            if (index == code) {
                                    postres.remove(postres[code])
                                    descPostres.remove(descPostres[code])
                                    pricePostres.remove(pricePostres[code])

                            }
                        }
                    }

                    "bebidas" -> {
                        println("Digita el codigo del plato que deseas eliminar")
                        var code = readLine()!!.toInt()

                        for ((index, element) in bebidas.withIndex()) {
                            if (index == code) {
                                    bebidas.remove(bebidas[index])
                                    descBebidas.remove(descBebidas[index])
                                    priceBebidas.remove(priceBebidas[index])
                            }
                        }
                    }

                    else -> {
                        println("Categoria Invalida")
                    }

                }

                // aqui termina el 6
            }

            // aqui termina el when
        }

        println("¿Deseas volver a ver el menu?")
        des= readLine()!!.toBoolean()
    }


}