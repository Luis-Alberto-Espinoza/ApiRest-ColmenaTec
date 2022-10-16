package com.example.colmena.entities;

import lombok.*;
import org.hibernate.envers.*;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="persona")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Persona implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;
    @Column(name="dni")
    private int dni;
}
