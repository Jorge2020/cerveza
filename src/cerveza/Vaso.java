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
public class Vaso {
    
    enum TipoVaso{
        JARRA(500), TUBO(250), TERCIO(333), CAÑA(150);
        private int cantidad;
        
        TipoVaso(int c){
            this.cantidad = c;
        }
        
        public int getCantidad(){
            return cantidad;
        }//fin tipo.........
    }
    
}
