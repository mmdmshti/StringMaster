import java.util.Objects;

public class Advanced {

    /**
     * Goal : Changing a Sentence Content

     * In this function, you have a sentence, a word & a newWord as Entry
     * You have to search the sentence to find the word that you were given as input and change it with the newWord

     */
    public String wordCensor(String sentence, String word, String newWord){
        int i = 0;

        String[] list = sentence.split(" ");


        while(true){

            if(Objects.equals(list[i], word)){
                list[i] = newWord;
                break;
            }
            else{
                i++;
            }
        }
        for(int x = 1 ; x < list.length  ; x++ ){
            list[0] = list[0] + " " + list[x];


        }
        return list[0];
    }


    public String normalizingName(String firstName, String lastName){
        firstName = firstName.toLowerCase();
        lastName = lastName.toLowerCase();
        String[] name1 = firstName.split("");
        String[] lastname1 = lastName.split("");
        name1[0] = name1[0].toUpperCase();
        lastname1[0] = lastname1[0].toUpperCase();
        for (int i = 1; i < name1.length; i++) {
            name1[0]+=name1[i];
        }
        for (int x = 1; x < lastname1.length; x++) {
            lastname1[0]+=lastname1[x];
        }
        if(name1[0] == " "){
            return lastname1[0];
        }
        else if(lastname1[0] == " "){
            return name1[0];
        }
        else {
            return name1[0] + " " + lastname1[0];
        }
    }

    public String doubleChar(String word) {

        String[] list = word.split("");
        for(int i = 0 ; i < list.length - 1;){
            if(!Objects.equals(list[i], list[i + 1]))
            {
                list[0] += list[i + 1];
                i++;
            }
            else
            {
                i++;
            }
        }
        return list[0];

    }
}

