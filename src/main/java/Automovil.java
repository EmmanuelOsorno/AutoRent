import java.time.LocalDate;

public class Automovil extends Vehiculo{
    private  int numeroPuertas;

    public Automovil(String placa, String marca, String modelo, LocalDate anioFabricacion, Estado estado, int numeroPuertas) {
        super(placa, marca, modelo, anioFabricacion, estado);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    //
    @Override
    public double calcularTarifa(int dias) {
        double tarifaAuto=(2000+TARIFA)*dias;
        return tarifaAuto;
    }

    //
    @Override
    public void mostrarDatos() {
        System.out.println("Datos del automovil:\n");
        System.out.println("Placa: "+getPlaca());
        System.out.println("Marca: "+getMarca());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Año de fabricación: "+getAnioFabricacion());
        System.out.println("Estado: "+getEstado());
        System.out.println("Cantidad de puertas: "+getNumeroPuertas());
    }
}
