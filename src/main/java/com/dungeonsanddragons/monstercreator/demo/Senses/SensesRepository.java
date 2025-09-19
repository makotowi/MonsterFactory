package com.dungeonsanddragons.monstercreator.demo.Senses;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensesRepository extends JpaRepository<Senses, Long> {
}
