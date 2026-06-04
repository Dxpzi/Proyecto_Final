import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class GestorPrestamos {

    private ArrayList<EstudianteIngenieria> vectorIngenieria;
    private ArrayList<EstudianteDiseno> vectorDiseno;
    private Validaciones val;

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

        val = new Validaciones();
    }

    public void menuPrincipal() {

        int opcion;

        do {

            System.out.println("\n========= MENU PRINCIPAL =========");
            System.out.println("1. Estudiantes Ingeniería");
            System.out.println("2. Estudiantes Diseño");
            System.out.println("3. Imprimir Inventario");
            System.out.println("4. Mostrar pila devoluciones");
            System.out.println("5. Mostrar cola espera");
            System.out.println("6. Salir");
            System.out.print("Seleccione: ");

            opcion = val.validarEntero(sc);

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
                    System.out.println("---------------------------------------");
                    System.out.println("Saliendo...");
                    System.out.println("---------------------------------------");
                    break;

                default:
                    System.out.println("---------------------------------------");
                    System.out.println("Opción inválida.");
                    System.out.println("---------------------------------------");
            }

        } while (opcion != 6);
    }

    public void menuIngenieria() {

        int opc;

        do {

            System.out.println("\n===== INGENIERIA =====");
            System.out.println("1. Registrar préstamo");
            System.out.println("2. Modificar préstamo");
            System.out.println("3. Devolver equipo");
            System.out.println("4. Buscar equipo");
            System.out.println("5. Volver");
            System.out.print("Seleccione: ");

            opc = val.validarEntero(sc);

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
                    System.out.println("---------------------------------------");
                    System.out.println("Volviendo...");
                    System.out.println("---------------------------------------");
                    break;

                default:
                    System.out.println("---------------------------------------");
                    System.out.println("Opción inválida.");
                    System.out.println("---------------------------------------");
            }

        } while (opc != 5);
    }

    public void menuDiseno() {

        int opc;

        do {

            System.out.println("\n===== DISENO =====");
            System.out.println("1. Registrar préstamo");
            System.out.println("2. Modificar préstamo");
            System.out.println("3. Devolver equipo");
            System.out.println("4. Buscar equipo");
            System.out.println("5. Volver");
            System.out.print("Seleccione: ");

            opc = val.validarEntero(sc);

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
                    System.out.println("---------------------------------------");
                    System.out.println("Volviendo...");
                    System.out.println("---------------------------------------");
                    break;

                default:
                    System.out.println("---------------------------------------");
                    System.out.println("Opción inválida.");
                    System.out.println("---------------------------------------");
            }

        } while (opc != 5);
    }

    // Métodos Ingeniería.
    public void registrarIngenieria() {

        System.out.println("\n===== REGISTRO INGENIERIA =====");

        System.out.print("Cedula: ");
        String cedula = val.validarCedula(sc);

        for (EstudianteIngenieria e : vectorIngenieria) {

            if (e.getCedula().equals(cedula)) {
                System.out.println("---------------------------------------");
                System.out.println("Ya existe un estudiante con esa cédula.");
                System.out.println("---------------------------------------");
                return;
            }
        }

        System.out.print("Nombre: ");
        String nombre = val.validarTexto(sc);

        System.out.print("Apellido: ");
        String apellido = val.validarTexto(sc);

        System.out.print("Telefono: ");
        String telefono = val.validarTelefono(sc);

        System.out.print("Numero de semestre: ");
        int semestre = val.validarSemestre(sc);

        System.out.print("Promedio acumulado: ");
        double promedio = val.validarPromedio(sc);

        System.out.print("Serial del equipo: ");
        String serial = val.validarSerial(sc);

        EstudianteIngenieria estudiante = new EstudianteIngenieria(
                cedula,
                nombre,
                apellido,
                telefono,
                semestre,
                promedio,
                serial);

        vectorIngenieria.add(estudiante);

        colaEspera.offer(cedula);
        System.out.println("---------------------------------------");
        System.out.println("Prestamo registrado correctamente.");
        System.out.println("---------------------------------------");
    }

    public void modificarIngenieria() {

        if (vectorIngenieria.isEmpty()) {

            System.out.println("No hay registros.");
            return;
        }

        System.out.print("Ingrese la cedula: ");

        String cedula = val.validarCedula(sc);

        for (EstudianteIngenieria e : vectorIngenieria) {

            if (e.getCedula().equals(cedula)) {

                System.out.print("Nuevo nombre: ");
                e.setNombre(val.validarTexto(sc));

                System.out.print("Nuevo apellido: ");
                e.setApellido(val.validarTexto(sc));

                System.out.print("Nuevo telefono: ");
                e.setTelefono(val.validarTelefono(sc));

                System.out.print("Nuevo semestre: ");
                e.setNumeroSemestre(val.validarSemestre(sc));

                System.out.print("Nuevo promedio: ");
                e.setPromedioAcumulado(val.validarPromedio(sc));

                System.out.println("---------------------------------------");
                System.out.println("Registro actualizado.");
                System.out.println("---------------------------------------");

                return;
            }
        }

        System.out.println("---------------------------------------");
        System.out.println("No se encontró el estudiante.");
        System.out.println("---------------------------------------");
    }

    public void devolverIngenieria() {
        
        if (vectorIngenieria.isEmpty()) {


            System.out.println("No hay registros.");
            return;
        }

        System.out.print("Ingrese la cedula: ");

        String cedula = val.validarCedula(sc);

        for (int i = 0; i < vectorIngenieria.size(); i++) {

            if (vectorIngenieria.get(i).getCedula().equals(cedula)) {

                pilaDevoluciones.push(cedula);

                vectorIngenieria.remove(i);

                System.out.println("---------------------------------------");
                System.out.println("Equipo devuelto correctamente.");
                System.out.println("---------------------------------------");

                return;
            }
        }

        System.out.println("---------------------------------------");
        System.out.println("No se encontró el estudiante.");
        System.out.println("---------------------------------------");
    }

    public void buscarIngenieria() {

        if (vectorIngenieria.isEmpty()) {

            System.out.println("No hay registros.");
            return;
        }

        System.out.print("Ingrese la cedula: ");

        String cedula = val.validarCedula(sc);

        for (EstudianteIngenieria e : vectorIngenieria) {

            if (e.getCedula().equals(cedula)) {

                System.out.println("---------------------------------------");
                System.out.println("\nRegistro encontrado:");
                System.out.println(e);
                System.out.println("---------------------------------------");

                return;
            }
        }

        System.out.println("---------------------------------------");
        System.out.println("No se encontró el estudiante.");
        System.out.println("---------------------------------------");

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

        if (vectorDiseno.isEmpty()) {
            System.out.println("No hay registros de diseño para modificar.");
            return;
        }

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

        if (vectorDiseno.isEmpty()) {
            System.out.println("No hay registros de diseño para buscar.");
            return;
        }

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

}