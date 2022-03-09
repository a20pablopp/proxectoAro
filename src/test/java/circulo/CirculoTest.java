/**
 * Probas para a clase Circulo
 * @author Pablo Perez Paz
 */
package circulo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Pablo Perez Paz
 */
public class CirculoTest {
    
    public CirculoTest() {
    }
    
    /**
     * Test of establecerX method, of class Circulo.
     */
    @Test
    public void testEstablecerX() {
        System.out.println("establecerX");
        int valorX = 0;
        Circulo instance = new Circulo();
        instance.establecerX(valorX);
    }

    /**
     * Test of obterX method, of class Circulo.
     */
    @Test
    public void testObterX() {
        System.out.println("obterX");
        Circulo instance = new Circulo(0,0,0.1);
        int expResult = 0;
        int result = instance.obterX();
        assertEquals(expResult, result);
    }

    /**
     * Test of establecerY method, of class Circulo.
     */
    @Test
    public void testEstablecerY() {
        System.out.println("establecerY");
        int valorY = 0;
        Circulo instance = new Circulo();
        instance.establecerY(valorY);
    }

    /**
     * Test of obterY method, of class Circulo.
     */
    @Test
    public void testObterY() {
        System.out.println("obterY");
        Circulo instance = new Circulo(0,0,0.1);
        int expResult = 0;
        int result = instance.obterY();
        assertEquals(expResult, result);
    }

    /**
     * Test of establecerRadio method, of class Circulo.
     */
    @Test
    public void testEstablecerRadio() {
        System.out.println("establecerRadio");
        Circulo instance = new Circulo();
        instance.establecerRadio(0.0);
        instance.establecerRadio(0.1);
        instance.establecerRadio(-0.1);
    }

    /**
     * Test of obterRadio method, of class Circulo.
     */
    @Test
    public void testObterRadio() {
        System.out.println("obterRadio");
        Circulo instance = new Circulo(0,0,0.1);
        double result = instance.obterRadio();
        assertEquals(0.1, result,0);

        instance.establecerRadio(0.1);
        result= instance.obterRadio();
        assertEquals(0.1, result,0);

        instance.establecerRadio(-0.1);
        result= instance.obterRadio();
        assertEquals(0.0, result,0);
    }

    /**
     * Test of obterDiametro method, of class Circulo.
     */
    @Test
    public void testObterDiametro() {
        System.out.println("obterDiametro");
        Circulo instance = new Circulo(0,0,0.1);
        double result = instance.obterDiametro();
        assertEquals(0.2, result,0);
    }

    /**
     * Test of obterCircunferencia method, of class Circulo.
     */
    @Test
    public void testObterCircunferencia() {
        System.out.println("obterCircunferencia");
        Circulo instance = new Circulo(0,0,0.1);
        double expResult = 0.6283185;
        double result = instance.obterCircunferencia();
        assertEquals(expResult, result,1e-6);
    }

    /**
     * Test of obterArea method, of class Circulo.
     */
    @Test
    public void testObterArea() {
        System.out.println("obterArea");
        Circulo instance = new Circulo(0,0,0.1);
        double expResult = 0.0314159;
        double result = instance.obterArea();
        assertEquals(expResult, result,1e-6);
    }

    /**
     * Test of trasladarCentro method, of class Circulo.
     */
    @Test
    public void testTrasladarCentro() {
        System.out.println("trasladarCentro");
        Circulo instance = new Circulo();
        int resultx=instance.obterX();
        int resulty=instance.obterY();
        instance.trasladarCentro(5, 6);
        int resultnx = instance.obterX();
        int resultny = instance.obterY();
        assertEquals(resultx+5, resultnx);
        assertEquals(resulty+6, resultny);
    }
    
}
