package com.maimoona.futureXUserApp;

import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;
import java.util.List;

public interface userrepository extends JpaRepository<user, BigInteger>{
    List<user> finduserid(BigInteger id);
    List<user> findcourse(BigInteger id);
}
