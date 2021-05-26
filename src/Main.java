import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.addAll(new Facebook().facebook);
        //set.addAll(new Indeed().indeed);
        for(int element : new Indeed().indeed) {
            if(set.contains(element)) {
                System.out.println(element);
            }
        }
    }
}
