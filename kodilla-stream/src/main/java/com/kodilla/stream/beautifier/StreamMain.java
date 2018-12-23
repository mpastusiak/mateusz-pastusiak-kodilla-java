package com.kodilla.stream.beautifier;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("pies", text -> "ABC" + text + "ABC");
        poemBeautifier.beautify("kot", text -> text.toUpperCase());
        poemBeautifier.beautify("lalala", text -> text + "♫♫♫´¨`*•.¸¸");
        poemBeautifier.beautify("baran", text -> text.replace("a", "A"));
    }
}
