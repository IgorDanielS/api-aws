package com.eventostec.api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
@Entity
@Table(name = "coupon")
public class Coupon {

    @Id
    @GeneratedValue
    private UUID id;

    private String code;
    private Integer discount;
    private Date valid;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}
