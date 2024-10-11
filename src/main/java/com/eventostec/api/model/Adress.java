package com.eventostec.api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "adress")
@Data
public class Adress {

    @Id
    @GeneratedValue
    private UUID id;

    private String cidade;
    private String uf;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}
