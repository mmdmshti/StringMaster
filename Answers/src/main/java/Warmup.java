import java.util.Objects;
import java.util.Scanner;

public class Warmup {

    /**
     * Goal : Simple Introduction To Strings
     * In the first function, your inputs are a number and a sentence
     * @return is the number th word of the sentence
     */
    public String wordFinder(String sentence, int number) {

        String[] list = String.split(" ");
        if(number > list.length)
        {
            return " Number = " + number + " is out Of Bound";
        }
        else
            return list[number - 1 ];
    }

    /**
     * Goal : Basic introduction to Strings & using foreach
     * @param number        is in String type
     * @param searchForEven is a boolean entry
     * @return if searchForEven is true ? return the number of even numbers : return the number of odd numbers
     */
    public int oddEvenCounter(String number, boolean searchForEven) {

        public static void main(String[] args) {
            int s, new_num, count, count_1;
            count = 0;
            count_1 = 1;


            if (Objects.equals(searchForEven, "true")) {
                while (true) {

                    if ((number % 10) % 2 == 0) {
                        count++;
                    }
                    number /= 10;
                    if (number % 10 == number)
                        break;
                }
                return count;
            }

            if (Objects.equals(searchForEven, "false")) {
                while (true) {

                    if ((number % 10) % 2 != 0) {
                        count_1++;
                    }
                    number /= 10;
                    if (number % 10 == n)
                        break;

                }
                return count_1;
            }

        }
    }

    /**
     * @param wordA --> first word
     * @param wordB --> second word
     * @return The word that is first in alphabet column
     */
    public String firstWord(String wordA, String wordB) {

        String[] Word_1 = wordA.split("");
        String[] Word_2 = wordB.split("");
        int a = 0;
        int p;
        if(Word_2.length > Word_1.length){
            p = Word_1.length;
        }
        else{
            p = Word_2.length;
        }

        for (int i = 0; i < p; i++) {

            int l = Word_1[i].compareTo(Word_2[i]);
            if (l < 0) {
                return wordA;
                a = 5;
                break;
            }
            if (l > 0) {
                System.out.println(wordB);
                a = 5;
                break;
            }

        }
        if(Word_1.length > Word_2.length && a == 0)
        {
            return wordA;
        }
        else if(Word_1.length < Word_2.length && a ==0){
            return wordB;
        }



    }
}
