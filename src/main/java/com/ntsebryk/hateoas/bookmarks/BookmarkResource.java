package com.ntsebryk.hateoas.bookmarks;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;

/**
 * Created by ntsebryk on 15.11.2016.
 */
public class BookmarkResource extends ResourceSupport {

    private final Bookmark bookmark;

    public BookmarkResource(Bookmark bookmark) {
        String username = bookmark.getAccount().getUsername();
        this.bookmark = bookmark;
        this.add(new Link(bookmark.getUri(), "bookmark-uri"));
        this.add(ControllerLinkBuilder.linkTo(BookmarkRestController.class, username).withRel("bookmarks"));
        this.add(ControllerLinkBuilder.linkTo(ControllerLinkBuilder.methodOn(BookmarkRestController.class, username).readBookmark(username, bookmark.getId())).withSelfRel());
    }

    public Bookmark getBookmark() {
        return bookmark;
    }
}
