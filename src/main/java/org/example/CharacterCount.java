package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharacterCount {
    private List<Character> characters = new ArrayList<>();

    public CharacterCount(List<Character> characters) {
        this.characters = characters;
    }

    public Map countEachCharacter(){

        Map<Character, Integer> chars = new HashMap<>();


        for (Character character: characters){
            int count = chars.getOrDefault(character, 0);
            chars.put(character, count + 1);
        }
        return chars;
    }
}