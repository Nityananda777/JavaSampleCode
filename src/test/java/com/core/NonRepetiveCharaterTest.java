package com.core;

import static org.junit.Assert.*;

import com.core.string.NonRepetiveCharater;
import org.junit.Test;

public class NonRepetiveCharaterTest {

    @Test
    public void testFirstNonRepeatedCharacter() {
        assertEquals('b', NonRepetiveCharater.firstNonRepeatingChar("abcdefghija"));
        assertEquals('h', NonRepetiveCharater.firstNonRepeatingChar("hello"));
        assertEquals('J', NonRepetiveCharater.firstNonRepeatingChar("Java"));
        assertEquals('i', NonRepetiveCharater.firstNonRepeatingChar("simplest"));
    }

    @Test
    public void testFirstNonRepeatingChar() {
        assertEquals('b', NonRepetiveCharater.firstNonRepeatingChar("abcdefghija"));
        assertEquals('h', NonRepetiveCharater.firstNonRepeatingChar("hello"));
        assertEquals('J', NonRepetiveCharater.firstNonRepeatingChar("Java"));
        assertEquals('i', NonRepetiveCharater.firstNonRepeatingChar("simplest"));
    }

    @Test
    public void testGetFirstNonRepeatedChar() {
        assertEquals('b', NonRepetiveCharater.firstNonRepeatingChar("abcdefghija"));
        assertEquals('h', NonRepetiveCharater.firstNonRepeatingChar("hello"));
        assertEquals('J', NonRepetiveCharater.firstNonRepeatingChar("Java"));
        assertEquals('i', NonRepetiveCharater.firstNonRepeatingChar("simplest"));
    }
}