import java.util.ArrayList;
import java.util.Optional;

public class Statistics implements Operations {

    private final ArrayList<Integer> userInput;
    private double average;
    private int sizeOfEntry;
    private int max;
    private int min;

    public Statistics(ArrayList<Integer> entry) {
        this.userInput = entry;

        setSizeOfEntry();
        setMinimum();
        setMaximum();
        setAverage();

        this.average = getAverage();
        this.min = getMinimum();
        this.max = getMaximum();
    }

    @Override
    public void setAverage() {
        double averg = 0;
        for (Integer integer : userInput) {
            averg += integer;
        }
        this.average = (averg/this.userInput.size());
    }

    @Override
    public double getAverage() {
        return this.average;
    }

    @Override
    public void setMaximum() {
        Optional<Integer> reduce = userInput.stream()
                                            .reduce((accumulator, total) -> accumulator > total ? accumulator : total);
        this.max = reduce.isPresent() ? reduce.get(): 0;
    }

    @Override
    public Integer getMaximum() {
        return this.max;
    }

    @Override
    public void setMinimum() {
        Optional<Integer> reduce = userInput.stream()
                                            .reduce((accumulator, total) -> accumulator < total ? accumulator : total);
        this.min = reduce.isPresent() ? reduce.get(): 0;
    }

    @Override
    public Integer getMinimum() { return this.min; }

    @Override
    public void setSizeOfEntry() {
        this.sizeOfEntry = this.userInput.size();
    }

    @Override
    public int getSizeOfEntry() {
        return this.sizeOfEntry;
    }
}