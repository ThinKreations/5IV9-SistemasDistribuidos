package e3.convertidorn;
/**
 * @author jnapo
 **/

import java.io.*;
import javax.swing.*;
import java.util.*;

public class Funciones {
    
    private File archivo= new File("Datos.dat");
    private static ObjectInputStream entrada;
    private static ObjectOutputStream salida;
    ArrayList<Cadena> cad=new ArrayList();
    
    public void Guardar() throws FileNotFoundException, IOException{
        
        ObjectOutputStream salida;
        FileOutputStream fo= new FileOutputStream(archivo);
        salida= new ObjectOutputStream(fo);
        salida.writeObject(cad);
        
        salida.close();
        
    }
    
    public void Leer() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream fi=new FileInputStream(archivo);
        ObjectInputStream entrada= new ObjectInputStream(fi);
        cad=(ArrayList)entrada.readObject();
        
        for(Cadena c:cad){
            
            JOptionPane.showMessageDialog(null,c.getCadena()+" → "+c.getSecuenciaF());
                     
        }
    }
    
    public void agregar(String cadena, String secuenciaF) throws IOException{
        
        Cadena obj= new Cadena(cadena, secuenciaF);
        cad.add(obj);        
        Guardar();
        System.out.println("Yeiiii");
        
    }
    
}
