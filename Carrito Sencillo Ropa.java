
import java.util.ArrayList;
import java.util.Scanner;

public class Examen {

    public static void main(String[] args) {
        double suma = 0;
        int terminar = 0;
        double monto;
        do {
            ArrayList<String> cart = new ArrayList<String>();
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("TIENDA DE ROPA");
                System.out.println("");
                System.out.println("Catalogo");
                System.out.println("1.   Niño");
                System.out.println("2.   Mujer");
                System.out.println("3.   Hombre");
                System.out.println("");
                System.out.print("Teclea el numero de el catalogo que al que deseas ingresar :  ");
                int d = sc.nextInt();
                switch (d) {
                    case 1:
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("Bienvenido al departamento de niño");
                        System.out.println("Nuestro catalogo es el siguiente1");
                        System.out.println("");
                        System.out.println("1. Jeans Skinny $299");
                        System.out.println("2. Playera Manga Corta Estampada $99");
                        System.out.println("3. Playera Cuello Henley $149");
                        System.out.println("4. Shorts $168");
                        System.out.println("");
                        System.out.println("Teclea el numero de el elemento que desea agregar a tu carrito :");
                        System.out.println("Teclea 5 para terminar");
                        int a = sc.nextInt();

                        while (a != 5) {
                            switch (a) {
                                case 1:
                                    cart.add("Articulo 1 00");
                                    suma += 299;
                                    break;
                                case 2:
                                    cart.add("Articulo 2 01");
                                    suma += 99;
                                    break;
                                case 3:
                                    cart.add("Articulo 3 02");
                                    suma += 149;
                                    break;
                                case 4:
                                    cart.add("Articulo 4 03");
                                    suma += 168;
                                    break;
                                default:
                                    System.out.println("Caracter invalido. Porfavor reintenta");
                                    break;
                            }
                            System.out.println("Has añadido" + cart);
                            System.out.println("Menu:");
                            System.out.println("1. Articulo 1 ($299)");
                            System.out.println("2. Articulo 2 ($99)");
                            System.out.println("3. Articulo 3 ($149)");
                            System.out.println("4. Articulo 4 ($168");
                            System.out.println("");
                            System.out.println("Teclea el numero de el elemento que desea agregar a tu carrito :");
                            System.out.println("Teclea 5 para terminar");
                            a = sc.nextInt();
                        }

                        System.out.println("Has comprado : " + cart);
                        System.out.println("Total :" + suma);
                        System.out.println("");
                        System.out.println("Deseas agregar algo mas?");
                        System.out.println("Teclea 0 para volver al menu principal");
                        System.out.println("Teclea 1 para terminar y pasar a pagar");
                        terminar = sc.nextInt();

                        if (terminar == 1) {
                            System.out.println("Pagaras un total de : " + suma);
                            System.out.println(" ");
                            do {
                                System.out.println("Ingresa el monto con el que pagaras :");
                                monto = sc.nextDouble();
                                double cambio = (monto - suma);
                                if (monto > suma) {
                                    System.out.println("Tu cambio es de : " + cambio);
                                    System.out.println("");
                                    System.out.println("<<<<Gracias por tu compra>>>");

                                } else {
                                    System.out.println("");
                                    System.out.println("Cantidad de dinero insuficiente");

                                }
                            } while (monto < suma);
                        }
                        break;
                    case 2:
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("Bienvenido  al departamento de mujer nuestro catalogo es el siguiente :");
                        System.out.println("");
                        System.out.println("1. Blusa sin mangas Mujer Ralph Lauren $2,799");
                        System.out.println("2. Chaleco Mujer $1,549");
                        System.out.println("3. Chamarra Puffer Mujer $1,899");
                        System.out.println("4. Chamarra de Mesclilla Mujer L'evis $2,999");
                        System.out.println("");
                        System.out.println("Teclea el numero de el elemento que desea agregar a tu carrito :");
                        System.out.println("Teclea 5 para terminar");
                        int b = sc.nextInt();
                        while (b != 5) {
                            switch (b) {
                                case 1:
                                    cart.add("Articulo 1 001");
                                    suma += 2799;
                                    break;
                                case 2:
                                    cart.add("Articulo 2 002");
                                    suma += 1549;
                                    break;
                                case 3:
                                    cart.add("Articulo 3 003");
                                    suma += 1899;
                                    break;
                                case 4:
                                    cart.add("Articulo 4 004");
                                    suma += 2999;
                                    break;
                                default:
                                    System.out.println("Caracter invalido porfavor reintenta");
                                    break;

                            }
                            System.out.println("Has añadido" + cart);
                            System.out.println("");
                            System.out.println("Catalogo:");
                            System.out.println("1. Articulo 1 ($2799)");
                            System.out.println("2. Articulo 2 ($1549)");
                            System.out.println("3. Articulo 3 ($1899)");
                            System.out.println("4. Articulo 4 ($2999");
                            System.out.println("");
                            System.out.println("Teclea el numero de el elemento que desea agregar a tu carrito :");
                            System.out.println("Teclea 5 para terminar");
                            b = sc.nextInt();

                        }
                        System.out.println("Has comprado : " + cart);
                        System.out.println("Total : " + suma);
                        System.out.println("");
                        System.out.println("Deseas agregar algo mas?");
                        System.out.println("Teclea 0 para volver al menu principal");
                        System.out.println("Teclea 1 para terminar y pasar a pagar");
                        terminar = sc.nextInt();

                        if (terminar == 1) {
                            System.out.println("Pagaras un total de : " + suma);
                            System.out.println(" ");
                            do {
                                System.out.println("Ingresa el monto con el que pagaras :");
                                monto = sc.nextDouble();
                                double cambio = (monto - suma);
                                if (monto > suma) {
                                    System.out.println("Tu cambio es de : " + cambio);
                                    System.out.println("");
                                    System.out.println("<<<<Gracias por tu compra>>>");

                                } else {
                                    System.out.println("");
                                    System.out.println("Cantidad de dinero insuficiente");

                                }
                            } while (monto < suma);
                            
                        }
                        break;

                    case 3:
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("Bienvenido al departamento de caballero");
                        System.out.println("Nuestro catalogo es el siguiente ");
                        System.out.println("");
                        System.out.println("1. Playera Boss $3,299");
                        System.out.println("2. Playera Slim Fit Boss $1,990");
                        System.out.println("3. Traje de corte regular $8,999");
                        System.out.println("");
                        System.out.println("Teclea el numero de el elemento que desea agregar a tu carrito :");
                        System.out.println("Teclea 4 para terminar");
                        int n = sc.nextInt();

                        while (n != 4) {
                            switch (n) {
                                case 1:
                                    cart.add("Articulo 1 0001");
                                    suma += 3299;
                                    break;
                                case 2:
                                    cart.add("Articulo 2 0002");
                                    suma += 1990;
                                    break;
                                case 3:
                                    cart.add("Articulo 3 0003");
                                    suma += 8999;
                                    break;
                                default:
                                    System.out.println("");
                                    System.out.println("Caracter invalido por favor reintenta :");
                                    break;
                            }
                            System.out.println("Has añadido " + cart);
                            System.out.println("Catalogo:");
                            System.out.println("1. Articulo 1 ($3299)");
                            System.out.println("2. Articulo 2 ($1990)");
                            System.out.println("3. Articulo 3 ($8999)");
                            System.out.println("");
                            System.out.println("Teclea el numero de el elemento que desea agregar a tu carrito :");
                            System.out.println("Teclea 5 para terminar");
                            n = sc.nextInt();

                        }
                        System.out.println("Has comprado " + cart);
                        System.out.println("Total " + suma);
                        System.out.println("Deseas agregar algo mas?");
                        System.out.println("");
                        System.out.println("Teclea 0 para volver al menu principal");
                        System.out.println("Teclea 1 para termnar y pasar a pagar");
                        terminar = sc.nextInt();

                        if (terminar == 1) {
                            System.out.println("Pagaras un total de : " + suma);
                            System.out.println(" ");
                            do {
                                System.out.println("Ingresa el monto con el que pagaras :");
                                monto = sc.nextDouble();
                                double cambio = (monto - suma);
                                if (monto > suma) {
                                    System.out.println("Tu cambio es de : " + cambio);
                                    System.out.println("");
                                    System.out.println("<<<<Gracias por tu compra>>>");

                                } else {
                                    System.out.println("");
                                    System.out.println("Cantidad de dinero insuficiente");
                                }
                            } while (monto < suma);
                        }
                        break;
                }
            }
        } while (terminar == 0);
    }
}
