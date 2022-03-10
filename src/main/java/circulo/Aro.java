package circulo;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author Pablo Perez Paz
 */
public class Aro {

    /**
     * Constante que introduce un valor minimo para el radio
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
     * Constructor por defecto de la clase Aro valores (0,0,0.0)
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
     * Método set para la coordenadaX establece el valor del atributo
     * @param valorX
     */
    public void setCoordenadaX(int valorX) {
        coordenadaX=valorX;
    }

    /**
     * Devuelve el valor del atributo coordenadaX de tipo private
     * @return un entero con la coordenada X
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * Establece el valor de coordenada Y tras pasarle un entero con el valor
     * @param valorY
     */
    public void setCoordenadaY(int valorY) {
        coordenadaY=valorY;
    }

    /**
     * Devuelve el valor del atributo coordenadaY de tipo private
     * @return un entero con la coordenada Y
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * Establece el valor del radio tras pasarle un valor de tipo double
     * @param valorRadio
     */
    public void setRadio(double valorRadio) {

        radio=estableceRadio(valorRadio);
    }

    /**
     * Devuelve el valor del atributo radio de tipo private y double
     * @return el radio en formato double
     */
    public double getRadio() {
        return radio;
    }
    
    /*Se crean los dos metodos estáticos detallados a continuación, el 1º para
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

    
    public static double estableceRadio(double valorRadio) {
        if(valorRadio<0)
            valorRadio = LIMITERADIO;
        return valorRadio;
    }

    /**
     * Establece un valor dentro de los limites de los enteros para una
     * coordenada y un valor a trasladar ambos enteros
     * @param coordenada
     * @param trasladar
     * @return coordenada + trasladar, si pasan del limite el entero más cercano
     */
    public static int moverCoordenada(int coordenada,int trasladar) {
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
     * Devuelve el perimetro de la circunferencia a partir del métrodo obterDiametro
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
     *
     * @return
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
        setCoordenadaX(getCoordenadaX() + moverCoordenada(getCoordenadaX(),trasladarX));
        setCoordenadaY(getCoordenadaY() + moverCoordenada(getCoordenadaY(),trasladarY));
    }
}