package com.example.demo.model;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;


public class User {
    private Long id;
    private String username;
    private String email;
    private Integer age;

    // 手动添加getter/setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
