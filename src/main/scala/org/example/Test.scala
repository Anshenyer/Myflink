package org.example

import org.apache.flink.api.java.io.TextInputFormat
import org.apache.flink.api.scala._


object Test {
  def main (args: Array[String] ): Unit = {
    val env = ExecutionEnvironment.getExecutionEnvironment

//    val inputDataSet = env.readFile(TextInputFormat,"D:\\00-CodeDir\\Myflink\\src\\main\\resources\\file")

    val inputDataSet = env.readTextFile("D:\\00-CodeDir\\Myflink\\src\\main\\resources\\file")

    val dataStream  = inputDataSet.map(x=> (x,1))


    dataStream.print()

//    env.execute("textStreamJob")

  }
}
