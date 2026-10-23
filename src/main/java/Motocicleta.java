import java.time.LocalDate;

public class Motocicleta extends Vehiculo{
    private int cilindraje;

    public Motocicleta(String placa, String marca, String modelo, LocalDate anioFabricacion, Estado estado, int cilindraje) {
        super(placa, marca, modelo, anioFabricacion, estado);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public double calcularTarifa(int dias) {
        double tarifaMoto=(TARIFA-(TARIFA*0.10))*dias;
        return tarifaMoto;
    }

    //
    @Override
    public void mostrarDatos() {
        System.out.println("MOTOCICLETA:");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Año de fabricación: " + getAnioFabricacion());
        System.out.println("Estado: " + getEstado());
        System.out.println("Numero de cilindraje: " + getCilindraje());
    }
}
