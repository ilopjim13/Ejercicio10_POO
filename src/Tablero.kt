class Tablero {

    fun createBoardOk(size: Int = 3) = Array(size) { IntArray(size) }

    fun printBoardOk(board: Array<IntArray>) {
        // Mostrar en consola el tablero con las fichas
        clearConsoleOk(15)
        println("-------------")
        board.forEach { printRow(it) }
    }

    fun printRow(row: IntArray) {
        // Mostrar una fila del tablero
        println("| " + row.joinToString(" | ") { if (it == 0) " " else if (it == 1) "X" else "O" } + " |")
        println("-------------")
    }

    fun isBoardFullOk(board: Array<IntArray>): Boolean {
        // Verificar si el tablero está lleno
        return board.all { row -> row.all { it != 0 } }
    }
}