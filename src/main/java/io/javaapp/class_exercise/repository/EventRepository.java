package io.javaapp.class_exercise.repository;

import io.javaapp.class_exercise.entity.Event;

import java.util.ArrayList;
import java.util.List;

public class EventRepository {
    private List<Event> events = new ArrayList<>();

    public List<Event> getEvents() {
        return events;
    }
}
