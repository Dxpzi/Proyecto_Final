import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Importar {

    public void importar() {

        try (BufferedReader br = new BufferedReader(new FileReader("prestamos.txt"))) {

            String linea;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
