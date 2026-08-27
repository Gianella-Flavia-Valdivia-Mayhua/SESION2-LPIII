package codigo1;

public class Coche {
    private String marca;
    private String modelo;
    private int añoFabrica;
    private double precio;
    private int velocidadMaxima;
    private int potenciaMotor;
    private boolean enMarcha;

    public Coche(String marca, String modelo) {
        this.marca = "Sin marca";
        this.modelo = "Sin modelo";
        this.añoFabrica = 2019;
        this.precio = 0.00;
        this.velocidadMaxima = 0;
        this.potenciaMotor = 0;
        this.enMarcha = false;
    }

    public Coche(String marca, String modelo, int añoFabrica, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabrica = añoFabrica;
        this.precio = precio;
        this.enMarcha = false;
    }

    public boolean aplicarDescuento(double precio) {
        if (añoFabrica < 2010) {
            double descuento = this.precio * 0.15;
            this.precio = this.precio - descuento;
            System.out.println("Se le aplicó un descuento del 15% al vehículo " + modelo);
            System.out.println("Su precio con descuento es: S/. " + this.precio);
            return true;
        } else {
            System.out.println("No se aplicó descuento al vehículo " + modelo);
            return false;
        }
    }

    public void encender() {
        enMarcha = true;
        System.out.println("El coche " + modelo + " se ha encendido.");
    }

    public void apagar() {
        enMarcha = false;
        System.out.println("El coche " + modelo + " se ha apagado.");
    }

    public void acelerar() {
        if (enMarcha) {
            System.out.println("El coche " + modelo + " está acelerando.");
        } else {
            System.out.println("Primero encienda el coche.");
        }
    }

    public void frenar() {
        if (enMarcha) {
            System.out.println("El coche " + modelo + " está frenando.");
        } else {
            System.out.println("El coche está apagado, no se puede frenar.");
        }
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

    public int getAñoFabrica() {
        return añoFabrica;
    }

    public void setAñoFabrica(int añoFabrica) {
        this.añoFabrica = añoFabrica;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public boolean isEnMarcha() {
        return enMarcha;
    }

    public void setEnMarcha(boolean enMarcha) {
        this.enMarcha = enMarcha;
    }

    public void Mostrar() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + añoFabrica);
        System.out.println("Precio: S/. " + precio);
    }
}
