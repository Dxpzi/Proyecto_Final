import java.util.Scanner;

public class Validaciones {

    public int validarEntero(Scanner sc) {
    if (!sc.hasNextInt()) {
        System.out.println("Por favor ingrese un número válido:");
        sc.nextLine();
        return validarEntero(sc);
    }
    int num = sc.nextInt();

    sc.nextLine(); 
    
    return num;
    }

    public String validarTexto(Scanner sc) {

        String txt = sc.nextLine().trim();

        if (!txt.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {

            System.out.println("No se permiten números ni caracteres especiales. Intente nuevamente:");
            
            return validarTexto(sc); 
        }
        return txt;
    }

    public String validarSN(Scanner sc) {

        String opt = sc.nextLine().trim().toUpperCase();

        if (!opt.equals("S") && !opt.equals("N")) {

            System.out.println("Solo puede ingresar S o N. Intente nuevamente:");

            return validarSN(sc); 
        }
        return opt;
    }

    public String validarSerial(Scanner sc) {

        String serial = sc.nextLine().trim();

        if (!serial.matches("[a-zA-Z0-9]+")) {

            System.out.println("El serial solo acepta letras y números. Intente nuevamente:");
           
            return validarSerial(sc); 
        }
        return serial;
    }

    public double validarDouble(Scanner sc) {

        if (!sc.hasNextDouble()) {
           
            System.out.println("Ingrese un valor numérico válido:");
            
            sc.nextLine();
            
            return validarDouble(sc); 
        }
        return sc.nextDouble();
    }

}