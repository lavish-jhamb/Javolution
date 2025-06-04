package com.java.practice.type_inference;

import java.util.ArrayList;
import java.util.List;


/**
 *  Local variable type inference:
 *  - The var keyword was introduced to allow local-variable type inference.
 *  - Now, the compiler can infer the type of variable, reducing boilerplate code.
 *  NOTE:
 *      - Works only for local variables within methods, loops, or a limited scope.
 *      - Cannot be used for instance variables, method parameters, return types and non initialize variables (var x; - error because it is non initialize).
 */
public class TypeInference {
    public static void main(String[] args) {

        List<String> name = new ArrayList<>(); // Normal Reference

        var number = new ArrayList<Number>(); // Type Reference

    }
}
