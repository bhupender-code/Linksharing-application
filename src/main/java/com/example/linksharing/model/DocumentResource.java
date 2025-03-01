package com.example.linksharing.model;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue(value = "DOCUMENT")
public class DocumentResource extends Resource {
    private String filePath;
}
