
package hdt8;
import java.util.Comparator;
/**
 *
 * @author Carlos Raxtum
 * carne: 19721
 */
public class HeapComparator implements Comparator<Nodo>{
    @Override
    public int compare(Nodo val1, Nodo val2) {
        String s1=val1.getCode().toString();
        String s2=val2.getCode().toString();
        
        int res=0;
        int res1=0;
        
        if ("A".equals(s1)){
            res=5;
        }
        else if("B".equals(s1)){
            res=4;
        }
        else if ("C".equals(s1)){
            res=3;
        }
        else if ("D".equals(s1)){
            res=2;
        }
        else if ("E".equals(s1)){
            res=1;
        }
        else if ("A".equals(s2)){
            res1=5;
        }
        else if ("B".equals(s2)){
        	res1=4;
        }
        else if ("C".equals(s2)){
        	res1=3;
        }
        else if ("D".equals(s2)){
        	res1=2;
        }
        else if ("E".equals(s2)){
        	res1=1;
        }
        else if (res1<res){
            return 1;
        }
        else if (res<res1){
            return -1;
        }
        return 0;
    }
}
