package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by iatru on 06.07.2016.
 */
@Entity
public class Book {

    private String id;

    @Id
    public String getId() {
        return id;
    }
    public int age;
    public String name;

    public Book() {
    }

    public Book(String id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age='" + age + '\'' +
                ", Name='" + name + '\'' +

//                ", tasksOwned=" + tasksOwned +
//                ", tasksExecuting=" + tasksExecuting +
                '}';
    }
}
