package com.miniprojet.rechauffementclimatique.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "description")
    private String description;

    @Column(name = "posted_on")
    private LocalDate postedOn;

    @Column(name = "can_be_posted")
    private Boolean canBePosted;

    public Boolean getCanBePosted() {
        return canBePosted;
    }

    public void setCanBePosted(Boolean canBePosted) {
        this.canBePosted = canBePosted;
    }

    public LocalDate getPostedOn() {
        return postedOn;
    }

    public void setPostedOn(LocalDate postedOn) {
        this.postedOn = postedOn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}