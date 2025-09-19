package com.dungeonsanddragons.monstercreator.demo.DamageResistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DamageResistanceRepository extends JpaRepository<DamageResistance, Long> {
}
