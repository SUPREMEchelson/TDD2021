package sourceTest;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import source.Dictionary;

public class DictionaryTest {
    public Dictionary dict = new Dictionary();

    @Test public void testDictionaryName(){
        assertThat(dict.getName(), equalTo("Example"));
    }
}
