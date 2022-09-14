
package clases;


public class formato_productos {
    
    public static String rutaFormato_Producto = "\\\\192.168.120.253\\dpto cargas\\CHEMA\\expecificaciones\\productos_formatos.txt";
    
    private String idProducto;
    private String idFormato;
    private String tipoFormato;
    private int bidXpalets;
    private int pesoMedio;
    private int numeroAlturas;
    private String categoria;
    private int kgBolsa;
    private int bolsasXbidon;

    public formato_productos(String idProducto, String idFormato, String tipoFormato, int bidXpalets, int pesoMedio, int numeroAlturas, String categoria, int kgBolsa, int bolsasXbidon) {
        this.idProducto = idProducto;
        this.idFormato = idFormato;
        this.tipoFormato = tipoFormato;
        this.bidXpalets = bidXpalets;
        this.pesoMedio = pesoMedio;
        this.numeroAlturas = numeroAlturas;
        this.categoria = categoria;
        this.kgBolsa = kgBolsa;
        this.bolsasXbidon = bolsasXbidon;
    }//fin constructor

    public static String getRutaFormato_Producto() {
        return rutaFormato_Producto;
    }

    public static void setRutaFormato_Producto(String rutaFormato_Producto) {
        formato_productos.rutaFormato_Producto = rutaFormato_Producto;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getIdFormato() {
        return idFormato;
    }

    public void setIdFormato(String idFormato) {
        this.idFormato = idFormato;
    }

    public String getTipoFormato() {
        return tipoFormato;
    }

    public void setTipoFormato(String tipoFormato) {
        this.tipoFormato = tipoFormato;
    }

    public int getBidXpalets() {
        return bidXpalets;
    }

    public void setBidXpalets(int bidXpalets) {
        this.bidXpalets = bidXpalets;
    }

    public int getPesoMedio() {
        return pesoMedio;
    }

    public void setPesoMedio(int pesoMedio) {
        this.pesoMedio = pesoMedio;
    }

    public int getNumeroAlturas() {
        return numeroAlturas;
    }

    public void setNumeroAlturas(int numeroAlturas) {
        this.numeroAlturas = numeroAlturas;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getKgBolsa() {
        return kgBolsa;
    }

    public void setKgBolsa(int kgBolsa) {
        this.kgBolsa = kgBolsa;
    }

    public int getBolsasXbidon() {
        return bolsasXbidon;
    }

    public void setBolsasXbidon(int bolsasXbidon) {
        this.bolsasXbidon = bolsasXbidon;
    }

    @Override
    public String toString() {
        return "formato_productos{" + "idProducto=" + idProducto + ", idFormato=" + idFormato + ", tipoFormato=" + tipoFormato + 
                ", bidXpalets=" + bidXpalets + ", pesoMedio=" + pesoMedio + ", numeroAlturas=" + numeroAlturas + ", categoria=" + categoria + 
                ", kgBolsa=" + kgBolsa + ", bolsasXbidon=" + bolsasXbidon + '}';
    }
    
    
    
    
}//fin clase formato_productos
