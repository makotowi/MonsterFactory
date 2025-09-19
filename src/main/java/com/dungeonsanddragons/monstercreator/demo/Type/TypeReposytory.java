package com.dungeonsanddragons.monstercreator.demo.Type;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeReposytory extends JpaRepository<Type, Long> {
}
