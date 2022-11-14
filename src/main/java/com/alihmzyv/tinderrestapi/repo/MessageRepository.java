package com.alihmzyv.tinderrestapi.repo;

import com.alihmzyv.tinderrestapi.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

//just to make it clear. actually no need to explicitly set path to "messages", since it is that by default.
@RepositoryRestResource(path = "messages")
public interface MessageRepository extends JpaRepository<Message, Long> {
    @Query("from Message where (fromId = ?1 and toId = ?2) or (fromId = ?2 and toId = ?1)")
    List<Message> findAllBetween(Long user1Id, Long user2Id);
}
