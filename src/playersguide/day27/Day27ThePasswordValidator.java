package playersguide.day27;
//        The fifth and final pedestal describes a class that represents a concept more
//        abstract than the first four: a password validator. You must create a class that
//        can determine if a password is valid (meets the rules defined for a legitimate
//        password). The pedestal initially doesn’t describe any rules, but as you brush
//        the dust off the pedestal, it vibrates for a moment, and the following rules appear:
//        - Passwords must be at least 6 letters long and no more than 13 letters long.
//        - Passwords must contain at least one uppercase letter, one lowercase letter,
//        and one number. - Passwords cannot contain a capital T or an ampersand (&)
//        because Ingelmar in IT has decreed it. That last rule seems random, and you
//        wonder if the pedestal is just tormenting you with obscure rules. You ponder
//        for a moment about how to decide if a character is uppercase, lowercase, or a
//        number, but while scratching your head, you notice a piece of folded parchment
//        on the ground near your feet. You pick it up, unfold it, and read it: foreach
//        with a string lets you get its characters!
//        > for (char ch: word.toCharArray()) {
//        if (Character.isUpperCase(ch))
//        }
//        Character has static methods to categorize letters!
//        > char.isUpperCase('A'), char.isLowerCase('a'), char.isDigit('0')
//        That might be useful information! You are grateful to whoever left it behind.
//        It is signed simply “A.”
//        Objectives:
//        • Define a new PasswordValidator class that can be given a password and
//        determine if the password follows the rules above.
//        • Make your main method loop forever, asking for a password and reporting
//        whether the password is allowed using an instance of the PasswordValida-
//        tor class.
//        To study if you find this difficult yet: - You can find out about methods in
//        Character by either typing in “Character.” in IntelliJ or by looking at the Java
//        API documentation for Character - since char is a primitive type (in contrast
//        to a String), you can use ‘==’ for comparisons :)
//Minimum 6 and maximum 13 characters, at least one uppercase letter,
// one lowercase letter, one number and one special character:
// "^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{6,13}$"
// at least one lowercase letter , at least one uppercase letter,at least one number,  no space, no uppercase T, no &,
// Minimum 6 and maximum 13 characters:
// "^(?=.*[a-z])[#?!@$%^*-](?=.*[A-Z])(?=.*\d)(?!.* )(?!.*T)(?!.*&)[a-zA-Z\d]{6,13}$"
public class Day27ThePasswordValidator {
    public static void main(String[] args) {
        PasswordValidator trypasswordValidator = new PasswordValidator();

        String randomPassword = trypasswordValidator.randomPasswordGenerator();
        trypasswordValidator.randomPasswordValidator(randomPassword);
    }
}
