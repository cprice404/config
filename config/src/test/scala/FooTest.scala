import com.typesafe.config.ConfigFactory
import com.typesafe.config.impl.Tokens
import org.junit.Assert._
import org.junit.Test

/**
 * Created by cprice on 2/24/15.
 */
class FooTest {

  @Test
  def foo() {
    val x = ConfigFactory.parseString("foo: {bar: {bam: baz}}")
    assertEquals(true, true)

//    val expected = List(Tokens.START, tokenFalse, tokenUnquoted("foo"), Tokens.END)
//    assertEquals(expected, tokenizeAsList("""falsefoo"""))
  }

}
