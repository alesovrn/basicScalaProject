package com.sovrn

import org.apache.spark.sql.SparkSession
import org.scalatest.FlatSpec
import com.sovrn.Main.podSeq2DataFrame

class MainTest extends FlatSpec {
  val spark = SparkSession.builder()
    .appName("basicScalaApp")
    .master("local[2]")
    .getOrCreate()

  "The example" should "be true" in {
    val df = Main.podSeq2DataFrame(spark, Seq("kdlne2", "dkrnel"))
    val numRows = df.count()
    assertResult(2){
      numRows
    }
  }
}
