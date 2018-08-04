package com.hellozjf.test.streamhello;

import lombok.Data;

/**
 * @author hellozjf
 */
@Data
public class Person {
    private Long id;
    private String name;
    private Integer age;

    public Person() {
    }

    public Person(Long id, String name, Integer age) {

        this.id = id;
        this.name = name;
        this.age = age;
    }
}
