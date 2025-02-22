package com.alexisgeoffrey.pictovate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "images")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Enumerated(EnumType.STRING)
    private Filetype filetype;

    protected Image() {
    }

    public Image(Filetype filetype) {
        this.filetype = filetype;
    }

    @Override
    public String toString() {
        return String.format(
                "Image[id=%d, filetype='%s']",
                id, filetype);
    }

    public Filetype getFiletype() {
        return filetype;
    }

    public void setFiletype(Filetype filetype) {
        this.filetype = filetype;
    }
}
