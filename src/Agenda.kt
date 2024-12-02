
class Agenda {
    fun main() {
        println("1. Añadir contacto" +
                "\n2. Listar contacto" +
                "\n3. Buscar contacto" +
                "\n4. Existe contacto" +
                "\n5. Eliminar contacto" +
                "\n6. Contactos disponibles" +
                "\n7. Agenda llena" +
                "\n8. Salir"
        )
        when (readln().toInt()) {
            1 -> añadirContacto()
            2 -> listarContactos()
            3 -> buscarContacto()
            4 -> existeContacto()
            5 -> eliminarContacto()
            6 -> contactosDisponibles()
            7 -> agendaLlena()
            8 -> System.exit(0)
            else -> println("Opción inválida")
        }
    }
    private val listaContactos = ArrayList<Contactos>(3)

    fun añadirContacto() {
        println("Escribe un nombre:")
        val nombre = readLine()
        println("Escribe un teléfono:")
        val telefono = readLine()

        if (listaContactos.size >= 3) {
            println("Agenda llena. No se puede añadir más contactos.")
            return main()
        }

        if (listaContactos.any { it.nombre == nombre }) {
            println("El nombre ya existe en la agenda.")
            return main()
        }

        listaContactos.add(Contactos(nombre, telefono))
        println("Se ha añadido el contacto.")
        return main()
    }
        fun listarContactos() {
            if (listaContactos.isEmpty()) {
                println("No hay contactos que mostrar")
            } else {
                for(contacto in listaContactos) {
                    println(" Nombre: ${contacto.nombre} Telefono: ${contacto.telefono}")
                }
            }
            return main()
        }
        fun buscarContacto() {
            println("Escribe un nombre")
            val nombre = readLine()
            for (contacto in listaContactos) {
                if (contacto.nombre == nombre) {
                    println("Su telefono es ${contacto.telefono}")
                } else {
                    println("No se ha encontrado el contacto")
                }
            }
            return main()
        }
        fun existeContacto() {
            println("Escribe un nombre")
            val nombre: String = readLine().toString()
            for (contacto in listaContactos) {
                if (contacto.nombre == nombre) {
                    println("Existe el contacto")
                } else {
                    println("No existe el contacto")
                }
            }
            return main()
        }
        fun eliminarContacto() {
            println("Escribe un nombre")
            val nombre: String = readLine().toString()
            val contactoAEliminar = listaContactos.find { it.nombre == nombre }
            if (contactoAEliminar != null) {
                listaContactos.remove(contactoAEliminar)
                println("Se ha eliminado el contacto")
            } else {
                println("No se ha encontrado el contacto")
            }
            return main()
        }
        fun contactosDisponibles() {
            var contador: Int = 0
            if (listaContactos.size >= 3) {
                println("Hay 0 huecos libres")
            } else {
                for (i in listaContactos) {
                    contador++
                }
                var huecos = contador - listaContactos.size
                println("Hay $contador hueco/s libre/s")
            }
            return main()
        }
        fun agendaLlena() {
            if (listaContactos.size >= 3) {
                println("La agenda esta  llena")
            } else {
                println("Aun se pueden meter contactos")
            }
            return main()

        }
        fun salir() {
            println("Saliendo del programa...")
            System.exit(0)
        }
    }
