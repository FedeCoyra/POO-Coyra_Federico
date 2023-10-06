package ar.edu.unlu.poo.ejercicio8;

public class Publicacion {
    protected String nombre;
    protected String editor;
    protected String telefonoProveedor;
    protected CantidadEjemplares cantidadEjemplares;

    public Publicacion(String nombre, String editor, String telefonoProveedor, CantidadEjemplares cantidadEjemplares) {
        this.nombre = nombre;
        this.editor = editor;
        this.telefonoProveedor = telefonoProveedor;
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEditor() {
        return editor;
    }
    public void setEditor(String editor) {
        this.editor = editor;
    }
    public String getTelefonoProveedor() {
        return telefonoProveedor;
    }
    public void setTelefonoProveedor(String telefonoProveedor) {
        this.telefonoProveedor = telefonoProveedor;
    }
    public CantidadEjemplares getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setCantidadEjemplares(CantidadEjemplares cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }

    @Override
    public String toString() {
        return "Publicacion{" +
                "NOMBRE= '" + nombre + '\'' +
                ", AUTOR= '" + editor + '\'' +
                ", TELEFONO= '" + telefonoProveedor + '\'' +
                ", CANTIDAD EJEMPLARES= " + cantidadEjemplares.getCantidad() +
                '}'+"\n";
    }
}