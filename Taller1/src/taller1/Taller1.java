/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Taller1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        int tipo_cliente;
        int tipo_computadora;
        boolean bandera = true;
        String salida;
        int porcentaje1 = 1;
        int porcentaje2 = 5;
        int porcentaje3 = 10;
        int porcentaje4 = 15;
        int descuento1;
        int descuento2;
        int descuento3;
        int descuento4;
        int resultado = 0;
        int valorTotal = 0;
        int cedula;
        String cadena_final = "";
        int contador = 0;
        int totalventa = 0;
        
        while (bandera) {
            System.out.println("ingrese su nombre");
            nombre = entrada.nextLine();

            System.out.println("ingrese su numero de cedula");
            cedula = entrada.nextInt();

            System.out.println("ingrese el tipo de cliente 1,2,3,4");
            tipo_cliente = entrada.nextInt();

            System.out.println("Seleccione el tipo de computadora que desea comprar\n"
                    + "Ingrese 1 para seleccionar la computadora tipo 1\n"
                    + "Ingrese 2 para seleccionar la computadora tipo 2\n"
                    + "Ingrese 3 para selecciona la computadora tipo 3");
            tipo_computadora = entrada.nextInt();

            switch (tipo_computadora) {
                case 1:
                    resultado = 1000;
                    break;
                case 2:
                    resultado = 1100;
                    break;
                case 3:
                    resultado = 900;
                    break;
                default:
                    System.out.println("Opcion incorrecta");

            }

            if (tipo_cliente == 1) {
                descuento1 = (resultado * porcentaje1) / 100;
                valorTotal = resultado - descuento1;

            } else {
                if (tipo_cliente == 2) {
                    descuento2 = (resultado * porcentaje2) / 100;
                    valorTotal = resultado - descuento2;
                } else {
                    if (tipo_cliente == 3) {
                        descuento3 = (resultado * porcentaje3) / 100;
                        valorTotal = resultado - descuento3;
                    } else {
                        if (tipo_cliente == 4) {
                            descuento4 = (resultado * porcentaje4) / 100;
                            valorTotal = resultado - descuento4;
                        }

                    }
                }
            }
                         contador = contador + 1;
                        
                         valorTotal = valorTotal * contador;
                          totalventa = totalventa + valorTotal;
            cadena_final = String.format("%s Cliente con %s, con cedula %s, compra %s "
                    + "computadoras\n con precio individual $%s. Total a pagar $%s", 
                    cadena_final, 
                    nombre,
                    cedula,
                    contador,
                    resultado,
                    valorTotal);
            
            System.out.println("Ingrese s para dejar la entrada de datos ");
            salida = entrada.nextLine();
            salida = entrada.nextLine();

            if (salida.equals("s")) {
                bandera = false;
            }

        }
            System.out.printf("Reporte\n %s\n Total venta de computadoras: $%s"
                    , cadena_final,totalventa );
    }
}
