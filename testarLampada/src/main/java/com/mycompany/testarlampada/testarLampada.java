/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testarlampada;

/**
 *
 * @author dti
 */
public class testarLampada {
    public static void main(String[] args) {
        
        // Orientação a objeto sem interface gráfica //
        
        // instanciar classe //
        lampada lamp = new lampada();
        
        // atribuindo valores aos atributos //
        lamp.potencia = "5w";   
        lamp.cor = "amarela";
        lamp.formato = "oval";
        
        // Chamada do método através do objeto de instância (o objeto lamp é a cópia da outra classe //
        lamp.acender();
        lamp.apagar();
        
        // saída dos atributos //
        System.out.println(lamp.potencia);
        System.out.println(lamp.formato);
        System.out.println(lamp.cor);
    }
}
