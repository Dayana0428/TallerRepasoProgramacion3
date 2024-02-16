import java.time.LocalDateTime;

public class ProductoEnvasado extends Producto
{
    LocalDateTime fechaEnvasado;
    Double pesoEnvase;
    String paisOrigen;

    public ProductoEnvasado(LocalDateTime fechaEnvasado,
                            Double pesoEnvase,
                            String paisOrigen,
                            String codigoProducto,
                            String descripcion,
                            Double valorUnitario,
                            int cantExistente) {
        super(codigoProducto, descripcion, valorUnitario, cantExistente);
        this.fechaEnvasado = fechaEnvasado;
        this.pesoEnvase = pesoEnvase;
        this.paisOrigen = paisOrigen;
    }

    public LocalDateTime getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDateTime fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public Double getPesoEnvase() {
        return pesoEnvase;
    }

    public void setPesoEnvase(Double pesoEnvase) {
        this.pesoEnvase = pesoEnvase;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
}
