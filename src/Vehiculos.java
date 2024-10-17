public class Vehiculos {

    String modelo,color,placa;
    double precio;
    int anio;

    public Vehiculos(String modelo, String color, int anio, String placa, double precio){
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
        this.placa = placa;
        this.precio = precio;
    }
    public void infoVehiculos(){
        System.out.println("Placa: " + placa);
        System.out.println("Precio: $" + precio);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Año: " + anio);
    }





//COnstructor vacio
    public Vehiculos(){
        this.modelo = "Ferrari";
        this.color = "Azul";
        this.anio = 2012;
        this.placa = "PSI-345";
        this.precio = 6000;
    }
    public void infoVehiculosVACIO(){
        System.out.println("Placa: " + placa);
        System.out.println("Precio: $" + precio);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Año: " + anio);
    }









//SOLO UN ATRIBUTO
    public Vehiculos(String modelo){
        this.modelo = modelo;
    }
    public void modelado(){
        System.out.println("");
        System.out.println("El modelo es: " + modelo);
    }
}