package com.java.practice.lambda_expression;

import java.util.List;

public class LambdaTypeInference {

    public static void main(String[] args) {

        List<String> names = List.of("Omen", "Reyna", "Neon", "Raze", "Chamber");

        names.forEach((var name) -> {
            System.out.println(name);
        });

    }

}
