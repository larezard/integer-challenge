import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ChallengeTests {

    private static Operations input;

    @BeforeAll
    public static void createsStatisticsObject(){
        ArrayList<Integer> entry = new ArrayList<>(
                Arrays.asList(6, 9, 15, -2, 92, 11)
        );
        input = new Operations();
        input.calculateStatistics(entry);
    }

    @Test
    public void numberOfElements(){
        Assertions.assertEquals(6, input.getSizeOfEntry());
    }

    @Test
    public void minimumValue(){
        Assertions.assertEquals(-2, input.getMinimum());
    }

    @Test
    public void maximumValue(){
        Assertions.assertEquals(92, input.getMaximum());
    }

    @Test
    public void average(){
        Assertions.assertEquals(21.833333,input.getAverage(), 0.001);
    }
}
