package com.example.linksharing.model;

import com.example.linksharing.enums.Visibility;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;


    @ManyToOne
    private User createdBy;

    @CreatedDate
    private Date dateCreated;

    @LastModifiedDate
    private Date dateModified;

    @Enumerated(EnumType.STRING)
    private Visibility visibility;

}
