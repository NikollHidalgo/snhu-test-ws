package com.sena.prueba.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "routes")
public class Routes extends ABaseEntity {
    @Column(name = "distance", length = 35, nullable = false)
    private String distance;

    @Column(name = "flight_time", length = 35, nullable = false)
    private String flighTime;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "departure_airport_id", nullable = false)
    private Airports departureAirport;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "arrival_airport_id", nullable = false)
    private Airports arrivalAirport;

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getFlighTime() {
        return flighTime;
    }

    public void setFlighTime(String flighTime) {
        this.flighTime = flighTime;
    }

    public Airports getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(Airports departureAirport) {
        this.departureAirport = departureAirport;
    }

    public Airports getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(Airports arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }
    
}