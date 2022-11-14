package com.alihmzyv.tinderrestapi.repo;

import com.alihmzyv.tinderrestapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
