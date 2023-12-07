/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso2;
import javax.swing.JOptionPane;

/**
 *
 * @author Laptop
 */
public class Caso2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Analisis analisis = new Analisis();
    
    analisis.agregarMovimiento();
    
    Amigo amigoAnalizar = new Amigo("David"); 
    analisis.analisisPara(amigoAnalizar);
        
    }
    
}
