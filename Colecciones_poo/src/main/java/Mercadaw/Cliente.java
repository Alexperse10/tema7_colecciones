package Mercadaw;

public class Cliente {
    private String usuario;
    private String contraseña;
    private String direccion;
    private Pedido pedido;
    private boolean promociones;

    public Cliente(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.direccion = "calle falsa, 123";
        this.pedido = null;
        this.promociones=false;
    }

    public void crearpedido(){
        System.out.println("creando pedido....");
        this.pedido = new Pedido();
    }

    public void insertarProducto(Producto producto) {
            pedido.insertarProducto(producto);
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setPromociones(boolean promociones) {
        this.promociones = promociones;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public boolean isPromociones() {
        return promociones;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "usuario='" + usuario + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", direccion='" + direccion + '\'' +
                ", pedido=" + pedido +
                ", promociones=" + promociones +
                '}';
    }
}