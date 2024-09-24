package com.torres.mauro.usolayoutsv4

class Ejercicio02Kotlin {

    // Clase Empleado con nombre, edad y salarioBase
    class Empleado(val nombre: String, val edad: Int, val salarioBase: Double) {

        // Función para calcular el salario total
        fun calcularSalarioTotal(): Double {
            val bono = if (edad > 30) salarioBase * 0.10 else 0.0
            return salarioBase + bono
        }
    }

    // Método para recorrer la lista de empleados y mostrar su información
    fun gestionarEmpleados() {
        val listaEmpleados = mutableListOf<Empleado>()

        // Agregar empleados a la lista
        listaEmpleados.add(Empleado("Piero Torres", 32, 2500.0))
        listaEmpleados.add(Empleado("Renato Chicasaca", 28, 2200.0))
        listaEmpleados.add(Empleado("Rodrigo Ramírez", 45, 3000.0))

        // Recorrer la lista y mostrar el salario total de cada empleado
        for (empleado in listaEmpleados) {
            val salarioTotal = empleado.calcularSalarioTotal()
            println("Nombre: ${empleado.nombre}, Edad: ${empleado.edad}, Salario Total: $salarioTotal")
        }
    }
}