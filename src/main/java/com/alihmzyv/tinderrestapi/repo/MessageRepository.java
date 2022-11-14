package com.alihmzyv.tinderrestapi.repo;

import com.alihmzyv.tinderrestapi.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
