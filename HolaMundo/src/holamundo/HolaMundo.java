/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

import java.awt.Color;
import poo.conceptos.basicos.Automovil;

/**
 *
 * @author Valeria
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo Java!!!!");
        
        Persona per1 = new Persona();
        per1.setNombre("Val SG");
        System.out.println("Nombre: " + per1.getNombre());
        per1.comer("Hamburguesa Hawaina! " + per1.getNombre());
                
            
        Persona per2 = new Persona();
        per2.setNombre("Felipe");
        System.out.println("Nombre per 2: " + per2.getNombre());
        per2.comer("Pizza Hawaina!! ");
                        
            
        Automovil bocho = new Automovil();
        bocho.setMarca("VW");
        System.out.println("Marca: " + bocho.getMarca());
        bocho.setSubMarca("Sedan");
        System.out.println("SubMarca: " + bocho.getSubMarca());
        bocho.setModelo(1970);
        System.out.println("Modelo: " + bocho.getModelo());
        bocho.setColor(Color.BLUE);
        System.out.println("Color: " + bocho.getColor());

        /**System.out.println("Marca: " + bocho.getMarca());
        System.out.println("SubMarca: " + bocho.getsubMarca());
        System.out.println("Modelo: " + bocho.getModelo());
        System.out.println("Color: " + bocho.getcolor
        **/

       Automovil mustang = new Automovil();
        mustang.setMarca("Ford");
        System.out.println("Marca: " + mustang.getMarca());
        mustang.setSubMarca("Mustan");
        System.out.println("SubMarca: " + mustang.getSubMarca());
        mustang.setModelo(2010);
        System.out.println("Modelo: " + mustang.getModelo());
        mustang.setColor(Color.YELLOW);
        System.out.println("Color: " + mustang.getColor());

        /**System.out.println("Marca: " + mustang.getMarca());
        System.out.println("SubMarca: " + mustang.getsubMarca());
        System.out.println("Modelo: " + mustang.getModelo());
        System.out.println("Color: " + mustang.getcolor());
        **/
        
         Automovil akura = new Automovil();
        akura.setMarca("Akura");
        System.out.println("Marca: " + akura.getMarca());
        akura.setSubMarca("NSX");
        System.out.println("SubMarca: " + akura.getSubMarca());
        akura.setModelo(2013);
        System.out.println("Modelo: " + akura.getModelo());
        akura.setColor(Color.GRAY);
        System.out.println("Color: " + akura.getColor());
    
        /**System.out.println("Marca: " + akura.getMarca());
        System.out.println("SubMarca: " + akura.getsubMarca());
        System.out.println("Modelo: " + akura.getModelo());
        System.out.println("Color: " + akura.getcolor());
        **/
    }
    
    
}
