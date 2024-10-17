public class LlamarClase {
    public static void main(String[] args) {

        Vehiculos auto1 = new Vehiculos("Ferrari", "Azul", 2012,"PDH-123", 6000);
        auto1.infoVehiculos();

        Vehiculos auto2 = new Vehiculos("Ferrari");
        auto2.modelado();

        Vehiculos auto3 = new Vehiculos();
        auto3.infoVehiculosVACIO();
    }
}
