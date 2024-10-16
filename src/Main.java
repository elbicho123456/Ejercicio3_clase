import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la calculadora de la clase Main");

        menu();
    }

    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        Operations operations = new Operations();
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        System.out.println("5. Salir");
        System.out.println("Ingresa una opcion: ");

        int opcion = 0;
        try{
            opcion=Integer.parseInt(scanner.nextLine());
            switch(opcion){
                case 1:
                    System.out.println("Selecciono sumar: ");
                    System.out.println("Ingrese el primer número: ");
                    int a = Integer.parseInt(scanner.nextLine());
                    System.out.println("Ingrese el segundo número: ");
                    int b = Integer.parseInt(scanner.nextLine());
                    System.out.println("El resultado de la suma es: " + operations.sum(a, b));
                    menu();
                    break;

                 case 2: 
                    System.out.println("Selecciono restar: ");
                    System.out.println("Ingrese el primer número: ");
                    int c = Integer.parseInt(scanner.nextLine());
                    System.out.println("Ingrese el segundo número: ");
                    int d = Integer.parseInt(scanner.nextLine());
                    System.out.println("El resultado de la resta es: " + operations.subtract(c, d));
                    menu();
                    break;

                    case 3:
                        System.out.println("Selecciono multiplicar: ");
                        System.out.println("Ingrese el primer número: ");
                        int e = Integer.parseInt(scanner.nextLine());
                        System.out.println("Ingrese el segundo número: ");
                        int f = Integer.parseInt(scanner.nextLine());
                        System.out.println("El resultado de la multiplicacion es: " + operations.multiply(e, f));
                        menu();
                        break;




                    default:
                        System.out.println("Opcion no valida");
                        menu();
                        break;
            }
        }catch(NumberFormatException e){
            System.out.println("Ingresa un numero valido");
            menu();
        }
    }
}