/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cerveza;

import cerveza.Vaso.TipoVaso;

/**
 *
 * @author dam112
 */
public class Cerveza {
    
    public enum MarcaCerveza{ESTRELLAG, GUINESS, HEINEKEN};
    
    private TipoVaso vaso;
    MarcaCerveza marca;
    
    public Cerveza(MarcaCerveza marca, TipoVaso vaso){
        this.vaso = vaso;
        this.marca = marca;
    }
    
    public void servir(){
        System.out.println("Servimos " + vaso.getCantidad() + " de cerveza " + marca);
    }
    
}
