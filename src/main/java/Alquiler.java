import java.time.LocalDate;

public class Alquiler {
    private String codigo;
    private LocalDate fecha;
    private int diasContratado;

    private Cliente cliente;
    private Vehiculo vehiculo;

    public Alquiler(String codigo, LocalDate fecha, int diasContratado, Cliente cliente, Vehiculo vehiculo) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.diasContratado = diasContratado;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getDiasContratado() {
        return diasContratado;
    }

    public void setDiasContratado(int diasContratado) {
        this.diasContratado = diasContratado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}
