package org.example.javahibernatejpa.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.With;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String id;

    String firstName;
    String lastName;

}
