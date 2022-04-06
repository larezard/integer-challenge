import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

public class Operations {
    private final ArrayList<Integer> userInput;
    private double average;
    private int sizeOfEntry;

    public  Operations (ArrayList<Integer> entry) {
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
        Optional<Integer> reduce = userInput.stream()
                                            .reduce((n1, n2) -> n1 > n2 ? n1 : n2);
        return reduce.isPresent() ? reduce.get(): null;
    }

    public Integer getMinimum (){
        Optional<Integer> reduce = userInput.stream()
                                            .reduce((n1, n2) -> n1 < n2 ? n1 : n2);
        return reduce.isPresent() ? reduce.get(): null;
    }

    public void setSizeOfEntry() {
        this.sizeOfEntry = userInput.size();
    }

    public int getSizeOfEntry() {
        return sizeOfEntry;
    }

}
