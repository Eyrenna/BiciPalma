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


}
