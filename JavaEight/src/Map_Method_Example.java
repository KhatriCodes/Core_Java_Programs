import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Map_Method_Example {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(12);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(10);

        List<Integer> list = arrayList.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println(list);
    }
}

//output
// [0, 24, 10, 14, 20]