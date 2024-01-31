package unidad2;

import java.util.Scanner;

public class Aplicacion2_11 {
    public static void main(String[] args) {
        boolean capicua = false;
        Scanner sn = new Scanner(System.in);

        //Número entero entre 0 y 9999
        int num, u, d, c, um;
        System.out.println("Indica un número entero entre 0 y 9999: ");
        num = sn.nextInt();

        //Evaluamos matemáticamente
        u = num%10; //obtengo las unidades
        num/=10; // elimino las unidades de num
        d=num%10; //obtengo las decenas
        num/=10; // elimino las decenas de num
        c=num%10; // obtengo las centenas
        num/=10; // elimino las centenas de num
        um = num; // obtengo las unidades de millar

        //Evaluación lógica
        if(um==u && d==c){
            capicua=true;
        }else if(um==0 && c==u){
            capicua=true;
        }else if(um==0 && c==0 && d==u){
            capicua=true;
        }else if(um==0 && c==0 & d==0){
            capicua=true;
        }

        if (capicua) { //if (capicua == true)
            System.out.println("El número escrito es capicúa");
        }else{
            System.out.println("El número escrito no es capicúa");











    }
}
}

