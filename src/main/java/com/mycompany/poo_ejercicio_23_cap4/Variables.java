/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_ejercicio_23_cap4;

/**
 *
 * @author Luis F Montoya
 */
public class Variables {
    //Atributos
    double A,B,C;
    public Variables(double A,double B,double C){
        this.A = A;
        this.B = B;
        this.C = C;
        
    }
    public boolean VerificarX1(){
        return Math.pow(B,2)-(4*A*C)>=0;
    }
     public boolean VerificarX2(){
        return Math.pow(B,2)-(4*A*C)>=0;
    }
    public double ValorX1(){
            return ((-B)+(Math.sqrt(Math.pow(B,2)-(4*A*C))))/(2*A);      
    }
    public double ValorX2(){
            return ((-B)-(Math.sqrt(Math.pow(B,2)-(4*A*C))))/(2*A);
    }    
    
    
}
