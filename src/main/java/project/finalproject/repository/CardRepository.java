package project.finalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.finalproject.entity.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, Integer>{

}
