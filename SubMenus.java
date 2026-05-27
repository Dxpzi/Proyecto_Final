import java.util.Scanner;

public class SubMenus {

    static Scanner sc = new Scanner(System.in);

    // Método que muestra el submenú de sistemas operativos y retorna la opción seleccionada.
    // Si el usuario ingresa un valor inválido, el método se llama a sí mismo (recursivo).
    public static String SeleccionarSO() {

        System.out.println("Seleccione Sistema Operativo:");
        System.out.println("1. Windows 7");
        System.out.println("2. Windows 10");
        System.out.println("3. Windows 11");
        System.out.print("Opción: ");

        int op = sc.nextInt();

        switch (op) {
            case 1:
                return "Windows 7";
            case 2:
                return "Windows 10";
            case 3:
                return "Windows 11";
            default:
                System.out.println("Opción inválida.");

                return SeleccionarSO(); // Recursivo
        }
    }

    public static String SeleccionarProcesador() {

        System.out.println("Seleccione Procesador:");
        System.out.println("1. AMD Ryzen");
        System.out.println("2. Intel Core i5");
        System.out.print("Opción: ");

        int op = sc.nextInt();

        switch (op) {
            case 1:
                return "AMD Ryzen";
            case 2:
                return "Intel Core i5";
            default:
                System.out.println("Opción inválida.");

                return SeleccionarProcesador();
        }
    }

    public static String SeleccionarAlmacenamiento() {

        System.out.println("Seleccione almacenamiento:");
        System.out.println("1. 256 GB");
        System.out.println("2. 512 GB");
        System.out.println("3. 1 TB");
        System.out.print("Opción: ");

        int op = sc.nextInt();

        switch (op) {
            case 1:
                return "256 GB";
            case 2:
                return "512 GB";
            case 3:
                return "1 TB";
            default:
                System.out.println("Opción inválida.");

                return SeleccionarAlmacenamiento();
        }

    }

}
