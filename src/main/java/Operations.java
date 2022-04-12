import java.util.ArrayList;
import java.util.Optional;

public class Operations {
    private final ArrayList<Integer> userInput;
    private double average;
    private int sizeOfEntry;
    private int max;
    private int min;

    public  Operations (ArrayList<Integer> entry) {
        this.userInput = entry;

        setSizeOfEntry();
        setMinimum();
        setMaximum();
        setAverage();

        this.average = getAverage();
        this.min = getMinimum();
        this.max = getMaximum();
    }

    public void setAverage(){
        double averg = 0;
        for (Integer integer : userInput) {
            averg += integer;
        }
        this.average = (averg/this.userInput.size());
    }

    public double getAverage(){ return this.average; }

    public void setMaximum (){
        Optional<Integer> reduce = userInput.stream()
                                            .reduce((accumulator, total) -> accumulator > total ? accumulator : total);
        this.max = reduce.isPresent() ? reduce.get(): 0;
    }

    public Integer getMaximum(){ return this.max; }

    public void setMinimum (){
        Optional<Integer> reduce = userInput.stream()
                                            .reduce((accumulator, total) -> accumulator < total ? accumulator : total);
        this.min = reduce.isPresent() ? reduce.get(): 0;
    }

    public Integer getMinimum(){ return this.min; }

    public void setSizeOfEntry() {
        this.sizeOfEntry = this.userInput.size();
    }

    public int getSizeOfEntry() {
        return this.sizeOfEntry;
    }

}
