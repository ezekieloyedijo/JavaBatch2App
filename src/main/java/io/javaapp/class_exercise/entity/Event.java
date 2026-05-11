package io.javaapp.class_exercise.entity;

public class Event {
    private Integer id = 0;
    private String name;
    private String location;
    private String date;
    private Integer totalNumOfTickets;
    private boolean isTicketAvailable = true;

    public Event(String name, String location, String date, Integer numOfTickets) {
        this.id = generateId();
        this.name = name;
        this.location = location;
        this.date = date;
        this.totalNumOfTickets = numOfTickets;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getNumOfTickets() {
        return totalNumOfTickets;
    }

    public void setNumOfTickets(Integer numOfTickets) {
        this.totalNumOfTickets = numOfTickets;
    }

    public boolean isTicketAvailable() {
        return isTicketAvailable;
    }

    public void setTicketAvailable(boolean ticketAvailable) {
        isTicketAvailable = ticketAvailable;
    }

    private int generateId() {
        return ++this.id;
    }
}
