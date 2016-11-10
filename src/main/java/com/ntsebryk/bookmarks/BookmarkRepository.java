package com.ntsebryk.bookmarks;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

/**
 * Created by ntsebryk on 09.11.2016.
 */
public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
    Collection<Bookmark> findByAccountUsername(String username);
}
