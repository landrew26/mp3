package jenkins.model

import jenkins.model.IdStrategy.idFromFilename
import org.junit.Test
import org.junit.Assert.assertEquals

public class IdStrategyTest{
    @Test
    public void testSimpleReturn() throws Exception{
      String name = 'goodname1';
      String new_name = idFromFilename(name);
      assertEquals(name, new_name);
    }
}
