package co.simplon.whatstream.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.whatstream.entities.Content;

@Repository
public interface ContentRepository extends JpaRepository<Content, Long> {

    <T> List<T> findAllProjectedByOrderByName(Class<T> type);
}