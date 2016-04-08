/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cerveza;

/**
 *
 * @author dam112
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cerveza birra = new Cerveza(Cerveza.MarcaCerveza.GUINESS, Vaso.TipoVaso.JARRA);
        
        birra.servir();
        
        if(birra.marca.compareTo(Cerveza.MarcaCerveza.GUINESS) == 0){
            System.out.println("Es una cerveza " + birra.marca);
        }
        
        System.out.println("OPAAA");
        
    }
    
}
