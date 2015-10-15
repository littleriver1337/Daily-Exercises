import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by MattBrown on 10/15/15.
 */
public class Arraylist {
    public static void main(String[] args) {


        System.out.println("Welcome to the Twilight HashMap + ArrayList Zone!");
        HashMap<String, ArrayList<String>> groups = new HashMap();//HashMap + ArrayList
        String[] words = {"Alice", "Bob", "Charlie", "Austin", "Albert", "Connor"};//strings
        for (String name : words) {//example of a for loop
            String firstLetter = name.substring(0, 1);//starts at first letter and ends or = String.valueOf(name.charAt(0));
            ArrayList<String> list = groups.get(firstLetter);
            if (list == null) {//if it doesn't exist then run this
                list = new ArrayList();
                list.add(name);
                groups.put(firstLetter, list);//adds it to you list/hashmap
            } else {
                list.add(name);//adds name to list
            }
        }
        System.out.println(groups);//watch for typos
    }
}