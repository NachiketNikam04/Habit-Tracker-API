package com.example.habittracker.service;

import com.example.habittracker.model.Habit;
import com.example.habittracker.repository.HabitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabitService {

    @Autowired
    private HabitRepository habitRepo;

    public List<Habit> getAllHabits() {
        return habitRepo.findAll();
    }

    public Habit addHabit(Habit habit) {
        return habitRepo.save(habit);
    }

    public Habit markCompleted(Long id) {
        Habit habit = habitRepo.findById(id).orElseThrow();
        habit.setStreak(habit.getStreak() + 1);
        return habitRepo.save(habit);
    }

    public void deleteHabit(Long id) {
        habitRepo.deleteById(id);
    }
}

