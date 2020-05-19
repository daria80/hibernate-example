package com.github.daria80.models;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "cars")
@Data
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String brand;

    private Color color;
}
