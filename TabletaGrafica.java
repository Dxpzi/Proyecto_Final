public class TabletaGrafica extends Equipo {

    private String almacenamiento;
    private double peso;

    public TabletaGrafica() {
    }

    public TabletaGrafica(String serial, String marca, double tamano, double precio, String almacenamiento,
            double peso) {
        super(serial, marca, tamano, precio);
        this.almacenamiento = almacenamiento;
        this.peso = peso;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {

        // Usa el toString() de la clase padre
        return super.toString() +
                "\nAlmacenamiento: " + almacenamiento +
                "\nPeso: " + peso + " kg";
    }

}
