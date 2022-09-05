public class Libreria {

    private String nombre;
    private String encargado;
    private String direccion;
    private String telefono;
    private float valoracion;

    public Libreria(String nombre, String encargado, String direccion, String telefono, float valoracion) {
        this.nombre = nombre;
        this.encargado = encargado;
        this.direccion = direccion;
        this.telefono = telefono;
        this.valoracion = valoracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }

}
