import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class GestorPrestamos {

    private ArrayList<EstudianteIngenieria> vectorIngenieria;
    private ArrayList<EstudianteDiseno> vectorDiseno;

    // PILA
    private Stack<String> pilaDevoluciones;

    // COLA
    private Queue<String> colaEspera;

    private Scanner sc;

    public GestorPrestamos() {

        vectorIngenieria = new ArrayList<>();
        vectorDiseno = new ArrayList<>();

        pilaDevoluciones = new Stack<>();

        colaEspera = new LinkedList<>();

        sc = new Scanner(System.in);
    }

    public void menuPrincipal() {

        int opcion;

        do {

            System.out.println("\n========= MENÚ PRINCIPAL =========");
            System.out.println("1. Estudiantes Ingeniería");
            System.out.println("2. Estudiantes Diseño");
            System.out.println("3. Imprimir Inventario");
            System.out.println("4. Mostrar pila devoluciones");
            System.out.println("5. Mostrar cola espera");
            System.out.println("6. Salir");
            System.out.print("Seleccione: ");

            opcion = validarEntero();

            switch (opcion) {

                case 1:
                    menuIngenieria();
                    break;

                case 2:
                    menuDiseno();
                    break;

                case 3:
                    imprimirInventario();
                    break;

                case 4:
                    mostrarPila();
                    break;

                case 5:
                    mostrarCola();
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 6);
    }

    public void menuIngenieria() {

        int opc;

        do {

            System.out.println("\n===== INGENIERÍA =====");
            System.out.println("1. Registrar préstamo");
            System.out.println("2. Modificar préstamo");
            System.out.println("3. Devolver equipo");
            System.out.println("4. Buscar equipo");
            System.out.println("5. Volver");
            System.out.print("Seleccione: ");

            opc = validarEntero();

            switch (opc) {

                case 1:
                    registrarIngenieria();
                    break;

                case 2:
                    modificarIngenieria();
                    break;

                case 3:
                    devolverIngenieria();
                    break;

                case 4:
                    buscarIngenieria();
                    break;

                case 5:
                    System.out.println("Volviendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opc != 5);
    }

    public void menuDiseno() {

        int opc;

        do {

            System.out.println("\n===== DISEÑO =====");
            System.out.println("1. Registrar préstamo");
            System.out.println("2. Modificar préstamo");
            System.out.println("3. Devolver equipo");
            System.out.println("4. Buscar equipo");
            System.out.println("5. Volver");
            System.out.print("Seleccione: ");

            opc = validarEntero();

            switch (opc) {

                case 1:
                    registrarDiseno();
                    break;

                case 2:
                    modificarDiseno();
                    break;

                case 3:
                    devolverDiseno();
                    break;

                case 4:
                    buscarDiseno();
                    break;

                case 5:
                    System.out.println("Volviendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opc != 5);
    }

    // Métodos Ingeniería.
    public void registrarIngenieria() {

        System.out.println("Registro Ingeniería");

        System.out.print("Ingrese cédula: ");
        String cedula = sc.nextLine();

        colaEspera.offer(cedula);

        System.out.println("Estudiante agregado a la cola.");
    }

    public void modificarIngenieria() {

        System.out.println("Modificar Ingeniería");
    }

    public void devolverIngenieria() {

        System.out.println("Devolver Ingeniería");

        System.out.print("Ingrese cédula: ");
        String cedula = sc.nextLine();

        pilaDevoluciones.push(cedula);

        System.out.println("Devolución registrada en pila.");
    }

    public void buscarIngenieria() {

        System.out.println("Buscar Ingeniería");
    }

    // Métodos diseño.
    public void registrarDiseno() {

        System.out.println("Registro Diseño");

        System.out.print("Ingrese cédula: ");
        String cedula = sc.nextLine();

        colaEspera.offer(cedula);

        System.out.println("Estudiante agregado a la cola.");
    }

    public void modificarDiseno() {

        System.out.println("Modificar Diseño");
    }

    public void devolverDiseno() {

        System.out.println("Devolver Diseño");

        System.out.print("Ingrese cédula: ");
        String cedula = sc.nextLine();

        pilaDevoluciones.push(cedula);

        System.out.println("Devolución registrada en pila.");
    }

    public void buscarDiseno() {

        System.out.println("Buscar Diseño");
    }

    // Inventario.
    public void imprimirInventario() {

        System.out.println("\n===== INVENTARIO INGENIERÍA =====");

        if (vectorIngenieria.isEmpty()) {

            System.out.println("No hay registros.");
        }

        for (EstudianteIngenieria e : vectorIngenieria) {

            System.out.println(e);
        }

        System.out.println("\n===== INVENTARIO DISEÑO =====");

        if (vectorDiseno.isEmpty()) {

            System.out.println("No hay registros.");
        }

        for (EstudianteDiseno d : vectorDiseno) {

            System.out.println(d);
        }
    }

    // Mostrar pila
    public void mostrarPila() {

        System.out.println("\n===== PILA DEVOLUCIONES =====");

        if (pilaDevoluciones.isEmpty()) {

            System.out.println("La pila está vacía.");

        } else {

            System.out.println(pilaDevoluciones);
        }
    }

    // Mostrar cola
    public void mostrarCola() {

        System.out.println("\n===== COLA ESPERA =====");

        if (colaEspera.isEmpty()) {

            System.out.println("La cola está vacía.");

        } else {

            System.out.println(colaEspera);
        }
    }

    public int validarEntero() {

        while (true) {

            try {

                return Integer.parseInt(sc.nextLine());

            } catch (Exception e) {

                System.out.print("Ingrese un número válido: ");
            }
        }
    }
}