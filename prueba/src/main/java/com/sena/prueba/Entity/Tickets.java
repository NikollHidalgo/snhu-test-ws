package com.sena.prueba.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tickets")
public class Tickets extends ABaseEntity {
    @Column(name = "firt_name", length = 35, nullable = false)
    private String firtName;

    @Column(name = "last_name", length = 35, nullable = false)
    private String lastName;

    @Column(name = "email", length = 50, nullable = false)
    private String email;

    @Column(name = "phone", nullable = false)
    private Integer phone;

    @Column(name = "passport_number",  nullable = false)
    private Integer passportNumber;

    @Column(name = "passport_photo", length = 20, nullable = false)
    private String passportPhoto;

    @Column(name = "booking_reference", length = 50, nullable = false)
    private String bookingReference;

    @Column(name = "confirmed", length = 50, nullable = false)
    private String confirmed;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "schedule_id")
    private Schedules schedules;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cabin_type_id")
    private CabinTypes cabinTypes;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "passport_country_id")
    private Countries countries;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private Users users;

    public String getFirtName() {
        return firtName;
    }

    public void setFirtName(String firtName) {
        this.firtName = firtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Integer getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(Integer passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getPassportPhoto() {
        return passportPhoto;
    }

    public void setPassportPhoto(String passportPhoto) {
        this.passportPhoto = passportPhoto;
    }

    public String getBookingReference() {
        return bookingReference;
    }

    public void setBookingReference(String bookingReference) {
        this.bookingReference = bookingReference;
    }

    public String getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed;
    }

    public Schedules getSchedules() {
        return schedules;
    }

    public void setSchedules(Schedules schedules) {
        this.schedules = schedules;
    }

    public CabinTypes getCabinTypes() {
        return cabinTypes;
    }

    public void setCabinTypes(CabinTypes cabinTypes) {
        this.cabinTypes = cabinTypes;
    }

    public Countries getCountries() {
        return countries;
    }

    public void setCountries(Countries countries) {
        this.countries = countries;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }





    
}