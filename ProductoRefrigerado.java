public class ProductoRefrigerado extends Producto {

    String codigoAprobacion;
    int tempRefrigeracion;
    public ProductoRefrigerado(String codigoAprobacion, int tempRefrigeracion, String codigoProducto, String descripcion, Double valorUnitario, int cantExistente) {
        super(codigoProducto, descripcion, valorUnitario, cantExistente);
        this.codigoAprobacion = codigoAprobacion;
        this.tempRefrigeracion = tempRefrigeracion;
    }

    public String getCodigoAprobacion() {
        return codigoAprobacion;
    }
    public void setCodigoAprobacion(String codigoAprobacion) {
        this.codigoAprobacion = codigoAprobacion;
    }

    public int getTempRefrigeracion() {
        return tempRefrigeracion;
    }

    public void setTempRefrigeracion(int tempRefrigeracion) {
        this.tempRefrigeracion = tempRefrigeracion;
    }
}
