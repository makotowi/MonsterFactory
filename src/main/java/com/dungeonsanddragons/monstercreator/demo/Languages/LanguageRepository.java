package com.dungeonsanddragons.monstercreator.demo.Languages;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LanguageRepository extends JpaRepository<Languages, Long> {

}
