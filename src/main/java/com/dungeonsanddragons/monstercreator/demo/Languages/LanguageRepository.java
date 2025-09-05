package com.dungeonsanddragons.monstercreator.demo.Languages;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends JpaRepository<Languages,String> {
}
