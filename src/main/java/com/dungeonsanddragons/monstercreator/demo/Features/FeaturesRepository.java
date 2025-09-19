package com.dungeonsanddragons.monstercreator.demo.Features;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeaturesRepository extends JpaRepository<Features, Long> {
}
