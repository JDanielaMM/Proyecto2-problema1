/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.problema1;
import java.util.Scanner;
/**
 *
 * @author danii
 * Johanna Daniela Macías Martínez A01411534
   Iván Constantino Hernández A01411529
   Maythe Portales Barrios A01411461
   Luisa Fernanda Sosa Brambila A01411485
 */
public class Proyecto2Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int opc=0;
        boolean ciclo = true;
        do{
        System.out.println("CALCULADORA DE MATRICES");
        System.out.println("Elige la opción deseada:");
        System.out.println("1. Suma de matrices");
        System.out.println("2. Resta de matrices");
        System.out.println("3. Multiplicación de matrices");
            System.out.println("4. Salir");
            try{
        opc=key.nextInt();}
            catch(Exception e){
                key.next();
            }

        switch(opc){
            case 1:              
                suma();
                System.out.println("");
                break;
            case 2:
                resta();
                System.out.println("");
                break;
            case 3:
                multiplicacion();
                System.out.println("");
                break;
            case 4:
                System.out.println("Adios!");
                ciclo=false;
                break;
            default:
                System.out.println("Error de case");
                System.out.println("");
                break;
        }
        }
        while(ciclo);
    }
    
     public static int solicitaentero(String b){
            Scanner key = new Scanner (System.in);
        boolean flag;
        int a=0;
        do{
            try{
        System.out.println("Escribe "+b);
        a=key.nextInt();
        flag=false;
        
            }
            catch(Exception e){
                System.out.println("Error");
                key.next();
                flag=true;
            }
        }
        while(flag);
        return a;       
    }
     
      public static int[][] arreglo(String a,int tamano){//hace el arreglo A y B
           
      int [][]arreglo = new int [tamano][tamano];
            System.out.println("Arreglo "+a);
      
        for (int i=0; i<arreglo.length;i++){
        for (int j=0;j<arreglo[i].length;j++){
        arreglo[i][j]= solicitaentero("un número entero: ");
        }
        }
        return arreglo;
        }
     
     public static void suma(){
        int tamano= solicitaentero("el tamaño del arreglo: ");
        int a[][]=arreglo("A",tamano);
        int b[][]=arreglo("B",tamano);
         int [][] r= new int [a.length][a.length];
         System.out.println("Suma de matrices:");
         for (int i=0;i<a.length;i++){
             for (int j=0;j<a[i].length;j++){
                 r[i][j]=a[i][j]+b[i][j];
                 System.out.print("["+r[i][j]+"]");
             }
             System.out.println();
             
         } 
         }
      public static void resta(){
        int tamano= solicitaentero("el tamaño del arreglo: ");
        int a[][]=arreglo("A",tamano);
        int b[][]=arreglo("B",tamano);
    int r[][] = new int [a.length][a.length];
         System.out.println("Resta de las matrices::");
        for (int i=0; i<a.length;i++){
        for (int j=0;j<a[i].length;j++){
            r[i][j]=a[i][j]-b[i][j];
            System.out.print("["+r[i][j]+"]");
        }
            System.out.println();
        }
        }
       public static void multiplicacion(){
        int tamano= solicitaentero("el tamaño del arreglo: ");
        int a[][]=arreglo("A",tamano);
        int b[][]=arreglo("B",tamano);
    int [][]r= new int [a.length][a.length];
    int[][]r2= new int [a.length][a.length];
           System.out.println("Multiplicación de matrices:");
           for(int i=0;i<a.length;i++){
               for(int j=0;j<a.length;j++){
                   for(int k=0;k<a.length;k++){
                       r[i][j]=a[i][k]*b[k][j];     
                       r2[i][j]=r2[i][j]+r[i][j];
                   }
                   System.out.print("["+r2[i][j]+"]");  
               }
               System.out.println();
           }
}
    
}
