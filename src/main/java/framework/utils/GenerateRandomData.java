package framework.utils;

import java.util.List;
import java.util.Random;

public class GenerateRandomData {
    private static final Random random = new Random();

    private static String generateRandomStringFromString(int length, String stringSource) {
        if (length < 1) {
            throw new IllegalArgumentException("Length must be at least 1");
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(stringSource.length());
            char randomChar = stringSource.charAt(index);
            stringBuilder.append(randomChar);
        }

        return stringBuilder.toString();
    }

    public static String randomStringWithAlphabeticCharacters(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return generateRandomStringFromString(length, characters);
    }

    public static String randomStringAlphanumeric(int length) {
        String alphanumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        return generateRandomStringFromString(length, alphanumeric);
    }

    public static String randomStringAlphanumericCapitalLetter(int length) {
        String alphanumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        return generateRandomStringFromString(length, alphanumeric);
    }

    public static String randomString(int length) {
        String alphanumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZ abcdefghijklmnopqrstuvwxyz 0123456789\" +\n" +
                "            \"!@#$%^&*()-_=+[]{}|;:'\\\",.<>?/`~";
        return generateRandomStringFromString(length, alphanumeric);
    }

    public static String randomNumber(int length) {
        String alphanumeric = "0123456789";
        return generateRandomStringFromString(length, alphanumeric);
    }

    public static String randomStringWithSpecialCharacters(int length) {
        String characters = "!@#$%^&*()=+[{]};:',<>?";
        return generateRandomStringFromString(length, characters);
    }

    /**
     * Example input $AlphabeticSize:10 and the output is a String with the value vREwtEwbGy
     */
    public static String generateRandomByKey(String function) throws IllegalArgumentException {
        String[] values = function.split("Size:");
        int length = Integer.parseInt(values[1]);
        return generateRandomStringByLength(values[0], length);
    }

    public static String generateRandomStringByLength(String typeString, int length) {
        switch (typeString) {
            case "$Alphabetic":
                return randomStringWithAlphabeticCharacters(length);
            case "$Alphanumeric":
                return randomStringAlphanumeric(length);
            case "$Numeric":
                return randomNumber(length);
            case "$String":
                return randomString(length);
            case "$SpecialCharacters":
                return randomStringWithSpecialCharacters(length);
            default:
                throw new IllegalStateException("Unexpected value: " + typeString);
        }
    }

    public static boolean randomBoolean() {
        return random.nextBoolean();
    }

    public static <T> T randomItemFromList(List<T> list) {
        int listSize = list.size();
        int randomIndex = random.nextInt(listSize);
        return list.get(randomIndex);
    }
}
