package com.dnd5e.magicapi.service;

import com.dnd5e.magicapi.model.Spell;
import com.dnd5e.magicapi.repository.SpellRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpellService {

    private final SpellRepository spellRepository;

    public SpellService(SpellRepository spellRepository) {
        this.spellRepository = spellRepository;
    }

    public List<Spell> getAllSpells() {
        return spellRepository.findAll();
    }

    public List<Spell> getSpellsByLevel(int level) {
        return spellRepository.findByLevel(level);
    }

    public Spell addSpell(Spell spell) {
        return spellRepository.save(spell);
    }
}