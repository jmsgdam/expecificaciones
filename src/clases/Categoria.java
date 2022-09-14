
package clases;


public class Categoria {
    
    public static String rutaCategoria = "\\\\192.168.120.253\\dpto cargas\\CHEMA\\expecificaciones\\categoria.txt";
    
    private String idCategoria;
    private String nombreCategoria;

    public Categoria(String idCategoria, String nombreCategoria) {
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
    }//fin constructor

    public static String getRutaCategoria() {
        return rutaCategoria;
    }

    public static void setRutaCategoria(String rutaCategoria) {
        Categoria.rutaCategoria = rutaCategoria;
    }

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    @Override
    public String toString() {
        return "Categoria{" + "idCategoria=" + idCategoria + ", nombreCategoria=" + nombreCategoria + '}';
    }
    
    
    
    
}//fin clase Categoria
