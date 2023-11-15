public class Logic {

    private int rows = 0;
    private int words = 0;
    private int chars = 0;
    private String[] wordArray;
    private String longestWord = "";

    /**
     * Räknar och sparar antal rader, ord och tecken
     * @param newRow Inkommande String med textrad
     */
    public void inputCount(String newRow) {
        if (!newRow.contains("stop")) { //Så länge inte ordet "stop" har hittats, görs allt i blocket. Undviker att raden med "stop" räknas med i statsen
            rows++;
            wordArray = newRow.split(" "); //Delar upp den inkommande textraden i en array med ord separerade av mellanslag
            words += wordArray.length;

            for (int i = 0; i < wordArray.length; i++) { //Stegar igenom wordArray, hackar upp varje ord till char och sparar i en egen array (utan mellanslag)
                char[] charArray = wordArray[i].toCharArray();
                chars += charArray.length;
            }

            findLongestWord(); //Anropar metod för att leta efter längsta ordet

            /*Alternativ om man istället VILL räkna med mellanslagen som tecken:
            chars += newRow.length();*/
        }
    }

    /**
     * Hittar och sparar det längsta ordet
     */
    public void findLongestWord() {
        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i].length() >= longestWord.length()) { //Om ordet på plats [i] är längre än det existerande ordet i longestWord...
                longestWord = wordArray[i]; //...så sparas longestWord över med det nya, längsta ordet hittills
            }
        }
    }

    /**
     * Hittar ordet "stop" för att kunna avsluta eller fortsätta loopen
     * @param newRow Inkommande String med textrad
     * @return Boolean med true om stop finns, false om inte
     */
    public boolean findStop(String newRow) {
        boolean isStop = false;
        if (newRow.contains("stop")) {
            isStop = true;
            return isStop;
        }
        return isStop;
    }

    /**
     * Ett gäng getters!
     * @return
     */
    public int getRows() {
        return rows;
    }

    public int getWords() {
        return words;
    }

    public int getChars() {
        return chars;
    }

    public String getLongestWord() {
        return longestWord;
    }
}
