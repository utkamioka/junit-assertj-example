package com.example.kamioka;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class MainTest {
    static class Person {
        public Person(String name, int age, String addr) {
            this.name = name;
            this.age = age;
            this.addr = addr;
        }
        String name;
        int age;
        String addr;
    }

    @Test
    public void foo() {
        assertThat(123).isBetween(10, 200);
        assertThat("abc")
                .startsWith("a")
                .endsWith("c")
                .hasSize(3);

        List<Person> persons = Arrays.asList(
                new Person("John", 33, "Boston"),
                new Person("Bob", 28, "Seattle"),
                new Person("Alice", 25, "NY"));

        assertThat(persons)
                .extracting("name", "age")
                .contains(
                        tuple("John", 33),
                        tuple("Alice", 25)
                );
    }
}
