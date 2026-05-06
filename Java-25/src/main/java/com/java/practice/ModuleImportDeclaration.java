package com.java.practice;

// Bulky imports
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Map;
//import java.util.Random;
//import java.util.Set;

// Java 25 feature ( Module Import Declaration )
import module java.base;

public class ModuleImportDeclaration {
    void main() {

        List<Integer> numbers = List.of(1,2,3,4);

        Map<String,Integer> map = new HashMap<>();

        Set<Integer> set = new HashSet<>();

        Random random = new Random();
    }
}
