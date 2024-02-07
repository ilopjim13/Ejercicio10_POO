import kotlin.random.Random

class Juego() {
    companion object {

        lateinit var jugador1:Jugador
        lateinit var jugador2:Jugador

        fun elegirJugador() {
            if (Random.nextInt(1,10) <= 5) {
                jugador1 = Jugador("Jugador1", 1)
                jugador2 = Jugador("Jugador2", 2)
            } else {
                jugador1 = Jugador("Jugador1", 2)
                jugador2 = Jugador("Jugador2", 1)
            }
        }

    }
}