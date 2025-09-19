package com.dungeonsanddragons.monstercreator.demo.ConditionImmunities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConditionImmunitiesRepository extends JpaRepository<ConditionImmunities, Long> {
}
