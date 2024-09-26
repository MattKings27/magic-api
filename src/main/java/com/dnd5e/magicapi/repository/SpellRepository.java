package com.dnd5e.magicapi.repository;

import com.dnd5e.magicapi.model.Spell;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpellRepository extends JpaRepository<Spell, Long> {
    List<Spell> findByLevel(int level);
}