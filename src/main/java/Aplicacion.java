import java.time.LocalDate;

public class Aplicacion {
    static void main(){

        //instancias clientes
        Cliente turista1=new Turista("Emmanuel","emmanuel@","aaa111","visaEmmanuel");
        Cliente turista2=new Turista("Estefania","estefania@","bbb222","visaEstefania");

        Cliente residente1=new Residente("Valentina","valentina@","ccc333","Calle 30 con carrera 15");
        Cliente residente2=new Residente("Aiden","aiden@","ddd444","Calle 40 con carrera 20");

        //instancias vehiculos
        Vehiculo automovil1=new Automovil("abc","Renault","Pickup", LocalDate.of(2000,1,1),Estado.BUENO,4);
        Vehiculo automovil2=new Automovil("def","Chevrolet","Convertible",LocalDate.of(2005,2,5),Estado.BUENO,2);

        Vehiculo motocicleta1=new Motocicleta("ghi","Suzuki","Scooter",LocalDate.of(2001,3,10),Estado.BUENO,300);
        Vehiculo motocicleta2=new Motocicleta("jkl","Honda","Deportiva",LocalDate.of(1990,4,8),Estado.MALO,600);

        Vehiculo camioneta1=new Camioneta("mno","Hyundai","Todo terreno",LocalDate.of(2000,6,19),Estado.MALO,400);
        Vehiculo camioneta2=new Camioneta("pqr","Toyota","4x4",LocalDate.of(2012,9,20),Estado.BUENO,600);

    }
}
