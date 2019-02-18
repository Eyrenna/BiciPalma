package estacionTest;

import static org.junit.Assert.assertEquals;

import estacion.Estacion;
import org.junit.Before;
import org.junit.Test;

public class EstacionTest {
    private Estacion estacion = null;

    @Before
    public void init() {
        estacion = new Estacion(5, "Caro", 7);
    }

    @Test
    public void consultarEstacionTest() {
        assertEquals("La estación 5 con dirección en Caro tiene 7 anclajes.", estacion.consultarEstacion());
    }
}
