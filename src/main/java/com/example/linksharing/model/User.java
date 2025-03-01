package com.example.linksharing.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String firstName;

    private String lastName;

    private String photo;

    @Column(nullable = false)
    private Boolean isActive = true;

    @Column(nullable = false)
    private Boolean isAdmin = false;

    @CreatedDate
    @Column(updatable = false)
    private Date dateCreated;

    @LastModifiedDate
    private Date lastUpdated;

    @OneToMany(mappedBy = "createdBy")
    private List<Topic> topics;

    @OneToMany(mappedBy = "user")
    private List<Subscription> subscriptions;

    @OneToMany(mappedBy = "createdBy")
    private List<Resource> resources;

    @OneToMany(mappedBy = "user")
    private List<ReadingItem> readingItems;


}
