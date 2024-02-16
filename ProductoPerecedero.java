import java.time.LocalDateTime;

public class ProductoPerecedero extends Producto
{

    LocalDateTime fechaVencimiento;
    public ProductoPerecedero(LocalDateTime fechaVencimiento, String codigoProducto, String descripcion, Double valorUnitario, int cantExistente) {
        super(codigoProducto, descripcion, valorUnitario, cantExistente);
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDateTime getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDateTime fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}
