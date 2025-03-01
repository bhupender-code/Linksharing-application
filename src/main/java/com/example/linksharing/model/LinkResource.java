package com.example.linksharing.model;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@DiscriminatorValue(value = "LINK")
public class LinkResource extends Resource{
    private String url;
}
