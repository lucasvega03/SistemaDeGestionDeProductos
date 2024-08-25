package GestionDeProductos;

public class Ropa extends Producto {
    private String talle;

    public Ropa(String nombre, double precio, String talle) {
        super(nombre, precio);
        this.talle = talle;
    }

    public String getTalle() {
        return talle;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Ropa:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Talle: " + talle);
    }
}
