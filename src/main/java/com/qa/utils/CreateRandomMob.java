package com.qa.utils;
import java.util.Random;
public class CreateRandomMob {
        public static void main(String[] args) {
            // Generate a random 10-digit number
            String mobileNumber = generateRandomMobileNumber();
            System.out.println("Random Indian Mobile Number: " + mobileNumber);
        }

        public static String generateRandomMobileNumber() {
            Random random = new Random();

            // First digit should be between 6 to 9
            int firstDigit = random.nextInt(4) + 6;

            // Generate the remaining 9 digits
            long remainingDigits = (long)(random.nextDouble() * 1_000_000_000L);

            // Combine first digit and remaining 9 digits to form the mobile number
            return firstDigit + String.format("%09d", remainingDigits);
        }
    }

