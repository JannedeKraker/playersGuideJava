package playersguide.day27;

import java.util.Random;

// because the assignment was not to check the passwords with a regex but with a for loop, I go
// create this class again.
//
// > for (char ch: word.toCharArray()) {
//       if (Character.isUpperCase(ch))
//       }
//      Character has static methods to categorize letters!
//       > char.isUpperCase('A'), char.isLowerCase('a'), char.isDigit('0')
public class PasswordValidatorTwo {

    String password;

    public PasswordValidatorTwo() {

    }

    public void passwordValidatorTwo(String randomPassword) {
        int minOneUpperCase = 0;
        int minOneLowerCase = 0;
        int minOneDigit = 0;

        for (char ch : randomPassword.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                if (ch == 'T') {
                    System.out.println("The password is not good, you have an 'T' in it");
                    return;
                } else {
                    minOneUpperCase++;
                }
            } else if (Character.isLowerCase(ch)) {
                minOneLowerCase++;
            } else if (Character.isDigit(ch)) {
                minOneDigit++;
            } else if (ch == '&') {
                System.out.println("The password is not good, you have an '&' in it");
                return;
            }
        }
        if ((minOneUpperCase >= 1) && (minOneLowerCase >= 1) && (minOneDigit >= 1)) {
            if ((randomPassword.length() >= 6) && (randomPassword.length() <= 13)) {
                password = randomPassword;
                System.out.println("The password is good.");
            }
        } else {
            System.out.println("The password does not meet the requirements");
        }
    }

    public String randomPasswordGeneratorTwo() {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        String randomPassword = null;
        String alphabet = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_+-~`=[]{}|<>,./?;:'";
        for (int i = 0; i < 13; i++) {
            char randomChar = alphabet.charAt(random.nextInt(alphabet.length()));
            randomPassword = String.valueOf(stringBuilder.append(randomChar));
        }
        System.out.println(randomPassword);
        return randomPassword;
    }
}


