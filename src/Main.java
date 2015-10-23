
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LEFF
 */
public class Main {
    static ArregloEnteros[] sr;
    static ArregloEnteros ar;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int opc;
        boolean activar = false;
        do {
            System.out.println("\n1-. Llenar");
            System.out.println("");
            System.out.println("");
            System.out.print("Ingrese una Opcion: ");
            opc = sc.nextInt();
            
            if (opc == 1) {
                activar = true;
            }
            
            if (activar) {
                switch(opc){
                    case 1:
                        llenar();
                        break;
                    case 2:break;
                }
            }
        } while (opc != 6);
        
    }

    private static void llenar() {
        System.out.print("Ingrese Longitud: ");
        int longi = sc.nextInt();
        sr = new ArregloEnteros[longi];
        int ac = 0;
        while (ac < longi) {
            System.out.print("Ingrese Numero: ");
            int n = sc.nextInt();
            ac++;
            ar.llenar(n);
        }
    }
}
