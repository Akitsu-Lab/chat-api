package com.akitsu_lab.chat_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Autowired
    private JdbcClient jdbcClient;

    @GetMapping("/greeting")
    public String greeting() {

        // JdbcTemplateじゃなくてJdbcClientを使う方がスマートかも https://qiita.com/suke_masa/items/57399a6c94df7b38a8be
        jdbcClient.sql("SELECT * FROM users").query().listOfRows().forEach(System.out::println);
        return "Hello";
    }
}
