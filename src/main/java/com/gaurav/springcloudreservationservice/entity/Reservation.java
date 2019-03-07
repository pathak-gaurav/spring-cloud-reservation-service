package com.gaurav.springcloudreservationservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue
    private Long reservationId;
    private String reservationName;

    public Reservation(String reservationName) {
        this.reservationName = reservationName;
    }
}
