package izabelaGorzela;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Throw {

    public static Set<Integer> roll(String [] dislocation, int diceSize, int startSquare, int stopSquare) {
        Set<Integer> possibleFieldSet = new TreeSet();
        Map<Integer, Integer> positionAndShiftMap = DislocationsConverter.convertDislocationsToMap(dislocation);
        int squareAfterToss;
        for(int i = 1; i <= diceSize; i ++) {
            squareAfterToss = startSquare + i;
            if(squareAfterToss <= stopSquare) {
                if(positionAndShiftMap.containsKey(squareAfterToss))
                    possibleFieldSet.add(positionAndShiftMap.get(squareAfterToss));
                else
                    possibleFieldSet.add(squareAfterToss);
            }
        }
        return possibleFieldSet;
    }
}