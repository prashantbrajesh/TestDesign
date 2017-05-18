package brajesh.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created by brajesh on 19/4/17.
 */
public class MainClass {


    public static void main(String [] args){

//        List <String> sList = Arrays.asList("baba","kaba","test");
//        List<String> resultList;
//        int arry[] = {1,2,3,3,4,5};
//        resultList = sList.stream().filter(x -> !"test".equals(x)).collect(Collectors.toList());
//        String result = resultList.parallelStream().reduce("",(a,b)-> a+b);
//        System.out.print(result);
//        Arrays.stream(arry).reduce((c,d)-> c+d).ifPresent(s -> System.out.println(s));
//        resultList.forEach(System.out::println);
//
//        ArrayList<Object> alist = new ArrayList<Object>();
//        alist.add("test");
//        alist.add(2);
//        alist.add(2.333);
//        ArrayList<Object> test = new ArrayList<>();
//
//       alist.parallelStream().filter(e -> !e.equals(2)).map(e -> test.add(e)).collect(Collectors.toList());
//
//        test.forEach(System.out::println);
        List <String> students = Arrays.asList("babaasaad","kaba","test","asuhasgdh","ajdfhkjsjkd");

        List<String> ids = students.stream()
                .filter(s -> {System.out.println("filter - "+s); return s.length() > 5;})
                .map(s -> {System.out.println("map - "+s); return s;})
                .skip(1)
                .collect(Collectors.toList());



        ids.forEach(System.out::println);
//        System.out.print(data);

    }
}
