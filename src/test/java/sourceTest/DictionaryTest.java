package sourceTest;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import source.Dictionary;

public class DictionaryTest {
    public Dictionary dict;

    @Before public void initialize () {
        dict = new Dictionary("Example");
    }



    @Test public void testDictionaryName(){
        assertThat(dict.getName(), equalTo("Example"));
    }
    @Test public void testDictionaryEmpty(){assertThat(dict.getName(),equalTo(null));}

    @Test public void testOneTranslation() {
        dict.addTranslation("contre", "against");
        assertThat(dict.getTranslation("contre"),equalTo("against"));
    }

    @Test public void testOneTranslation2() {
        dict.addTranslation("jouer", "play");
        assertThat(dict.getTranslation("jouer"),equalTo("play"));
    }


}
