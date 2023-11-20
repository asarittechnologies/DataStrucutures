package existingclasses;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamAPIExamples {
    public static void main(String[] args) {
        JavaStreamAPIExamples java = new JavaStreamAPIExamples();
        java.flatMap();
    }
    public void flatMap(){
        List<List<String>>  list = List.of(List.of("1","2","3","1","2"));
        list.stream().flatMap(List::stream).forEach(System.out::print);
        System.out.println();
        List.of("1","2","3","1","2").stream().distinct().forEach(System.out::print);
        System.out.println();

        List<List<String>> melonLists = Arrays.asList(
                Arrays.asList("Gac", "Cantaloupe"),
                Arrays.asList("Hemi", "Gac", "Apollo"),
                Arrays.asList("Gac", "Hemi", "Cantaloupe"));

        List<String> collect = melonLists.stream().flatMap(List::stream).distinct().collect(Collectors.toList());
        collect.stream().forEach(System.out::println);

    }

}



