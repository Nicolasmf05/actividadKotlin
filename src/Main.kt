fun main() {
    //getActividad1()
    //getActividad2()
    //getActividad3()
    //getActividad4()
    getActividad5()
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
}

    fun getActividad4() {
        println()
        val saltarCorrerArray: Array<String> = arrayOf("saltar", "saltar", "saltar", "saltar", "saltar")
        var lineas: String = "|||||"
        var lineasFinal: ArrayList<Char> = ArrayList<Char>()
        for (i in saltarCorrerArray.indices) {
            if (saltarCorrerArray[i] == "correr" && lineas[i] == '_') {
                lineasFinal.add(i,'_')
            } else if (saltarCorrerArray[i] == "saltar" && lineas[i] == '|') {
                lineasFinal.add(i,'|')
            } else if (saltarCorrerArray[i] == "saltar" && lineas[i] == '_') {
                lineasFinal.add(i,'x')
            } else if (saltarCorrerArray[i] == "correr" && lineas[i] == '|') {
                lineasFinal.add(i,'/')
            } else {
                lineasFinal.add(i,'?')
            }
        }
        if (lineasFinal.contains('x') || lineasFinal.contains('/') || lineasFinal.contains('?')) {
            return println(lineasFinal.joinToString("") + " " + "false")
        } else {
            return println(lineasFinal.joinToString("") + " " + "true")
        }
    }

fun getActividad5() {
    val tresEnRaya: Array<Array<String>> = arrayOf(
        arrayOf("", "O", "X"),
        arrayOf("", "X", "O"),
        arrayOf("", "O", "X")
    )
    var nºDeX = 0
    var nºDeO = 0

    for (i in 0 until tresEnRaya.size) {
        for (j in 0 until tresEnRaya[i].size) {
            if (tresEnRaya[i][j] == "X") {
                nºDeX++
            } else if (tresEnRaya[i][j] == "O") {
                nºDeO++
            }
        }
    }

    if (nºDeX > 5 || nºDeO > 5 || nºDeX < 3 || nºDeO < 3) {
        println(nºDeO)
        println(nºDeX)
        return println("NULL")
    } else {

        for (i in 0 until tresEnRaya.size) {

                if (tresEnRaya[i][0] == tresEnRaya[i][1] && tresEnRaya[i][0] == tresEnRaya[i][2]) {
                    return println("Ganador: " + tresEnRaya[i][0])
                } else if (tresEnRaya[0][i] == tresEnRaya[1][i] && tresEnRaya[0][i] == tresEnRaya[2][i]) {
                    return println("Ganador: " + tresEnRaya[0][i])
                } else if (tresEnRaya[0][0] == tresEnRaya[1][1] && tresEnRaya[0][0] == tresEnRaya[2][2]) {
                    return println("Ganador: " + tresEnRaya[0][0])
                } else if (tresEnRaya[0][2] == tresEnRaya[1][1] && tresEnRaya[0][2] == tresEnRaya[2][0]) {
                    return println("Ganador: " + tresEnRaya[0][2])
                } else {
                    return println("Empate")
                }
        }
    }


}





