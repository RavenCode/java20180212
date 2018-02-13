package com.xyzcorp;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BoxTest {
    @Test
    public void testBoxInteger() {
        Box<Integer> box = new Box<>(30);
        Integer i = box.getItem();

        assertThat(i).isEqualTo(30);
    }

    @Test
    public void testBoxString() {
        Box<String> box = new Box<>("Foo");
        String i = box.getItem();

        assertThat(i).isEqualTo("Foo");
    }

    @Test
    public void testStreamWithMapForAnExample() {
        List<Integer> source = Arrays.asList(1,2,3,4,5);
        // map is given something do something
        List<Integer> collection = source
                                    .stream()
                                    .map(x -> x + 1)
                                    .collect(Collectors.toList());

        assertThat(collection).isNotEqualTo(source);
    }

    @Test
    public void testBoxWithMap() {
        Box<Integer> integerBox = new Box<>(3);
        Box<String> stringBox = integerBox.map(integer -> "FooBarBaz" + integer);

        assertThat(stringBox.getItem()).isEqualTo("FooBarBaz3");
    }

    @Test
    public void testBoxWithMapV2() {
        Box<Integer> integerBox = new Box<>(3);
        Box<Integer> calcBox = integerBox.map(integer -> integer * 3);

        assertThat(calcBox.getItem()).isEqualTo(9);
    }

    @Test
    public void testFlatMapWithStreams() {
        Stream<Stream<Integer>> g1 = Stream.of(1,2,3,4).map(x-> Stream.of(-x, x, x+1));

        Stream<Integer> g2 = Stream.of(1,2,3,4).flatMap(x-> Stream.of(-x, x, x+1));

    }

    @Test
    public void testFlatMap() {
        Box<Integer> integerBox = new Box<>(3);
        Box<Integer> result = integerBox.flatMap(i -> new Box<>(i + 3));

        assertThat(result).isEqualTo(new Box<>(6));
    }

    @Test
    public void testPinkFloydLyrics() {
        List<String> lyrics = Arrays.asList(
                "So, so you think you can tell",
                "Heaven from hell",
                "Blue skies from pain",
                "Can you tell a green field",
                "from a cold steel rail?"
        );

        Stream<String> wordStream =
                lyrics.stream().flatMap(s -> Stream.of(s.split(" ")));
//        wordStream.forEach(System.out::println);

//        Map<Integer, List<String>> result =
//                wordStream.collect(Collectors.groupingBy(String::length));
        Map<String, Long> result2 =
                wordStream.collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        System.out.println(result2);
    }
}
