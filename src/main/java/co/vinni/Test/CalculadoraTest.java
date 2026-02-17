package co.vinni.Test;

import co.vinni.util.Operaciones;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {
    @Test
    public void testSumarStrings(){
        Operaciones calc = new Operaciones();
        long resultado = calc.sumar("2","3");
        assertEquals(String.valueOf(5), resultado,"El resultado esperado de '2' y '3', debe ser 5");
    }
}
