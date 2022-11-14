package com.alihmzyv.tinderrestapi.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "from_id")
    private Long fromId;

    @Column(name = "to_id")
    private Long toId;

    @Column(name = "date_time_sent")
    private LocalDateTime dateTimeSent = LocalDateTime.now();

    @Column(name = "body")
    private String body;

    public Message(Long fromId, Long toId, String body) {
        this.fromId = fromId;
        this.toId = toId;
        this.body = body;
    }

    public Message() {
    }

    public Long getId() {
        return id;
    }

    public Long getFromId() {
        return fromId;
    }

    public void setFromId(Long fromId) {
        this.fromId = fromId;
    }

    public Long getToId() {
        return toId;
    }

    public void setToId(Long toId) {
        this.toId = toId;
    }

    public LocalDateTime getDateTimeSent() {
        return dateTimeSent;
    }

    public void setDateTimeSent(LocalDateTime dateTimeSent) {
        this.dateTimeSent = dateTimeSent;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", fromId=" + fromId +
                ", toId=" + toId +
                ", dateTimeSent=" + dateTimeSent +
                ", body='" + body + '\'' +
                '}';
    }
}
