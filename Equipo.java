public abstract class Equipo {

    private String serial;
    private String marca;
    private double tamano;
    private double precio;

    public Equipo() {
    }

    public Equipo(String serial, String marca, double tamano, double precio) {
        this.serial = serial;
        this.marca = marca;
        this.tamano = tamano;
        this.precio = precio;
    }

    public String getSerial() {
        return serial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override

    public String toString() {

        return "Serial: " + serial +
                "\nMarca: " + marca +
                "\nTamano: " + tamano +
                "\nPrecio: " + precio;
    }

}