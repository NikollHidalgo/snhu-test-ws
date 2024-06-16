package com.sena.prueba.Entity;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "schedules")
public class Schedules extends ABaseEntity  {
    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "time", length = 20, nullable = false)
    private String time;

    @Column(name = "economy_price", scale = 2, precision = 10, nullable = false)
    private BigDecimal economyPrice;

    @Column(name = "confrimed", length = 20, nullable = false)
    private String confrimed;

    @Column(name = "flight_number", length = 20, nullable = false)
    private String flightNumber;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "aircraft_id", nullable = false)
    private Aircrafts aircrafts;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "route_id", nullable = false)
    private Routes routes;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public BigDecimal getEconomyPrice() {
        return economyPrice;
    }

    public void setEconomyPrice(BigDecimal economyPrice) {
        this.economyPrice = economyPrice;
    }

    public String getConfrimed() {
        return confrimed;
    }

    public void setConfrimed(String confrimed) {
        this.confrimed = confrimed;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Aircrafts getAircrafts() {
        return aircrafts;
    }

    public void setAircrafts(Aircrafts aircrafts) {
        this.aircrafts = aircrafts;
    }

    public Routes getRoutes() {
        return routes;
    }

    public void setRoutes(Routes routes) {
        this.routes = routes;
    }





    
}