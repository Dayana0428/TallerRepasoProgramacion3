public class Producto extends Almacen
{
    String codigoProducto;
    String descripcion;
    Double valorUnitario;
    int cantExistente;

    public Producto(String codigoProducto, String descripcion, Double valorUnitario, int cantExistente){
        this.codigoProducto = codigoProducto;
        this.descripcion = descripcion;
        this.valorUnitario = valorUnitario;
        this.cantExistente = cantExistente;

    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getCantExistente() {
        return cantExistente;
    }

    public void setCantExistente(int cantExistente) {
        this.cantExistente = cantExistente;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
