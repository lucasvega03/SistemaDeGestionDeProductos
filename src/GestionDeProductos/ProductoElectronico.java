package GestionDeProductos;

public class ProductoElectronico extends Producto {
    private int periodoGarantia; // en meses

    public ProductoElectronico(String nombre, double precio, int periodoGarantia) {
        super(nombre, precio);
        this.periodoGarantia = periodoGarantia;
    }

    public int getPeriodoGarantia() {
        return periodoGarantia;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Producto Electronico:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Periodo de Garantia: " + periodoGarantia + " meses");
    }
}