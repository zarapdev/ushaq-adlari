package General;

import java.util.Arrays;
import java.util.List;

public class Kvadrat {
    public static void main(String[] args) {
       //   Stream-dən istifadə edib tək ədədlərin kvadratlarını tapan program yazın

        List<Integer> reqemler= Arrays.asList(2, 8,9,45,25,71);// ededleri siyahiya yaziriq

        //Stream istifadə edərək tək ədədlərin kvadratlarını tapırıq
        reqemler.stream().filter(n-> n % 2 !=0).
    //tek ededleri secirik
               //Hər bir tək ədədin kvadratını alırıq
        map(n->n *n)
        // Nəticəni çap edirik
        .forEach(System.out::println);


    }

}
