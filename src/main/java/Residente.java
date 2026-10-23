public class Residente extends Cliente{
    private String direccionResidencia;

    public Residente(String nombre, String correo, String documento, String direccionResidencia) {
        super(nombre, correo, documento);
        this.direccionResidencia = direccionResidencia;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    //
    @Override
    public void mostrarDatos() {
        System.out.println("RESIDENTE:");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Correo: "+getCorreo());
        System.out.println("Documento: "+getDocumento());
        System.out.println("Direccion de la residencia: "+getDireccionResidencia());
    }
}
