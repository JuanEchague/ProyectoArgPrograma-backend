package com.gestion.portfolio.modelo;

import javax.persistence.*;

@Entity
@Table(name="items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre",length = 60,nullable = false)
    private String nombre;

    @Column(name = "comentario",length = 255,nullable = false)
    private String comentario;

    @Column(name = "email",length = 60,nullable = false)
    private String email;

    public Item() {
    }

    public Item(Long id, String nombre, String comentario, String email) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.comentario = comentario;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
