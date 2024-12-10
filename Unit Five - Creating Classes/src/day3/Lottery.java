package day3;

public class Lottery {
    private int numberOfNumbers;
    private int range;
    private String generatedNumbers;

    public Lottery(int numberOfNumbers, int range) {
        this.numberOfNumbers = numberOfNumbers;
        this.range = range;
        this.generatedNumbers = "";
    }

    public void generateNumbers() {
        int numbersGenerated = 0;
        generatedNumbers = " ";
        while (numbersGenerated < numberOfNumbers) {
            int number = (int) (Math.random() * range) + 1;

            // check if that number has already been generated
            if (generatedNumbers.indexOf(" " + number + " ") < 0) {
                numbersGenerated++;
                if (numbersGenerated == numberOfNumbers)
                    generatedNumbers += number + " ";
                else if (numbersGenerated == 1)
                    generatedNumbers += number + " ";
                else 
                    generatedNumbers += number + " ";
            }
        }

        //generatedNumbers = generatedNumbers.substring(1, generatedNumbers.length() - 1);
    }

    public void displayNumbers() {
        int number = 1;
        String num = "";
        for (int i = 1; i < generatedNumbers.length(); i++) {
            if (generatedNumbers.substring(i, i + 1).equals(" ")) {
                System.out.println("Number " + number + ": " + num);
                num = "";
                number++;
            } else {
                num += generatedNumbers.substring(i, i + 1);
            }
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Lottery lotto = new Lottery(6, 29);
            lotto.generateNumbers();
            lotto.displayNumbers();
        }

    }
}
