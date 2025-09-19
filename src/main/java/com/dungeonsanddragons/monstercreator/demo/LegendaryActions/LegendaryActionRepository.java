package com.dungeonsanddragons.monstercreator.demo.LegendaryActions;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LegendaryActionRepository extends JpaRepository<LegendaryActions, Long> {
}
