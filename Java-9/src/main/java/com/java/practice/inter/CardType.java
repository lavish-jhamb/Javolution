package com.java.practice.inter;

/**
 * DESCRIPTION: To solve this, Java 9 added private and private static methods inside interfaces for reuse within default and static methods, while hiding the helper logic from implementing classes.
 * ✅ Benefits
 * Code Reusability – Avoid repeating common logic in multiple default methods.
 * Encapsulation – Hide implementation details inside the interface.
 * Cleaner Code – Improves readability and maintainability.
 */
public interface CardType {

    void bankCard(String card);

    default void getMessage() {
        System.out.println("Default Method");
    }

    private static String validateBankName() {
        return "Valid Bank";
    }

    private static String getValidation(String bankName, String accountNumber) {
        if (accountNumber.length() > 12) {
            String isValid = validateBankName();
            return isValid + " with account number with specific bank " + bankName;
        }
        return null;
    }

    public static String cardType(String bankName, String accountNumber) {
        if (bankName.equalsIgnoreCase("SBI")) {
            return getValidation(bankName, accountNumber);
        } else if (bankName.equalsIgnoreCase("HDFC")) {
            return getValidation(bankName, accountNumber);
        } else {
            return "card not eligible for the bank";
        }
    }

}
