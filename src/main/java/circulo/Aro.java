package circulo;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author Pablo Perez Paz
 */
public class Aro {

    /**
     * Constante que introduce un valor minimo para el radio, la actual es 0.0
     */
    public static final double LIMITERADIO = 0.0;

    /**
     * Constante que estipula el limite para los valores enteros positivos 
     */
    public static final int LIM_INT_POSI = 2147483647;

    /**
     * Constante que estipula el limite para los valores enteros negativos
     */
    public static final int LIM_INT_NEGA = -2147483648;

    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    /**
     * Constructor por defecto de la clase Aro, valores (0,0,0.0)
     */
    public Aro() {
    }

    /**
     * Constructor con parámetros para la clase Aro, crea un objeto Aro
     * @param valorX
     * @param valorY
     * @param valorRadio
     */
    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        radio = estableceRadio(valorRadio);
    }

    /**
     * Método set para la coordenadaX, establece el valor del atributo
     * @param valorX
     */
    public void setCoordenadaX(int valorX) {
        coordenadaX=valorX;
    }

    /**
     * Devuelve el valor del atributo coordenadaX
     * @return un entero con la coordenada X
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * Establece el valor de coordenadaY tras pasarle un entero con el valor
     * @param valorY
     */
    public void setCoordenadaY(int valorY) {
        coordenadaY=valorY;
    }

    /**
     * Devuelve el valor del atributo coordenadaY
     * @return coordenadaY un valor entero
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * Establece el valor del radio tras pasarle un valor real
     * @param valorRadio
     */
    public void setRadio(double valorRadio) {

        radio=estableceRadio(valorRadio);
    }

    /**
     * Devuelve el valor del atributo radio
     * @return el radio en formato double
     */
    public double getRadio() {
        return radio;
    }
    
    /*
    *Se crean los dos metodos estáticos detallados a continuación, el 1º para
    *no invocar a un método set en el constructor. El segundo como resultado del
    *error que cabria esperarse si se utilizan parámetros muy grandes para 
    *trasladarX o Y valores que pueden superar el limite de los enteros
    *negativos y positivos, el método moverCoordenada evita esto.
    */

    /**
     * Establece un valor igual a 0 o mayor para cualquier valor del Radio
     * @param valorRadio
     * @return LIMITERADIO si valorRadio menor que 0, en otro caso valorRadio
     */

    
    private static double estableceRadio(double valorRadio) {
        if(valorRadio<0)
            valorRadio = LIMITERADIO;
        return valorRadio;
    }

    /**
     * Establece un valor dentro de los limites de los enteros para una
     * coordenada, tras trasladar una cantidad entera dicha coordenada.
     * @param coordenada
     * @param trasladar
     * @return coordenada + trasladar, si pasan del limite, el entero más cercano
     */
    private static int moverCoordenada(int coordenada,int trasladar) {
        long suma = (long) coordenada + (long) trasladar;
        if(suma>LIM_INT_POSI){
            return LIM_INT_POSI;
        }else if(suma<LIM_INT_NEGA){
            return LIM_INT_NEGA;
        }else{
            return(coordenada + trasladar);
        }
    }

    /**
     * devuelve el diametro a partir del radio del Aro en formato double
     * @return Diametro radio*2
     */
    public double obterDiametro() {
        return getRadio() * 2;
    }

    /**
     * Devuelve el perimetro de la circunferencia a partir del método obterDiametro
     * @return diametro*PI
     */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    /**
     * Devuelve la superficie que encierra el objeto Aro, en formato double.
     * @return radio*radio*Pi
     */
    public double obterSuperficie() {
        return Math.PI * getRadio() * getRadio();
    }

    /**
     * Devuelve una representación en String de los atributos de un objeto. 
     * @return un String con el valor del centro y radio del Aro
     */
    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }

    /**
     * Traslada el centro de la circunferencia una cantidad en x y otra en y.
     * @param trasladarX
     * @param trasladarY
     */
    public void trasladarCentro(int trasladarX, int trasladarY){
        int desplazamientoX = moverCoordenada(getCoordenadaX(),trasladarX);
        setCoordenadaX(getCoordenadaX() + desplazamientoX);
        int desplazamientoY = moverCoordenada(getCoordenadaY(),trasladarY);
        setCoordenadaY(getCoordenadaY() + desplazamientoY);
    }
}
