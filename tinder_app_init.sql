-- users table
create table users
(
    id            serial
        constraint users_pk
            primary key,
    first_name    varchar not null,
    last_name     varchar not null,
    occupation    varchar not null,
    email_address varchar not null,
    username      varchar not null,
    password      varchar not null,
    age           integer not null
);

alter table users
    owner to postgres;

create unique index users_email_address_uindex
    on users (email_address);

create unique index users_username_uindex
    on users (username);


-- message table
create table message
(
    id             serial
        constraint message_pk
            primary key,
    from_id        integer   not null,
    to_id          integer   not null,
    date_time_sent timestamp not null,
    body           varchar   not null
);

