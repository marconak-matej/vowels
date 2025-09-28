package io.github.mm.vowels.checker.impl;

import io.github.mm.vowels.checker.VowelChecker;
import java.util.regex.Pattern;

public class RegexVowelChecker implements VowelChecker {
    private static final Pattern VOWEL_PATTERN = Pattern.compile("[aeiouAEIOU]");

    @Override
    public boolean hasVowels(String text) {
        return VOWEL_PATTERN.matcher(text).find();
    }
}
