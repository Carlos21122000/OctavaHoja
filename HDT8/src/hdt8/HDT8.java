
package hdt8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Carlos Raxtum
 * carne 19721
 */
public class HDT8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VectorHeap line = new VectorHeap();
        int VAL=0;
        File dir = new File(".");
        try{
            File find = new File(dir.getCanonicalPath()+File.separator + "pacientes.txt");//se busca el archivo
            VAL=line.reader(find);
        } catch(Exception e){
            System.err.println("ERROR AL ENCONTRAR EL ARCHIVO 'pacientes.txt'");
        }
        while (VAL!=0){
            System.out.println(line.getQueue().remove());
            VAL=VAL-1;
        }       
    }
}
    
