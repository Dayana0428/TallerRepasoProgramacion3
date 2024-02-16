import java.util.List;

public class Almacen  {

    List<Cliente> listaClientes;
    List<Producto> listaProductos;

    public Almacen {
        this.listaClientes = new ArrayList<>();
        this.listaProductos = new ArrayList<>();
    }

    //  Metodo que agregar clientes a una lista
    public void agregarCliente( Cliente cliente) {
        listaClientes.add(cliente);
    }

    //Metodo que permite buscar y obtener un cliente mediante su id

    public Cliente obtenerCliente(String identificacion){
        for(Cliente cliente : listaClientes) {
            if(cliente.getId().equals(identificacion));
            return cliente;
        }
    }
    return null;

    // Metodo que permite actualizar la informacion de un cliente
    public void actualizarInformacion(String identificacion, Cliente informacionActualizada) {
        for (int i = 0; i < listaClientes.size(); i++) {
            Cliente cliente = listaClientes.get(i);
            if (cliente.getIdentificacion().equals(identificacion)) {
                listaClientes.set(i, informacionActualizada);
                break;
            }
        }
    }


    //Metodo para eliminar un cliente
    publuc void eliminarCliente(String identificacion){
        listaClientes.removeIf(cliente.getIdentificacion().equals(identificacion));
    }

    //Metodo para agregar un producto
    public void agregarProducto(Producto producto){
        listaProductos.add(producto);
    }

    //Metodo que permite obteenr un producto
    public Producto obtenerProducto (int codigo){
        for(Producto producto : listaProductos) {
            if(producto.getCodigo() == codigo) {
                return producto;
            }
        }
        return null;
    }

    // Método para actualizar la información de un producto
    public void actualizarProducto(int codigo, Producto productoActualizado) {
        for (int i = 0; i < listaProductos.size(); i++) {
            Producto producto = listaProductos.get(i);
            if (producto.getCodigo() == codigo) {
                listaProductos.set(i, productoActualizado);
                break;
            }
        }
    }

    // Método para eliminar un producto del almacén
    public void eliminarProducto(int codigo) {
        listaProductos.removeIf(producto -> producto.getCodigo() == codigo);
    }


}
