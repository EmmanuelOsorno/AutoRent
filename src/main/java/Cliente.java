public class Cliente {
    private String nombre;
    private String correo;
    private String documento;

    public Cliente(String nombre, String correo, String documento) {
        this.nombre = nombre;
        this.correo = correo;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    //
    public void mostrarDatos() {
        System.out.println("Datos del cliente...");
    }
}
