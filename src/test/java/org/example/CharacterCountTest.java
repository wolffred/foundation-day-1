package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CharacterCountTest {

    CharacterCount characterCount;


    @BeforeEach
    public void setUp(){
        characterCount = new CharacterCount(new ArrayList<>(List.of('q','q','r','s','x','x')));
        //System.out.println(characterCount.countEachCharacter());
    }

    @Test
    public void returnCorrectMapSize(){
        assertEquals(4, characterCount.countEachCharacter().size());
    }

    @Test
    public void returnCorrectMap(){
        assertEquals("{q=2, r=1, s=1, x=2}", characterCount.countEachCharacter().toString());
    }

}