fun main() {
    //getActividad1()
    //getActividad2()
    getActividad3()
    }

fun getActividad1() {
    for (i in 1..100) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("triqui")
        } else if (i % 3 == 0) {
            println("tri")
        } else if(i % 5 == 0) {
            println("qui")
        } else(
            println(i)
        )
    }
}

fun getActividad2() {
    println("Introduzca la primera palabra: ")
    val palabra1 = readLine()?.lowercase()
    println("Introduzca la segunda palabra: ")
    val palabra2 = readLine()?.lowercase()

    if (palabra1 == palabra2) {
       return println("Las dos palabras son iguales")
    } else {
        if (palabra1 != null) {
            for (letras1 in palabra1) {
                if (palabra2 != null) {
                    if (palabra1.length != palabra2.length) {
                        return println("No tienen la misma longitud")
                    } else if (palabra2.contains(letras1)) {
                        for (letras2 in palabra2) {
                            if(palabra1.contains(letras2)) {
                                return println("Estas palabras son anagramas")
                            }
                        }
                    }
                } else {
                    return println("La segunda palabra no fue introducida")
                }
            return println("Estas palabras no son anagramas")
            }
        } else {
            return println("La primera palabra no fue introducida")
        }
    }
}
fun getActividad3() {

    println("Introdzca la expresion matematica")
    val expresion = readLine()
    val ultimoEnAbrirseArray: ArrayList<Char> = ArrayList<Char>()
    var parentesis = 0
    var corchetes = 0
    var llaves = 0
    var ultimoEnAbrirse: Char? = 'a'

    if (expresion != null) {
        for (char in expresion) {

            if (char == '(') {
                parentesis++
                ultimoEnAbrirseArray.add('(')
            } else if (char == ')') {
                parentesis--
                if (ultimoEnAbrirseArray.last() != '(' || ultimoEnAbrirseArray.isEmpty()) {
                    return println("La expresion tiene parentesis mal formados")
                } else {
                    ultimoEnAbrirseArray.removeLast()
                }
            } else if (char == '{') {
                llaves++
                ultimoEnAbrirseArray.add('{')
            } else if (char == '}') {
                llaves--
                if (ultimoEnAbrirseArray.last() != '{' || ultimoEnAbrirseArray.isEmpty()) {
                    return println("La expresion tiene llaves mal formados")
                } else {
                ultimoEnAbrirseArray.removeLast()
                }
            } else if (char == '[') {
                corchetes++
                ultimoEnAbrirseArray.add('[')
            } else if (char == ']') {
                corchetes--
                if (ultimoEnAbrirseArray.last() != '[' || ultimoEnAbrirseArray.isEmpty()) {
                    return println("La expresion tiene corchetes mal formados")
                } else {
                    ultimoEnAbrirseArray.removeLast()
                }
            }
        }
        if (parentesis != 0 || corchetes != 0 || llaves != 0 || ultimoEnAbrirseArray.isEmpty()) {
            return println("La expresion tiene parentesis, corchetes o llaves mal formados")
        } else if (parentesis == 0 && llaves == 0 && corchetes == 0) {
            return println("La expresion esta correctamente formada")
        }
    }

    fun getActividad4() {
        println()
        val saltarCorrerArray: Array<String> = arrayOf("correr", "saltar", "correr", "saltar", "correr")
        var lineas: String = "_|_|_"
    }
}




