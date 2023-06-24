/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e2p1_junniorsauceda;

/**
 *
 * @author Junnior Sauceda
 */
public class Numero {
    String Numero;
    int Base;
    
    public Numero(int num,int base){
        this.Numero=decToBase(num, base);
        this.Base=base;
      
    }
    public Numero(){
        
    }
    public void setNumero(String num){
        this.Numero=num;
    }
    public void setBase(int base){
        this.Base=base;
    }
    
    public String getNumero(){
        return this.Numero;
    }
    public int getBase(){
        return this.Base;
    }
    public char numToChar(int num){
        char Caracter;
        int resta;
        if(num>=0&&num<=9){
            System.out.println("Hola");
            Caracter=(char)((num+48));
            System.out.println((char)Caracter);
        }
        else{
            System.out.println("Hola2");
            resta=(num+87);
            System.out.println((char)resta);
            Caracter=(char)(resta);
        }
        return Caracter;
    }
    public int charToNum(char carac){
        int ascii=(int)carac;
        int resta;
        if(ascii>=48&&ascii<=57){
            resta=ascii-48;
        }
        else{
            resta=ascii-87;
        }
        return resta;
    }
    public String decToBase(int num,int base){
        String bas="";
        String Basf="";
        int numero=num;
        int residuo;
        while(numero>=base){
                residuo=numero%base;
                numero=numero/base;
                bas+=numToChar(residuo);
                
        }
        bas+=numToChar(numero);
        for(int i=bas.length()-1;i>=0;i--){
            Basf+= bas.charAt(i);
        }
        return Basf;
    }
    public int baseToDec(){
        int resp=0;
        int cont=0;
        for(int i=Numero.length()-1;i>=0;i--){
            int ascii=(int)Numero.charAt(i);
            if(ascii<=57){
                ascii-=48;
            }
            else{
                ascii-=87;
            }
            resp+=ascii*((int)Math.pow(Base, cont));
            cont++;
        }
        return resp;
    }
    
}
