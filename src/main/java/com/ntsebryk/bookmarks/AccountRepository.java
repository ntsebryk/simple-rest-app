package com.ntsebryk.bookmarks;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by ntsebryk on 09.11.2016.
 */
public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findByUsername(String username);
}
