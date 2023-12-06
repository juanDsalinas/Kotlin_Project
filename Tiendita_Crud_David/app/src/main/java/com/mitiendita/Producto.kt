package com.mitiendita

class Producto(val codigo: Int, val nombre: String, val precio: Float) {
    override fun toString(): String {
        return "Código: $codigo, Nombre: $nombre, Precio: $precio"
    }

}