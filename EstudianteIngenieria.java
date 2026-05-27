public class EstudianteIngenieria extends Estudiante {
    
    private int numeroSemestre;
    private double promedioAcumulado;
    private String serialEquipo;

    public EstudianteIngenieria() {
    
    }
    public EstudianteIngenieria(String cedula, String nombre, String apellido, String telefono, int numeroSemestre,
            double promedioAcumulado, String serialEquipo) {
        super(cedula, nombre, apellido, telefono);
        this.numeroSemestre = numeroSemestre;
        this.promedioAcumulado = promedioAcumulado;
        this.serialEquipo = serialEquipo;

    }   
    public int getNumeroSemestre() {
        return numeroSemestre;
    }
    public void setNumeroSemestre(int numeroSemestre) {
        this.numeroSemestre = numeroSemestre;
    }
    public double getPromedioAcumulado() {
        return promedioAcumulado;
    }
    public void setPromedioAcumulado(double promedioAcumulado) {
        this.promedioAcumulado = promedioAcumulado;
    }
    public String getSerialEquipo() {
        return serialEquipo;
    }
     // No existe setSerialEquipo() porque el serial no debe modificarse después del registro.

    @Override
    public String toString() {
       
        // Usa el toString() de la clase padre
        return super.toString() +
                "\nSemestre: " + numeroSemestre +
                "\nPromedio: " + promedioAcumulado +
                "\nSerial Equipo: " + serialEquipo;
    }
}
