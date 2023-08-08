import org.junit.jupiter.api.Test

class TestTaskOnGroovy {
    @Test
    void testToValueCounter(){
        assert TaskOnJava.valueCounter([1, 3, 4, 5, 1, 5, 4]).toString() ==
                '[1:2, 3:1, 4:2, 5:2]'

        assert TaskOnJava.valueCounter([1111.1, 3333.3, 4444.4, 5555.56, 1111.1, 5555.56, 4444.4]).toString() ==
                '[4444.4:2, 3333.3:1, 5555.56:2, 1111.1:2]'

        assert TaskOnJava.valueCounter([0, 0, 0, 0, 0, 0, 0]).toString() ==
                '[0:7]'

        assert TaskOnJava.valueCounter(['a', 'b', 'c', 'b', 'b', 'a', 'f']).toString() ==
                '[a:2, b:3, c:1, f:1]'

        assert TaskOnJava.valueCounter(['abc', 'bc', 'ab', 'bc', 'abc', 'bc', 'bc']).toString() ==
                '[ab:1, bc:4, abc:2]'

        assert TaskOnJava.valueCounter([null, 'abc', '', '', 'bc', 'abc', '', 'bc', null, null]).toString() ==
                '[:3, null:3, bc:2, abc:2]'

        assert TaskOnJava.valueCounter([]).toString() ==
                '[:]'

        assert TaskOnJava.valueCounter(null).toString() ==
                '[:]'
    }
}
