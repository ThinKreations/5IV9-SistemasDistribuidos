package e3.convertidorn;

import java.io.*;

/**
 * @author jnapo
 **/
public class Cadena implements Serializable{
    
    private String cadena;
    private String secuenciaF;
    
    
    public Cadena() {
    }

    public Cadena(String cadena, String secuenciaF) {
        this.cadena = cadena;
        this.secuenciaF = secuenciaF;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public String getSecuenciaF() {
        return secuenciaF;
    }

    public void setSecuenciaF(String secuenciaF) {
        this.secuenciaF = secuenciaF;
    }
    
}
