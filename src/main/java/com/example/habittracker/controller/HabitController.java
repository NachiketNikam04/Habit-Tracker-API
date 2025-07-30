package com.example.habittracker.controller;

import com.example.habittracker.model.Habit;
import com.example.habittracker.service.HabitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/habits")
public class HabitController {

    @Autowired
    private HabitService habitService;

    @GetMapping
    public List<Habit> getAll() {
        return habitService.getAllHabits();
    }

    @PostMapping
    public Habit create(@RequestBody Habit habit) {
        return habitService.addHabit(habit);
    }

    @PutMapping("/{id}/complete")
    public Habit complete(@PathVariable Long id) {
        return habitService.markCompleted(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        habitService.deleteHabit(id);
    }
}

