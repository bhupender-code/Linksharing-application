package com.example.linksharing.model;

import com.example.linksharing.enums.Seriousness;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.xml.crypto.Data;
import java.util.Date;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    Topic topic;

    @ManyToOne
    User user;

    @Enumerated(EnumType.STRING)
    private Seriousness seriousness;

    @CreatedDate
    private Date dateCreated;

}
