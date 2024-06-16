package com.sena.prueba.IRepository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sena.prueba.Entity.Schedules;
import com.sena.prueba.Entity.Tickets;

@Repository
public interface ISchedulesRepository extends IBaseRepository <Schedules, Long> {

    @Query("SELECT t.id AS ticketId, u.firstName AS passengerFirstName, u.lastName AS passengerLastName, " +
           "t.bookingReference, t.email, t.phone, a1.name AS departureAirport, a2.name AS arrivalAirport, " +
           "s.date AS departureDate, s.flightNumber, s.economyPrice, c.name AS cabinType " +
           "FROM Ticket t " +
           "JOIN t.user u " +
           "JOIN t.schedule s " +
           "JOIN s.route r " +
           "JOIN r.departureAirport a1 " +
           "JOIN r.arrivalAirport a2 " +
           "JOIN t.cabinType c " +
           "WHERE a1.iataCode = :origen " +
           "AND a2.iataCode = :destino " +
           "AND c.name = :tipoCabina " +
           "AND s.date = :fechaSalida " +
           "AND (:soloIda = true OR (s.date = :fechaRegreso AND :soloIda = false))")
           
    List<Tickets> findTickets(
            @Param("origen") String origen,
            @Param("destino") String destino,
            @Param("tipoCabina") String tipoCabina,
            @Param("fechaSalida") String fechaSalida,
            @Param("fechaRegreso") String fechaRegreso,
            @Param("soloIda") boolean soloIda
    );

    
}