package playersguide.day27;

public class Day27ThePasswordValidator {
    public static void main(String[] args) {

        boolean endless = true;

        while (endless) {
//        PasswordValidatorOne tryPasswordValidator = new PasswordValidatorOne();
//        String randomPassword = tryPasswordValidator.randomPasswordGenerator();
//        tryPasswordValidator.passwordValidatorOne(randomPassword);}

            PasswordValidatorTwo tryPasswordValidatorTwo = new PasswordValidatorTwo();
            String randomPasswordTwo = tryPasswordValidatorTwo.randomPasswordGeneratorTwo();
            tryPasswordValidatorTwo.passwordValidatorTwo(randomPasswordTwo);
        }
    }
}
