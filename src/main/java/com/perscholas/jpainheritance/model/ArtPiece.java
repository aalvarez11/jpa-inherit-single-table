package com.perscholas.jpainheritance.model;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "ART_PIECE_TYPE", discriminatorType = DiscriminatorType.STRING)
public abstract class ArtPiece {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String author;

    protected ArtPiece(String author) {
        this.author = author;
    }
}
