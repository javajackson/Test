package java8;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        PredicateTest predicateTest = new PredicateTest();
        predicateTest.conditionFilter(list,item -> item % 2 == 0);
        System.out.println("-------------------");
        predicateTest.conditionFilter(list,item -> item % 2 == 1);
        System.out.println("-------------------");
        predicateTest.conditionFilter(list,item -> item >5);
        System.out.println("-------------------");
        predicateTest.conditionFilter2(list,item -> item > 5, item -> item % 2 ==1);
        System.out.println("-------------------");
        List<Integer> list1 =  list.stream().filter(e -> e > 5).filter(e -> e % 2 ==1).collect(Collectors.toList());
        list1.forEach(System.out::println);
    }

    private void conditionFilter(List<Integer> list, Predicate<Integer> predicate){
        for (Integer integer : list){
            if(predicate.test(integer)){
                System.out.println(integer);
            }
        }
    }

    private void conditionFilter2(List<Integer> list,Predicate<Integer> predicate,Predicate<Integer> predicate2){
        for(Integer integer : list){
            if(predicate.and(predicate2).test(integer)){
                System.out.println(integer);
            }
        }
    }
}
