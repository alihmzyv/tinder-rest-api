package com.alihmzyv.tinderrestapi.repo;

import com.alihmzyv.tinderrestapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


//just to make it clear. actually no need to explicitly set path to "messages", since it is that by default.
@RepositoryRestResource(path = "users")
public interface UserRepository extends JpaRepository<User, Long> {
}
