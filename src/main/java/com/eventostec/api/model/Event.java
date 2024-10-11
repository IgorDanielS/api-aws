package com.eventostec.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name ="event")
@Data
public class Event {

    @Id
    @GeneratedValue
    private UUID id;

    private String title;

    private String description;

    private String imageUrl;

    private String eventUrl;

    private Boolean remote;

    private Date date;
}
