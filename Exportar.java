import java.io.FileWriter;
import java.io.IOException;

public class Exportar {

    public void exportar(GestorPrestamos gp) {

        try (FileWriter fw = new FileWriter("prestamos.txt")) {

            fw.write("=== INGENIERIA ===\n");

            for (EstudianteIngenieria e : gp.getIngenieria()) {
                fw.write(e.getCedula() + "," +
                         e.getNombre() + "," +
                         e.getApellido() + "," +
                         e.getSerialEquipo() + "\n");
            }

            fw.write("\n=== DISENO ===\n");

            for (EstudianteDiseno d : gp.getDiseno()) {
                fw.write(d.getCedula() + "," +
                         d.getNombre() + "," +
                         d.getApellido() + "," +
                         d.getSerialEquipo() + "\n");
            }

            System.out.println("Exportado correctamente");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}