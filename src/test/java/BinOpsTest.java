import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class BinOpsTest {

    @ParameterizedTest
    @MethodSource("provideStringsForSum")
    public void sumTest(String a, String b, String expected){
        BinOps bins = new BinOps();
        //демонстрация
        Assertions.assertEquals(expected, bins.sum(a, b));
    }

    private static Stream<Arguments> provideStringsForSum() {
        return Stream.of(
                Arguments.of("1", "1", "10"),
                Arguments.of("101", "10", "111"),
                Arguments.of("1s1", "s", "a и b должны быть двоичными числами"),
                Arguments.of("4", "3", "a и b должны быть двоичными числами")
        );
    }

    @ParameterizedTest
    @MethodSource("provideStringsForMult")
    public void multTest(String a, String b, String expected){
        BinOps bins = new BinOps();
        //демонстрация
        Assertions.assertEquals(expected, bins.mult(a, b));
    }

    private static Stream<Arguments> provideStringsForMult() {
        return Stream.of(
                Arguments.of("1", "1", "1"),
                Arguments.of("101", "10", "1010"),
                Arguments.of("1s1", "s", "a и b должны быть двоичными числами"),
                Arguments.of("4", "3", "a и b должны быть двоичными числами")
        );
    }
}
