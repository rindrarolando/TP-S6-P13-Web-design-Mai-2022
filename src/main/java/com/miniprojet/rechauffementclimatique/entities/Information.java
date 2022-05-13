package com.miniprojet.rechauffementclimatique.entities;

import javax.persistence.*;

@Entity
@Table(name = "informations")
public class Information {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "url", length = 100)
    private String url;

    @Column(name = "rewriting", length = 100)
    private String rewriting;

    public String getRewriting() {
        return rewriting;
    }

    public void setRewriting(String rewriting) {
        this.rewriting = rewriting;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}