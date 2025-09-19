package com.dungeonsanddragons.monstercreator.demo.DamageImmunities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DamageImmunitiesRepository extends JpaRepository<DamageImmunities, Long> {
}
