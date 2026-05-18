package io.javaapp.class_exercise.entity;

import io.javaapp.class_exercise.dto.BookingDto;

public class Booking {
    private Integer id = 0;
    private Integer userId;
    private Integer eventId;
    private Integer numOfTickets;
    private BookingStatus bookingStatus = BookingStatus.CONFIRMED;

    public enum BookingStatus{
            CONFIRMED, CANCELLED
    }

    public Booking(Integer userId, Integer eventId, Integer numOfTickets) {
        this.id = generateId();
        this.userId = userId;
        this.eventId = eventId;
        this.numOfTickets = numOfTickets;
    }

    public Booking(BookingDto bookingDto) {
        this.id = generateId();
        this.userId = bookingDto.getUserId();
        this.eventId = bookingDto.getEventId();
        this.numOfTickets = bookingDto.getNumOfTickets();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public Integer getNumOfTickets() {
        return numOfTickets;
    }

    public void setNumOfTickets(Integer numOfTickets) {
        this.numOfTickets = numOfTickets;
    }

    private int generateId() {
        return ++this.id;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }
}


