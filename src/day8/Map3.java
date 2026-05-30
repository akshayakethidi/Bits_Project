package day8;
import java.util.HashMap;
public class Map3 {


public class Map2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("maya",69);
        map.put("mohit",89);
        map.put("yabav",100);
        for(String c:map.keySet())
        {
            if(map.get(c)>99)
            {
            System.out.println(c);
        }
    }

}
}
}
