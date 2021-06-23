package com.rooney.library.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "book")
@Data
public class Book {

    @Id
    @GeneratedValue
    private UUID id;

    private String title;
}
