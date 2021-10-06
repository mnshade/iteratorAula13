import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscadariaTest {

    @Test
    void deveComputarGladiadoresProntos() {
        Coliseu coliseu = new Coliseu(
                new Gladiador(12, true),
                new Gladiador(15, true),
                new Gladiador(7, false),
                new Gladiador(33, true)
        );
        assertEquals(3, Escadaria.computarGladiadoresProntos(coliseu));
    }

    @Test
    void deveMostrarTotalDeGladiadores(){
        Coliseu coliseu = new Coliseu(
                new Gladiador(12, true),
                new Gladiador(15, true),
                new Gladiador(7, false),
                new Gladiador(33, true)
        );
        assertEquals(4, Escadaria.mostrarTotalDeGladiadores(coliseu));
    }
}
