
import java.util.HashMap;
 
public class FinalCountWords {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = "This this is is done by Saket Saket";
        String[] split = str.split(" ");
         
                HashMap<String,Integer> map = new HashMap<String,Integer>();
        for (int i=0; i<split.length; i++) {

                map.put(split[i], map.getOrDefault(split[i],0)+1);
       
        }
        System.out.println(map);
    }
 
}

