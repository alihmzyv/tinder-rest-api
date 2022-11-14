package com.alihmzyv.tinderrestapi.repo;

import com.alihmzyv.tinderrestapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import java.util.Optional;


//just to make it clear. actually no need to explicitly set path to "users", since it is that by default.
@RepositoryRestResource(path = "users")
@RestResource
public interface UserRepository extends JpaRepository<User, Long> {
    @RestResource(path = "findByEmailAndPassword")
    Optional<User> findByEmailAddressAndPassword(String emailAddress, String password);

    Optional<User> findByUsernameAndPassword(String username, String password);
}
