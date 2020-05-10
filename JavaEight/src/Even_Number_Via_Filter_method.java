import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Even_Number_Via_Filter_method {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(12);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(10);

        List<Integer> list = arrayList.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(list);

    }
}

//output
//[0, 12, 10]