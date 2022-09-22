package izabelaGorzela;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;
import static org.junit.Assert.assertEquals;

public class ThrowParameterizedTest {

    @ParameterizedTest
    @MethodSource("rollTestData")
    public void rollTest(Set<Integer> expectedResult, String[] dislocation, int diceSize, int startSquare, int stopSquare) {

        assertEquals(expectedResult, Throw.roll(dislocation, diceSize,  startSquare, stopSquare));
    }

    private static Stream<Arguments> rollTestData() {

        Set<Integer> expectedResultForTest1 = new HashSet<>();
        Set<Integer> expectedResultForTest2 = new HashSet<>();
        Set<Integer> expectedResultForTest3 = new HashSet<>();
        Set<Integer> expectedResultForTest4 = new HashSet<>();
        Set<Integer> expectedResultForTest5 = new HashSet<>();
        Set<Integer> expectedResultForTest6 = new HashSet<>();

        expectedResultForTest1.add(1);
        expectedResultForTest1.add(2);
        expectedResultForTest1.add(6);
        expectedResultForTest1.add(10);

        expectedResultForTest2.add(29);
        expectedResultForTest2.add(48);
        expectedResultForTest2.add(49);
        expectedResultForTest2.add(50);
        expectedResultForTest2.add(51);
        expectedResultForTest2.add(52);

        expectedResultForTest3.add(1);
        expectedResultForTest3.add(2);
        expectedResultForTest3.add(3);
        expectedResultForTest3.add(4);
        expectedResultForTest3.add(7);
        expectedResultForTest3.add(8);
        expectedResultForTest3.add(9);
        expectedResultForTest3.add(10);
        expectedResultForTest3.add(22);

        expectedResultForTest4.add(96);
        expectedResultForTest4.add(97);
        expectedResultForTest4.add(98);
        expectedResultForTest4.add(99);
        expectedResultForTest4.add(100);

        expectedResultForTest5.add(58);
        expectedResultForTest5.add(72);
        expectedResultForTest5.add(73);
        expectedResultForTest5.add(75);
        expectedResultForTest5.add(76);
        expectedResultForTest5.add(77);
        expectedResultForTest5.add(79);

        expectedResultForTest6.add(1);
        expectedResultForTest6.add(2);
        expectedResultForTest6.add(3);
        expectedResultForTest6.add(5);
        expectedResultForTest6.add(6);


        return Stream.of(

                Arguments.of(expectedResultForTest1, Dislocation.DISLOCATIONS_1_FOR_TEST, 6, 0, 20),
                Arguments.of(expectedResultForTest2, Dislocation.DISLOCATIONS_2_FOR_TEST, 6, 46, 100),
                Arguments.of(expectedResultForTest3, Dislocation.DISLOCATIONS_2_FOR_TEST, 10, 0, 50),
                Arguments.of(expectedResultForTest4, Dislocation.DISLOCATIONS_2_FOR_TEST, 10, 95, 100),
                Arguments.of(expectedResultForTest5, Dislocation.DISLOCATIONS_3_FOR_TEST, 10, 70, 100),
                Arguments.of(expectedResultForTest6, Dislocation.DISLOCATIONS_4_FOR_TEST, 6, 0, 100)
        );
    }
}