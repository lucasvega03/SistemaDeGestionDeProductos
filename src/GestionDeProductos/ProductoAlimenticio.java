package GestionDeProductos;

import java.time.LocalDate;

public class ProductoAlimenticio extends Producto {
    private LocalDate fechaVencimiento;

    public ProductoAlimenticio(String nombre, double precio, LocalDate fechaVencimiento) {
        super(nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
    }

    public boolean estaProximoAVencer() {
        LocalDate hoy = LocalDate.now();
        return fechaVencimiento.minusDays(7).isBefore(hoy);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Producto Alimenticio:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Fecha de Vencimiento: " + fechaVencimiento);
        System.out.println("Proximo a Vencer: " + (estaProximoAVencer() ? "Sí" : "No"));
    }
}