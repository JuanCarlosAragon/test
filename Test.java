
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    private int multiplicando;
    
    public Test(){
        multiplicando = 5;
    }
    /**
     * Imprime todos los múltiplos de 5 entre 10 y 95 ambos no incluidos
     */
    public void multiplesOfFive(){
        int producto = 0;
        int contador = 3;
        int index = 1;
        
        while(producto < 90){
            producto = multiplicando * contador;
            System.out.println(index + ": " + multiplicando + " x " + contador + " = " + producto);
            
            contador = contador + 1;
            index = index + 1;
        }
    }
    /**
     * Suma los valores comprendidos entre 0 y 10
     */
    public void sumValues(){
        int contador = 0;
        int resultado = 0;
        while(contador <= 10){
            resultado = resultado + contador;
            contador = contador + 1;
        }
        System.out.println("Suma de valores entre 0 y 10: " + resultado);
        
    }
}
