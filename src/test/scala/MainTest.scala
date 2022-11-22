import org.apache.spark.sql.SparkSession
import org.scalatest.FlatSpec

class MainTest extends FlatSpec {
  val spark = SparkSession.builder()
    .appName("basicScalaApp")
    .master("local[2]")
    .getOrCreate()


  "The example" should "be true" in {
    assert(1===1)
  }
}
