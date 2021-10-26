/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Empleado;
import domain.Cliente;
/**
 *
 * @author Alfonso
 */
public class TestHerencia {
    public static void main(String[] args) {
//        Empleado empleado1=new Empleado("Pepe", 0);
//        System.out.println("empleado1 = " + empleado1);
//        
//        empleado1.setEdad(20);
//        
//        System.out.println(empleado1.toString());;
//        
        Cliente cliente1=new Cliente("Paco", 'm', 30, "Orzan", true);
        System.out.println("cliente1 = " + cliente1);
        Cliente cliente2=new Cliente("Maria", 'm', 16, "Paseo de Gracia", true);
        System.out.println("cliente2 = " + cliente2);
        
        Empleado empleado2=new Empleado("Piter");
        System.out.println("empleado2 = " + empleado2);
        
        Cliente cliente3=new Cliente("Alfonso", 'm', 35, "Ramón de la Sagra", true);
        
        System.out.println("cliente3 = " + cliente3);;
        
        System.out.println("cliente3 = " + cliente3.toString());;

    }
}
