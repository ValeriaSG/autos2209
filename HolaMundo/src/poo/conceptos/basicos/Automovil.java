/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.conceptos.basicos;

import java.awt.Color;

/**
 *
 * @author Valeria
 */
public class Automovil {

    private String marca;
    private String subMarca;
    private int modelo;
    private Color color;
    
    

    public Automovil() {

    }

    public Automovil(String marca, String subMarca, int modelo, Color color) {
        this.marca = marca;
        this.subMarca = subMarca;
        this.modelo = modelo;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubMarca() {
        return subMarca;
    }

    public void setSubMarca(String subMarca) {
        this.subMarca = subMarca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
   
    
    
    public void encender (){
        System.out.println("El auto "+ this.subMarca + "Encendido");
     }
        
    public void acelerar(){
        System.out.println("Acelerando al auto " + this.subMarca);
    }

    public void avanzar (){
        System.out.println("Avanzando el auto: " + this.subMarca);
        
    }  

    public void setcolor(String azul) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getcolor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setModelo(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setcolor(Color yellow) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
 }
    
    
    
    
    
    

