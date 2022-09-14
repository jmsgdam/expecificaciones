
package clases;


public class Producto {
    
    public static String rutaProducto = "\\\\192.168.120.253\\dpto cargas\\CHEMA\\expecificaciones\\productos.txt";
    
    private String idProducto;
    private String nombreProducto;
    private String p1,p2,p3,p4,p5,p6,p7,p8;

    public Producto(String idProducto, String nombreProducto, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.p5 = p5;
        this.p6 = p6;
        this.p7 = p7;
        this.p8 = p8;
    }//fin constructor

    public static String getRutaProducto() {
        return rutaProducto;
    }

    public static void setRutaProducto(String rutaProducto) {
        Producto.rutaProducto = rutaProducto;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getP1() {
        return p1;
    }

    public void setP1(String p1) {
        this.p1 = p1;
    }

    public String getP2() {
        return p2;
    }

    public void setP2(String p2) {
        this.p2 = p2;
    }

    public String getP3() {
        return p3;
    }

    public void setP3(String p3) {
        this.p3 = p3;
    }

    public String getP4() {
        return p4;
    }

    public void setP4(String p4) {
        this.p4 = p4;
    }

    public String getP5() {
        return p5;
    }

    public void setP5(String p5) {
        this.p5 = p5;
    }

    public String getP6() {
        return p6;
    }

    public void setP6(String p6) {
        this.p6 = p6;
    }

    public String getP7() {
        return p7;
    }

    public void setP7(String p7) {
        this.p7 = p7;
    }

    public String getP8() {
        return p8;
    }

    public void setP8(String p8) {
        this.p8 = p8;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + 
                ", p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + ", p4=" + p4 + ", p5=" + p5 + ", p6=" +
                p6 + ", p7=" + p7 + ", p8=" + p8 + '}';
    }
    
    
    
    
    
    
    
}//fin clase Producto
