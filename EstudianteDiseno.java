public class EstudianteDiseno extends Estudiante {

    private String modalidadEstudio;
    private int cantidadAsignaturas;
    private String serialEquipo;

    public EstudianteDiseno() {
    }

    public EstudianteDiseno(String cedula, String nombre, String apellido, String telefono, String modalidadEstudio,
            int cantidadAsignaturas, String serialEquipo) {
        super(cedula, nombre, apellido, telefono);
        this.modalidadEstudio = modalidadEstudio;
        this.cantidadAsignaturas = cantidadAsignaturas;
        this.serialEquipo = serialEquipo;
    }

    public String getModalidadEstudio() {
        return modalidadEstudio;
    }

    public void setModalidadEstudio(String modalidadEstudio) {
        this.modalidadEstudio = modalidadEstudio;
    }

    public int getCantidadAsignaturas() {
        return cantidadAsignaturas;
    }

    public void setCantidadAsignaturas(int cantidadAsignaturas) {
        this.cantidadAsignaturas = cantidadAsignaturas;
    }

    public String getSerialEquipo() {
        return serialEquipo;
    }

    // No existe setSerialEquipo() porque el serial no debe modificarse.

       @Override
    public String toString() {
        
        return super.toString() +
                "\nModalidad: " + modalidadEstudio +
                "\nCantidad Asignaturas: " + cantidadAsignaturas +
                "\nSerial Equipo: " + serialEquipo;
    }

}
