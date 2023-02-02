public class DNI {
    private int number;
    private char letter;

    public DNI() {
        this.number = 0;
        this.letter = 'A';
    }

    public DNI(int number, char letter) {
        this.number = number;
        this.letter = letter;

        if (!isValidLetter(letter)) {
            this.number = -1;
        }
    }

    public DNI(int number) {
        this.number = number;
        this.letter = calculateLetter(number);
    }

    public DNI(String s) {

        this.number = Integer.parseInt(s.substring(0, s.length() - 1));
        this.letter = s.charAt(s.length() - 1);

        if (!isValidLetter(letter)) {
            this.number = -1;
        }
    }


    public int getNumber() {
        return this.number;
    }

    public char getLetter() {
        return this.letter;
    }

    public void setNumber(int number) {
        this.number = number;
        this.letter = calculateLetter(number);
    }

    public String toString() {
        return this.number + "" + this.letter;
    }

    public String toFormattedString() {
        return String.format("%d.%03d.%03d-%c", this.number / 10000000, (this.number / 10000) % 1000, (this.number / 10) % 1000, this.letter);
    }

    public boolean correctDNI() {
        return this.number >= 0 && isValidLetter(this.letter);
    }

    public static char letterForDni(int number) {
        return calculateLetter(number);
    }

    public static String NifForDni(int number) {
        char letter = calculateLetter(number);
        return number + "" + letter;
    }

    private static char calculateLetter(int number) {
        String letters = "TRWAGMYFPDXBNJZSQVHLCKE";
        int mod = number % 23;
        char letter = letters.charAt(mod);
        return letter;
    }

    private static boolean isValidLetter(char letter) {
        String letters = "TRWAGMYFPDXBNJZSQVHLCKE";
        return letters.indexOf(letter) >= 0;
    }
}
