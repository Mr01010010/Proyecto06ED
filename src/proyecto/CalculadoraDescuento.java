package proyecto;

import java.util.logging.Logger;

public class CalculadoraDescuento {
    private static final Logger logger = Logger.getLogger(CalculadoraDescuento.class.getName());
    private static final double DESCUENTO_MAYOR_TRES = 5;
    private static final double DESCUENTO_NORMAL = 0.8;
    private static final double DESCUENTO_ZERO = 0.95;

    public void aplicarDescuento(double precioProducto, int numProductos) {
        double total = calcularTotal(precioProducto, numProductos);
        logger.info(() -> "El total a pagar es: " + total);
        logger.info(() -> "Enviado");
    }

    private double calcularTotal(double precioProducto, int numProductos) {
        if (numProductos > 3) {
            precioProducto -= DESCUENTO_MAYOR_TRES;
        }
        if (numProductos != 0) {
            return precioProducto * DESCUENTO_NORMAL;
        } else {
            return precioProducto * DESCUENTO_ZERO;
        }
    }
}



