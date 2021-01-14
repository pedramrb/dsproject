import java.util.HashMap;

public class dsproject {
    public static void main(String[] args) {
        //HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
        HashMap <String,String> map=new HashMap<String, String>();
        System.out.println(map.put("154","Yes"));
        System.out.println(map.putIfAbsent(" 154","No"));
        System.out.println(map.clone());

        System.out.println(map.put(" 154","No"));
        System.out.println(map.clone());

        System.out.println(map.size());
    }
}
