package hello.core.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SingletonTest {

    @Test
    @DisplayName("싱글톤 패턴을 적용한 객체 사용")
    void singletonServiceTest() {
        SingletonService s1 = SingletonService.getInstance();
        SingletonService s2 = SingletonService.getInstance();

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        assertThat(s1).isSameAs(s2); // same : == , equal : equals()
    }


}
