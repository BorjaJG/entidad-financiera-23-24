package com.iesam.entidadFinanciera;
   import java.util.Scanner;

    public class Main {

        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            boolean salir = false;

            while (!salir) {
                System.out.println("Bienvenido al Banco");
                System.out.println("¿Es usted cliente o personal de trabajo del banco?");
                System.out.println("1. Cliente");
                System.out.println("2. Personal de trabajo del banco");
                System.out.println("3. Salir");

                int opcionPrincipal = scanner.nextInt();

                switch (opcionPrincipal) {
                    case 1:
                        menuCliente();
                        break;
                    case 2:
                        menuPersonal();
                        break;
                    case 3:
                        salir = true;
                        System.out.println("Gracias por utilizar nuestros servicios. ¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                }
            }
        }

        private static void menuCliente() {
            System.out.println("Opciones para clientes:");
            System.out.println("1. Ver datos y cuentas");
            System.out.println("2. Ver productos bancarios");
            System.out.println("3. Realizar transacciones");
            System.out.println("4. Volver al menú principal");

            int opcionCliente = scanner.nextInt();

            switch (opcionCliente) {
                case 1:
                    // Implementar lógica para ver datos y cuentas del cliente
                    break;
                case 2:
                    // Implementar lógica para ver productos bancarios
                    break;
                case 3:
                    // Implementar lógica para realizar transacciones
                    break;
                case 4:
                    System.out.println("Volviendo al menú principal");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }

        private static void menuPersonal() {
            System.out.println("Opciones para personal del banco:");
            System.out.println("1. Ver cuentas del banco");
            System.out.println("2. Modificar cuentas");
            System.out.println("3. Eliminar cuentas");
            System.out.println("4. Crear cuenta");
            System.out.println("5. Consultar cuentas");
            System.out.println("6. Volver al menú principal");

            int opcionPersonal = scanner.nextInt();

            switch (opcionPersonal) {
                case 1:
                    // Implementar lógica para ver cuentas del banco
                    break;
                case 2:
                    // Implementar lógica para modificar cuentas
                    break;
                case 3:
                    // Implementar lógica para eliminar cuentas
                    break;
                case 4:
                    // Implementar lógica para crear cuenta
                    break;
                case 5:
                    // Implementar lógica para consultar cuentas
                    break;
                case 6:
                    System.out.println("Volviendo al menú principal");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
    }

}