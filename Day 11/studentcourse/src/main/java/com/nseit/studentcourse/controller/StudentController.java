package com.nseit.studentcourse.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Student")
public class StudentController {
    @PostMapping
    public void add() {

    }

    @GetMapping("/all")
    public void view() {

    }

    @PutMapping
    public void update() {

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {

    }
}
