package com.APIweb.course.entities;

import ch.qos.logback.core.net.server.Client;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Getter
@Setter
@Table(name = "tb_order")
@Entity
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant orderDate;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

    public Order() {
    }

    public Order(Long id, Instant orderDate, User client) {
        this.id = id;
        this.orderDate = orderDate;
        this.client = client;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Order order)) return false;

        return Objects.equals(getId(), order.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
