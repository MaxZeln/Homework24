package ru.learnup.homework24.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.learnup.homework24.entity.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Integer> {
}
