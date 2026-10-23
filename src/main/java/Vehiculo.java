import java.time.LocalDate;

public abstract class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private LocalDate anioFabricacion;
    public final static double TARIFA=10000;

    private Estado estado;

    public Vehiculo(String placa, String marca, String modelo, LocalDate anioFabricacion, Estado estado) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.estado = estado;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(LocalDate anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    //
    public abstract double calcularTarifa(int dias);

    //
    public void mostrarDatos(){
        System.out.println("Mostrando datos...");
    }

    //
    @Override
    public String toString() {
        return "placa:" + placa +
                "\nmarca: " + marca +
                "\nmodelo='" + modelo +
                "\naño de fabricacion: " + anioFabricacion +
                "\nestado: " + estado;
    }
}
