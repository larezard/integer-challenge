import java.util.ArrayList;
import java.util.Collections;

public class Operations {
    private final ArrayList<Integer> userInput;
    private double average;
    private int sizeOfEntry;

    public  Operations (ArrayList<Integer> entry) {
        Collections.sort(entry);
        userInput = entry;
        setSizeOfEntry();
    }

    public double getAverage(){
        for (Integer integer : userInput) {
            average += integer;
        }
        return (average/userInput.size());
    }

    public Integer getMaximum (){
        return userInput.get(getSizeOfEntry()-1);
    }

    public Integer getMinimum (){
        return userInput.get(0);
    }

    public void setSizeOfEntry() {
        this.sizeOfEntry = userInput.size();
    }

    public int getSizeOfEntry() {
        return sizeOfEntry;
    }

}