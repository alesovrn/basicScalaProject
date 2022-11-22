package com.sovrn

import org.apache.spark.sql.types.{BooleanType, StringType, StructType}
import org.apache.spark.sql.{DataFrame, Row, SparkSession}

import scala.collection.Seq
import scala.collection.mutable.ListBuffer

/**
 * @author Amy Le
 */
object Main {
  def podSeq2DataFrame(spark: SparkSession, sequence: Seq[String]): DataFrame = {
    var arrayData = new ListBuffer[Row]
    for (x <- sequence) {
      arrayData.append(Row(x, true))
    }
    val arraySchema = new StructType()
      .add("pod", StringType)
      .add("trmEnabledPod", BooleanType)

    val df = spark.createDataFrame(spark.sparkContext.parallelize(arrayData), arraySchema)
    df
  }
  def main(args: Array[String]): Unit = {

  }
}