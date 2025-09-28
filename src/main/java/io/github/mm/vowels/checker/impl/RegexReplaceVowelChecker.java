package io.github.mm.vowels.checker.impl;

import io.github.mm.vowels.checker.VowelChecker;

public class RegexReplaceVowelChecker implements VowelChecker {
    private static final String VOWELS_MATCH = "[aeiouAEIOU]";

    @Override
    public boolean hasVowels(String text) {
        var withoutVowels = text.replaceAll(VOWELS_MATCH, "");
        return withoutVowels.length() != text.length();
    }
}
