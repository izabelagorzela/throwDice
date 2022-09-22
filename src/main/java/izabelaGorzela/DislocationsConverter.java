package izabelaGorzela;

import java.util.HashMap;
import java.util.Map;

public class DislocationsConverter {

    public static Map<Integer, Integer> convertDislocationsToMap(String [] dislocations) {
        Map<Integer, Integer> positionAndShiftMap = new HashMap<>();
        for(int i = 0; i < dislocations.length; i ++) {
            String [] splitedOneDislocation = dislocations[i].split(",");
            positionAndShiftMap.put(Integer.decode(splitedOneDislocation[0]), Integer.decode(splitedOneDislocation[1]));
        }
        return positionAndShiftMap;
    }
}