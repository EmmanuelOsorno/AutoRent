public class Turista extends Cliente{
    private String visa;

    public Turista(String nombre, String correo, String documento, String visa) {
        super(nombre, correo, documento);
        this.visa = visa;
    }

    public String getVisa() {
        return visa;
    }

    public void setVisa(String visa) {
        this.visa = visa;
    }

    //

    @Override
    public void mostrarDatos() {
        System.out.println("Datos del turista:");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Correo: "+getCorreo());
        System.out.println("Documento: "+getDocumento());
        System.out.println("Visa: "+getVisa());
    }
}
