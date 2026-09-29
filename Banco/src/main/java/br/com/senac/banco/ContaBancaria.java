/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.banco;

/**
 *
 * @author ana60397316
 */
public class ContaBancaria {
  private double saldo;
    private String titular;
    
    public  ContaBancaria (String titular) {
        this.titular = titular;
        this.saldo = 0.00;
    }
    
    public String getTitular(){
        return this.titular;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void setTitular(String titular){
        this.titular =  titular;
    }
    
    public void depositar (double valor) {
        if (valor >0){
            this.saldo = this.saldo + valor;
            System.out.println("Depósito realizado com sucesso!");
        }else{
            System.out.println("Valor de depósito inválido.");
        }
    }
    
    public void sacar (double valor){
        if(valor >0 && valor <= this.saldo ){
        this.saldo = this.saldo - valor;
            System.out.println("Saque realizado com sucesso!");
        }else{
            System.out.println("Saldo insuficiente.");
        }
    }
    
    public void extratoBancario (){
        System.out.println("Saldo: " + this.saldo);
    }        

    public void apresentar (){
        
    }
    
    public void verificarSaldo(){
        if(saldo == 0){
          System.out.println("Conta sem saldo");
        }else if (saldo > 0 && saldo <500){
            System.out.println("Saldo Baixo");
        }else if (saldo >500 && saldo <= 2000){
            System.out.println("Saldo Normal");
        }else {
            System.out.println("Saldo Elevado");
        }
        
    
    }
}



