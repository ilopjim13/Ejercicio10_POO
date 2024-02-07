class Tablero() {

    companion object {
        fun crearTablero(size: Int = 3) = Array(size) { IntArray(size) }

        fun imprimirTablero(tablero: Array<IntArray>) {
            // Mostrar en consola el tablero con las fichas
            clearConsoleOk(15)
            println("-------------")
            tablero.forEach { printRow(it) }
        }

        fun printRow(row: IntArray) {
            // Mostrar una fila del tablero
            println("| " + row.joinToString(" | ") { if (it == 0) " " else if (it == 1) "X" else "O" } + " |")
            println("-------------")
        }

        fun tableroLLeno(tablero: Array<IntArray>): Boolean {
            // Verificar si el tablero está lleno
            return tablero.all { row -> row.all { it != 0 } }
        }
    }

}