import java.util.HashMap;
import java.io.*;

public class dsproject {
    public static void main(String[] args) {
        //HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
        HashMap <graph,Integer> test=new HashMap<graph, Integer>();
        graph a=new graph();
        HashMap <String,String> map=new HashMap<String, String>();

        System.out.println(map.put("154","Yes"));
        System.out.println(map.putIfAbsent("154","No"));
        System.out.println(map.clone());

        System.out.println(map.put("154","No"));
        System.out.println(map.clone());

        System.out.println(map.size());
        if(Boolean.parseBoolean(map.putIfAbsent("154","No")))
            System.out.println("Same");
        else
            System.out.println("Different");
    }
}
