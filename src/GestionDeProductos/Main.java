package GestionDeProductos;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Producto alimento = new ProductoAlimenticio("Leche Larga Vida Clasica La Serenisma 200 Ml.", 725.00 , LocalDate.of(2024, 9, 1));
        Producto electronico = new ProductoElectronico("Televisor Smart Tv Philips 43 Full HD", 494848.80, 24);
        Producto ropa = new Ropa("Remera Vans Modelo What's Inside", 39990.00, "XL");

        alimento.mostrarDetalles();
        System.out.println();
        electronico.mostrarDetalles();
        System.out.println();
        ropa.mostrarDetalles();
    }
}