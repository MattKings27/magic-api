package com.dnd5e.magicapi.controller;

import com.dnd5e.magicapi.model.Spell;
import com.dnd5e.magicapi.service.SpellService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/spells")
public class SpellController {

    private final SpellService spellService;

    public SpellController(SpellService spellService) {
        this.spellService = spellService;
    }

    @GetMapping
    public ResponseEntity<List<Spell>> getAllSpells() {
        return ResponseEntity.ok(spellService.getAllSpells());
    }

    @GetMapping("/level/{level}")
    public ResponseEntity<List<Spell>> getSpellsByLevel(@PathVariable int level) {
        return ResponseEntity.ok(spellService.getSpellsByLevel(level));
    }

    @PostMapping
    public ResponseEntity<Spell> addSpell(@RequestBody Spell spell) {
        return ResponseEntity.ok(spellService.addSpell(spell));
    }
}