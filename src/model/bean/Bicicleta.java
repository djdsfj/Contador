/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author pi
 */
public class Bicicleta {
 //declaracao de variavel
     int id;
     int bicicleta;

    public Bicicleta() {
                bicicleta = 0;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(int bicicleta) {
        this.bicicleta = bicicleta;
    }

   
     
    //inserido do dados da bicicleta
    //tratamento de erro

    public Bicicleta(int id, int bicicleta){
        //tratamento de erro 
        try{
        
        
        } catch(Exception erro) {
        System.out.println("Ocorreu um erro,você só pode informar numeros inteiros"+erro);
        }
    }
    //metodo de contagem 
    public void Contador(){
        
            bicicleta ++;
           
            
        }
    //metodo que exibe os dados na tela    
        public void exibeDados(){  
    
    Contador();
   String bike = Integer.toString(bicicleta);   
   
         
 //converter a data
           
          SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss z");
        //singleton
        //Calendar data = new GregorianCalendar();
        Date hoje = new Date();
        System.out.println("A quantidade de bicicleta é : " + bike +"  "+sdf.format(hoje)); 
        //+(sdf.format(hoje))
            }
            }
        

    

       
    

