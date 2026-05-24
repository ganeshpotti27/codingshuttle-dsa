import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class _00_Practice {
    public static void main(String[] args) {
//        List<Integer> nums = new ArrayList<>(List.of(1, 2,3,4));
//        List<Integer> evenNums = nums.stream().filter(n -> n%2==0).toList();
//        int res = evenNums.stream().reduce(0, (sum, num) -> sum+num);
//        System.out.println(res);


        List<Integer> nums = new ArrayList<>(List.of(1,2,3,4,4,5,6,6));
        nums.forEach(System.out::println);
//        int res= nums.stream().filter(n -> n%2==0)
//                .reduce(0, (sum, n) -> n+sum);
//        System.out.println(res);
//
//        Optional<Integer> secondEle = nums.stream().distinct().skip(1).findFirst();
//        System.out.println(secondEle.get());
//        for(Integer ele : dist)
//            System.out.println(ele);
     }

}
