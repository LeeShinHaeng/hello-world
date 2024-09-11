package com.example.h2rest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="ITEM")
@Getter @Setter
public class ItemEntity {
    @Id
    private String id;
    private String name;
}
