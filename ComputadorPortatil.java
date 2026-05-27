public class ComputadorPortatil extends Equipo {

    private String sistemaOperativo;
    private String procesador;

    public ComputadorPortatil() {
    }

    public ComputadorPortatil(String serial, String marca, double tamano, double precio, String sistemaOperativo,
            String procesador) {
        super(serial, marca, tamano, precio);
        this.sistemaOperativo = sistemaOperativo;
        this.procesador = procesador;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public String toString() {

        // Usa el toString() de la clase padre
        return super.toString() +
                "\nSistema Operativo: " + sistemaOperativo +
                "\nProcesador: " + procesador;
    }
}
