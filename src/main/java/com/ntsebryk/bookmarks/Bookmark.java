package com.ntsebryk.bookmarks;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by ntsebryk on 09.11.2016.
 */
@Entity
public class Bookmark {

    @JsonIgnore
    @ManyToOne
    private Account account;

    @Id
    @GeneratedValue
    private Long id;

    Bookmark() {}

    public  Bookmark(Account account, String uri, String description){
        this.uri = uri;
        this.account = account;
        this.description = description;
    }

    public String uri;
    public String description;

    public Account getAccount() {
        return account;
    }

    public String getDescription() {
        return description;
    }

    public String getUri() {
        return uri;
    }

    public Long getId() {
        return id;
    }
}
