import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Questions {

    ArrayList <String> firstPart = new ArrayList<>();
    ArrayList<String> secondPart= new ArrayList<>();
    ArrayList <String> thirdPart = new ArrayList<>();
    ArrayList<ArrayList<String>> arrayLists =  new ArrayList<>();
    int numsOfQuestions;


    Questions() {}

    public void init() throws NoSuchAlgorithmException {
        Scanner in = new Scanner(System.in);
        Logger.getAnonymousLogger().log(Level.FINE,"Put the number of questions each list");
        this.numsOfQuestions = in.nextInt();


        for(int i = 0; i< this.getNumsOfQuestions(); i++ ){

            Logger.getAnonymousLogger().log(Level.FINE,"Put the question from the first part ");
            this.firstPart.add(in.next());
        }
        for(int i = 0; i< this.getNumsOfQuestions(); i++ ){

            Logger.getAnonymousLogger().log(Level.FINE,"Put the question from the second part ");
            this.secondPart.add(in.next());
        }
        for(int i = 0; i< this.getNumsOfQuestions(); i++ ){

            Logger.getAnonymousLogger().log(Level.FINE,"Put the question from the third part ");
            this.thirdPart.add(in.next());
        }
        this.divide();
    }


    public void divide () throws NoSuchAlgorithmException {

        Random rand = SecureRandom.getInstanceStrong();
        for (int i = 0 ; i < this.getNumsOfQuestions(); i++){
            this.arrayLists.add(new ArrayList<String>(){
                {
                    add(firstPart.remove(rand.nextInt(firstPart.size())));
                    add(secondPart.remove(rand.nextInt(secondPart.size())));
                    add(thirdPart.remove(rand.nextInt(thirdPart.size())));
                } });

        }

    }

    public String getRandomElement(List<String> list) throws NoSuchAlgorithmException {
        Random rand = SecureRandom.getInstanceStrong();
        return list.get(rand.nextInt(list.size()));
    }



    public List<String> getThirdPart() {
        return thirdPart;
    }

    public void setThirdPart(List<String> thirdPart) {
        this.thirdPart = (ArrayList<String>) thirdPart;
    }

    public List<String> getSecondPart() {
        return secondPart;
    }

    public void setSecondPart(List<String> secondPart) {
        this.secondPart = (ArrayList<String>) secondPart;
    }

    public List<String> getFirstPart() {
        return firstPart;
    }

    public void setFirstPart(List<String> firstPart) {
        this.firstPart = (ArrayList<String>) firstPart;
    }

    public int getNumsOfQuestions() {
        return numsOfQuestions;
    }

    public void setNumsOfQuestions(int numsOfQuestions) {
        this.numsOfQuestions = numsOfQuestions;
    }
}
