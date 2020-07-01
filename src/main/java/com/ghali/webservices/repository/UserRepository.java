package com.ghali.webservices.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ghali.webservices.enity.UserData;

public interface UserRepository extends JpaRepository<UserData, Long> {
}
