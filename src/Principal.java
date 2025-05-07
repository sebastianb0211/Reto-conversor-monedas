import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner teclado = new Scanner(System.in);
        Metodo metodo =new Metodo();
        Menu menuMostrar = new Menu();
        int menu =0;
        boolean bandera=true;
        double cantidad= 0;
        String valor = "Ingrese el valor que desea convertir";

        System.out.println("bienvenido a nuestro conversor de divisas");

        while (bandera){
            menuMostrar.mostrarMenu();
            System.out.println("Elige una opcion: ");
            menu=teclado.nextInt();
            switch (menu){
                case 1:
                    System.out.println(valor);
                    cantidad= teclado.nextDouble();
                    metodo.dolarPesoArgentino(cantidad);
                    break;
                case 2:
                    System.out.println(valor);
                    cantidad= teclado.nextDouble();
                    metodo.pesoArgentinoDolar(cantidad);
                    break;
                case 3:
                    System.out.println(valor);
                    cantidad= teclado.nextDouble();
                    metodo.realBrasilenoDolar(cantidad);
                    break;
                case 4:
                    System.out.println(valor);
                    cantidad= teclado.nextDouble();
                   metodo.dolarRealBrasileno(cantidad);
                    break;
                case 5:
                    System.out.println(valor);
                    cantidad= teclado.nextDouble();
                    metodo.dolarPesoColombiano(cantidad);
                    break;
                case 6:
                    System.out.println(valor);
                    cantidad= teclado.nextDouble();
                    metodo.pesoColombianoDolar(cantidad);
                    break;
                case 7:
                    bandera=false;
                    break;

                default:
                    System.out.println("por favor escriba una entrada correcta");
                    break;
            }

        }
        System.out.println("Haz salido del sistema exitosamente");

    }
}
