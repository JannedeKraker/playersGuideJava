package playersguide.day27;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordValidator {

    String password;

//    public PasswordValidator() {
//        Scanner inputKeyboard = new Scanner(System.in);
//        System.out.println("Welcome, enter a password that meets the following requirements:\n" +
//                "at least one lowercase letter,\n" +
//                "at least one uppercase letter,\n" +
//                "at least one number,\n" +
//                "no space,\n" +
//                " no uppercase T,\n" +
//                "no &,\n" +
//                "minimum 6 and maximum 13 characters:  ");
//        String newPassWord = inputKeyboard.nextLine();
//        /* this regex means one lowercase letter, one uppercase, one digit, no space, no uppercase T, no &, min 6 max 15 characters*/
//        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?!.* )(?!.*T)(?!.*&)[a-zA-Z\\d#?!@$%^*+~`=_':;,./|<>-]{6,13}$";
//
//        if (Pattern.compile(regex).matcher(newPassWord).matches()) {
//            System.out.println("you have a good password");
//            this.password = newPassWord;
//        } else {
//            System.out.println("Your passcode does not meets the requirements.");
//        }
//    }

    public PasswordValidator() {

    }

    public void randomPasswordValidator(String randomPassword) {

        /* this regex means one lowercase letter, one uppercase, one digit, no space, no uppercase T, no &, min 6 max 15 characters*/
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?!.* )(?!.*T)(?!.*&)[a-zA-Z\\d#?!@$%^*+~`=_':;,./|<>-]{6,13}$";

        if (Pattern.compile(regex).matcher(randomPassword).matches()) {
            System.out.println("you have a good password");
            this.password = randomPassword;
        } else {
            System.out.println("Your passcode does not meets the requirements.");
        }
    }

      public String randomPasswordGenerator() {
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


