// abstract indica que esta es una clase padre/base.
// Sirve para que otras clases hereden de ella.
// No se pueden crear objetos directamente de esta clase.

public abstract class Estudiante {

    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;

    public Estudiante() {
    }

    public Estudiante(String cedula, String nombre, String apellido, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }
    // No se crea setCedula() porque la cédula no debe modificarse.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {

       return "Cedula: " + cedula +
               "\nNombre: " + nombre +
               "\nApellido: " + apellido +
               "\nTelefono: " + telefono;
    }
}
