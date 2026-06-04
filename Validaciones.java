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

        if (!txt.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ¥¤ ]+")) {

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

        double valor = sc.nextDouble();
        sc.nextLine();

        return valor;
    }

    public String validarCedula(Scanner sc) {

        String cedula = sc.nextLine().trim();

        if (!cedula.matches("\\d+")) {

            System.out.println("La cédula solo puede contener números. Intente nuevamente:");

            return validarCedula(sc);
        }

        return cedula;
    }

    public String validarTelefono(Scanner sc) {

        String telefono;

        do {
            telefono = sc.nextLine();

            if (!telefono.matches("\\d{10}")) {
                System.out.print("Ingrese un teléfono válido: ");
            }

        } while (!telefono.matches("\\d{10}"));

        return telefono;
    }

    public int validarSemestre(Scanner sc) {

        int semestre;

        while (true) {

            semestre = validarEntero(sc);

            if (semestre >= 1 && semestre <= 10) {
                return semestre;
            }

            System.out.print("Ingrese un semestre válido (1-10): ");
        }
    }

    public double validarPromedio(Scanner sc) {

        double promedio;

        while (true) {

            promedio = validarDouble(sc);

            if (promedio >= 0 && promedio <= 5) {
                return promedio;
            }

            System.out.print("Ingrese un promedio válido (0 - 5): ");
        }
    }

}