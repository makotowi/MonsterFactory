package com.dungeonsanddragons.monstercreator.demo.Actions;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionRepository extends JpaRepository<Actions, Long> {
}
