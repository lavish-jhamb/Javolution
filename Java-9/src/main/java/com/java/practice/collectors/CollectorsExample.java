package com.java.practice.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsExample {

    public static void main(String[] args) {

        List<String> programmingLanguages = Arrays.asList("Java", "Kotlin", "Scala", "Python",
                "JavaScript", "Ruby");


        /*
         * Example     : Collectors.filtering()
         * Description : Filters elements after grouping but before collecting.
         * Return type : Map<Integer, List<String>>
         */
        Map<Integer, List<String>> programmingList = programmingLanguages.stream()
                .collect(Collectors.groupingBy(
                        String::length,                             // Group by the length of string
                        Collectors.filtering(
                                s -> s.startsWith("J"),      // Only keep elements that start with "J"
                                Collectors.toList()                 // Collect the filtered results into a List
                        )
                ));

        System.out.println("Grouped and filtered by length: " + programmingList);


        /*
         * Example     : Collectors.flatMapping()
         * Description : Useful for flattening nested collections during collection. Often used with groupingBy.
         */
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("Java", "Kotlin", "Scala"),
                Arrays.asList("Python", "JavaScript"),
                Arrays.asList("Go", "Rust", "C++")
        );

        Map<Integer, Set<String>> flattenedAndGrouped = nestedList.stream()
                .collect(Collectors.groupingBy(
                        List::size,                      // Group by the size of the inner lists
                        Collectors.flatMapping(
                                List::stream,       // Flatten the nested lists
                                Collectors.toSet()  // Collect the flattened results into a Set
                        )
                ));

        System.out.println("Flattened and grouped by inner list size: " + flattenedAndGrouped);
    }

}
