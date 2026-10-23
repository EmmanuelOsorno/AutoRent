import java.time.LocalDate;

public class Camioneta extends Vehiculo{
    private double capacidad;

    public Camioneta(String placa, String marca, String modelo, LocalDate anioFabricacion, Estado estado, double capacidad) {
        super(placa, marca, modelo, anioFabricacion, estado);
        this.capacidad = capacidad;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public double calcularTarifa(int dias) {
        double tarifaCamioneta=(50000*TARIFA)*dias;
        return tarifaCamioneta;
    }

    //
    @Override
    public void mostrarDatos() {
        System.out.println("Datos de la camioneta:");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Año de fabricación: " + getAnioFabricacion());
        System.out.println("Estado: " + getEstado());
        System.out.println("Capacidad (Kg): " + getCapacidad());
    }
}
