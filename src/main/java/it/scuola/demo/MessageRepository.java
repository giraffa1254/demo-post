package it.scuola.demopost;

 import
org.springframework.data.jpa.repository.JpaRe
pository;

public interface MessageRepository
 extends JpaRepository<Message, Long> {
 }
