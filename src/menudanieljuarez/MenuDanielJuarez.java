package menudanieljuarez;

import java.util.Scanner;

public class MenuDanielJuarez {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int opcion=0;
        
        System.out.println("Menú principal.");
        System.out.println("1. Pasar segundos a formato h:m:s");
        System.out.println("2. Programa de billetes.");
        System.out.println("3. Programa de número par o impar.");
        System.out.println("4. Programa de número perfecto.");
        System.out.println("5. Programa de serie de fibonacci.");
        opcion=entrada.nextInt();
        if(opcion==1){
            int seg=0;
            int hrs=0;
            int minuts=0;
            int segs=0;
            System.out.println("Ingrese el número de segundos.");
            seg=entrada.nextInt();
            hrs = seg/3600;
            minuts = (seg-(3600*hrs))/60;
            segs = seg-((hrs*3600)+(minuts*60));
            System.out.println(hrs+ "h"+ " "+ minuts+ "m  " + segs+"s");
        }
        if(opcion==2){
            int cantidad=0;
            int dos_cientos=0;
            int cien=0;
            int cincuenta=0;
            int veinte=0;
            int diez=0;
            int cinco=0;
            int uno=0;
            System.out.println("Ingrese la cantidad de números que desea covertir a billetes de Guatemala.");
            cantidad=entrada.nextInt();
            
            dos_cientos = cantidad/200;
            cantidad=cantidad-(dos_cientos*200);
            cien = cantidad/100;
            cantidad=cantidad-(cien*100);
            cincuenta = cantidad/50;
            cantidad=cantidad-(cincuenta*50);
            veinte = cantidad/20;
            cantidad=cantidad-(veinte*20);
            diez = cantidad/10;
            cantidad=cantidad-(diez*10);
            cinco=cantidad/5;
            cantidad=cantidad-(cinco*5);
            uno = cantidad/1;
            cantidad=cantidad-(uno*1);
            if(dos_cientos>0){
                System.out.println("Billetes de 200 son: "+dos_cientos);
            }
            if(cien>0){
                System.out.println("Billetes de 100 son: "+cien);
            }
            if(cincuenta>0){
                System.out.println("Billetes de 50 son: "+cincuenta);
            }
            if(veinte>0){
                System.out.println("Billetes de 20 son: "+veinte);
            }
            if(diez>0){
                System.out.println("Billertes de 10 son: "+diez);
            }
            if(cinco>0){
                System.out.println("Billetes de 5 son: "+cinco);
            }
            if(uno>0){
                System.out.println("Billetes de 1 son: "+uno);
            }
            
       
        }
        if(opcion==3){
            int nu1=0;
            int result=0;
            System.out.println("Ingrese un número.");
            nu1=entrada.nextInt();
            result=nu1%2;
            if(result==0){
                System.out.println("El número es par.");
            }else{
                System.out.println("El número no es par, es impar.");
            }
        }
        if(opcion==4){
          int i;
          int suma=0;
          int n;
          System.out.println("Ingrese un número.");
          n=entrada.nextInt();
                for(i = 1; i < n; i++){
                    if(n % i == 0){
                        suma = suma + i;
                    }
                    
                }
                if(suma==n){
                    System.out.println("El número ingresado es perfecto.");
                }else{
                    System.out.println("El número ingresado no es perfecto.");
                }
            
        }
        if(opcion==5){
            int numero=0;
            int f=0;
            int n1=1;
            int n2;
            System.out.println("Ingrese la cantidad de número al que desea que llegue fibonacci.");
            numero=entrada.nextInt();
            for(int i = 0; i < numero; i++){
                n2=f;
                f=n1+f;
                n1=n2;
                System.out.println(n1);
            }
        
        }
    }
    
    
}
