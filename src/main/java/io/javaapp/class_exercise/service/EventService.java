package io.javaapp.class_exercise.service;

import io.javaapp.class_exercise.entity.Event;
import io.javaapp.class_exercise.repository.EventRepository;

import java.util.ArrayList;
import java.util.List;

public class EventService {
    EventRepository eventRepository = new EventRepository();

    public List<Event> getAvailableEvent(){
        List<Event> allEvents = eventRepository.getEvents();
        List<Event> availableEvents = new ArrayList<>();
        for(Event event: allEvents){
            if(event.isTicketAvailable()){
                availableEvents.add(event);
            }
        }
        return availableEvents;

    }
}
