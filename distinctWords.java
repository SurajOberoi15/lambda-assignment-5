// lambda expression that accepts a list of strings and returns new list of distinct strings (without repeating).
// Function<List,List> f1 = list -> {
//     return (List) list.stream().distinct().collect(Collectors.toList());
// };


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class distinctWords {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many string do want to enter: ");
        int n = sc.nextInt();
        List<String> list1 = new ArrayList<>();
        System.out.println("Enter strings in list");
        for(int i = 0;i<=n;++i){
            String j = sc.nextLine();
            list1.add(j);
        }
        //List<String> uniqueWordList = list1.stream().distinct().collect(Collectors.toList());
        Function<List<String>,List<String>> f1 = list -> {
            return (List<String>) list.stream().distinct().collect(Collectors.toList());
        };

         List<String> uniqueWordList =  f1.apply(list1);
        System.out.println("Unique words are: "+uniqueWordList);
        sc.close();

    }
    
}
