
package hdt8;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Comparator;

/**
 *
 * @author Carlos Raxtum
 * carne: 19721
 */
public class VectorHeap<E extends Comparable<E>> extends PriorityQueue<E>{
   
    private PriorityQueue queue;

    public VectorHeap() {
        Comparator<Nodo> comp = new HeapComparator();
        queue=new PriorityQueue<Nodo>(comp);
    }

    public PriorityQueue getQueue() {
        return queue;
    }

    public void setQueue(PriorityQueue queue) {
        this.queue = queue;
    }
    public void addQueue(Nodo paci){
        queue.add(paci);
    }
    public int reader(File file) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(file));
       int counter=0;
       String nult=null;
       while((nult = br.readLine()) != null){
           String[] pac = nult.split(", ");
           if (pac.length==3 && (pac[2].equalsIgnoreCase("A") || pac[2].equalsIgnoreCase("B") || pac[2].equalsIgnoreCase("C") || pac[2].equalsIgnoreCase("D") || pac[2].equalsIgnoreCase("E"))){
               Nodo na= new Nodo(pac[0],pac[2],pac[1]);
               queue.add(na);
           }
           else{
               return 0;
           }
           
           counter++;
       }
       return counter;
    }
    
}

