package ru.rado.hibspringapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.rado.hibspringapp.models.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
}
