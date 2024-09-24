package com.torres.mauro.usolayoutsv4

class Ejercicio01Kotlin {

    // Clase Contacto con nombre, telefono y email
    class Contacto(val nombre: String, val telefono: String, val email: String)

    // Clase Agenda con una lista de contactos y métodos para poder gestionarlos
    class Agenda {
        private val listaContactos = mutableListOf<Contacto>()

        // Agregar un nuevo contacto a la lista
        fun agregarContacto(contacto: Contacto) {
            listaContactos.add(contacto)
            println("Contacto agregado: ${contacto.nombre}")
        }

        // Mostrar todos los contactos en la consola
        fun mostrarContactos() {
            if (listaContactos.isEmpty()) {
                println("No hay contactos en la agenda.")
            } else {
                println("Lista de contactos:")
                for (contacto in listaContactos) {
                    println("Nombre: ${contacto.nombre}, Teléfono: ${contacto.telefono}, Email: ${contacto.email}")
                }
            }
        }

        // Buscar un contacto por email
        fun buscarContactoEmail(email: String): Contacto? {
            return listaContactos.find { it.email == email }
        }

        // Buscar un contacto por teléfono
        fun buscarContactoTelefono(telefono: String): Contacto? {
            return listaContactos.find { it.telefono == telefono }
        }
    }

    // Método principal para probar la funcionalidad
    fun main() {
        val agenda = Agenda()

        // Crear algunos contactos
        val contacto1 = Contacto("Fabricio Aylas", "123456789", "fabricio.aylas@tecsup.edu.pe.")
        val contacto2 = Contacto("Mauro Torres", "987654321", "mauro.torres@tecsup.edu.pe.")

        // Agregar contactos a la agenda
        agenda.agregarContacto(contacto1)
        agenda.agregarContacto(contacto2)

        // Mostrar todos los contactos
        agenda.mostrarContactos()

        // Buscar un contacto por email
        val contactoEncontradoEmail = agenda.buscarContactoEmail("mauro.torres@tecsup.edu.pe")
        println("Contacto encontrado: ${contactoEncontradoEmail?.nombre}")

        // Buscar un contacto por teléfono
        val contactoEncontradoTelefono = agenda.buscarContactoTelefono("987654321")
        println("Contacto encontrado: ${contactoEncontradoTelefono?.nombre}")
    }
}