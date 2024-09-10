package com.example.catwiki;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> stream1 = Arrays.stream(arr);

        List<String> list = Arrays.asList(arr);
        Stream<String> stream2 = list.stream();

        Stream<String> builderStream = Stream.<String>builder()
                .add("a").add("b").add("c").build();

        Stream<String> stream3 = Stream.generate(() -> "a").limit(3);

        Stream<Integer> stream4 = Stream.iterate(0, i -> i + 1);

//        stream1.forEach(System.out::print);
        stream1.map(String::toUpperCase).forEach(System.out::print);

        List<String> members = Arrays.asList("Kim", "Lee", "Park");
        boolean result = members.stream().anyMatch(mem -> mem.contains("r"));

        result = members.stream().allMatch(mem -> mem.length() == 3);
    }
}
