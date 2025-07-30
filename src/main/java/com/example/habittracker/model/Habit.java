package com.example.habittracker.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Habit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String frequency; // DAILY, WEEKLY, etc.
    private LocalDate startDate = LocalDate.now();
    private int streak = 0;

    public Habit() {}

    public Habit(String title, String frequency) {
        this.title = title;
        this.frequency = frequency;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getFrequency() { return frequency; }
    public void setFrequency(String frequency) { this.frequency = frequency; }

    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }

    public int getStreak() { return streak; }
    public void setStreak(int streak) { this.streak = streak; }
}

