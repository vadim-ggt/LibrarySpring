package com.LibService.SpringLibService.dao.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String title;
    private String author;
    private int year;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Request> requests;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "library_id", referencedColumnName = "id")
    private Library library;


}
