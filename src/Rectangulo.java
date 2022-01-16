/**
 * Clase rectangulo con 4 lados
 * @author Angel
 * @version 1.0
 */
public class Rectangulo {
    private int lado1;
    private int lado2;
    
    /**
     * Calcula el perimetro del rectangulo
     * @return el perimetro del rectangulo
     */
    public int perimetro(){
        return lado1 + lado1 + lado2 + lado2;
    }
    
    /**
     * Calcula el area del rectangulo
     * @return el area del rectangulo
     */
    public int area(){
        return lado1*lado2;
    }
    /**
     * Escalar el rectangulo
     * @param factor valor a multiplicar
     */
    public void multiplicar (int factor){
        int name = lado1 * factor;
        int name2 = lado2 * factor;
    }
}
