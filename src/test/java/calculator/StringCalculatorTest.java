package calculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

    final StringCalculator calculator = new StringCalculator();

    @DisplayName("빈 문자열을 입력하는 경우 0을 반환한다")
    @Test
    void emptyTest() {
        final int expect = calculator.calculate("");
        assertThat(expect).isEqualTo(0);
    }

    @DisplayName("null을 입력하는 경우 0을 반환한다")
    @Test
    void nullTest() {
        final int expect = calculator.calculate(null);
        assertThat(expect).isEqualTo(0);
    }

    @DisplayName("숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환한다")
    @Test
    void oneNumberTest() {
        final int expect = calculator.calculate("1");
        assertThat(expect).isEqualTo(1);
    }

    @DisplayName("숫자 두개를 컴마(,) 구분자로 입력할 경우 두 숫자의 합을 반환한다")
    @Test
    void twoNumberWithCommaTest() {
        final int expect = calculator.calculate("1,2");
        assertThat(expect).isEqualTo(3);
    }

    @DisplayName("구분자를 컴마(,) 이외에 콜론(:)을 사용할 수 있다")
    @Test
    void colonTest() {
        final int expect = calculator.calculate("1,2:3");
        assertThat(expect).isEqualTo(6);
    }

    @DisplayName("//와 \\n문자 사이에 커스텀 구분자를 지정할 수 있다")
    @Test
    void customDelimiterTest() {
        final int expect = calculator.calculate("//;\n1;2;3");
        assertThat(expect).isEqualTo(6);
    }

    @DisplayName("커스텀 구분자와 기존 구분자를 함께 사용할 수 있다")
    @Test
    void withCustomDelimiterTest() {
        final int expect = calculator.calculate("//;\n1,2:3;4");
        assertThat(expect).isEqualTo(10);
    }

    @DisplayName("음수를 전달하는 경우 RuntimeException 예외 처리를 한다")
    @Test
    void negativeNumberTest() {
        assertThatThrownBy(
            () -> calculator.calculate("-1")
        ).isInstanceOf(RuntimeException.class);

        assertThatExceptionOfType(RuntimeException.class)
            .isThrownBy(() -> calculator.calculate("-1"));
    }

}
