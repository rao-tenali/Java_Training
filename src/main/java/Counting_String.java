import java.net.SocketOption;
import java.util.HashMap;

public class Counting_String {
    public static void main(String args[])
    {
        String str = "This this is is the new project new";
        String[] str2= str.split(" ");
        HashMap<String,Integer> map = new HashMap<String, Integer>();

        for(int i =0; i<str2.length; i++)
        {
            if(map.containsKey(str2[i]))
            {
                int count = map.get(str2[i]);
                map.put(str2[i],count+1);
            }
            else
            {
                map.put(str2[i],1);
            }
        }
        System.out.println(map);
    }
}
