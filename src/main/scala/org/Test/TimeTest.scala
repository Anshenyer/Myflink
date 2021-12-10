package org.Test

import org.joda.time.DateTime

import java.text.SimpleDateFormat
import java.util.Date

object TimeTest {
  def main(args: Array[String]): Unit = {
    /*
    * 通过字符串创建时间
    * */
    val dateStr = "2018-06-01 12:00:00"
    val pattern1 = "yyyy-MM-dd HH:mm:ss"
    val date = new SimpleDateFormat(pattern1).parse(dateStr)
    val dateTime = new DateTime(date)
    println(date)
    println(dateTime)

    //只给时间默认日期为1970
    val timeStr = "12:15:00"
    val pattern2  = "HH:mm:ss"
    val timeDate = new SimpleDateFormat(pattern2).parse(timeStr)
    println(timeDate)

    //时间戳转换为日期
    val time:Long= 1547718199  //秒   *1000是转化为毫秒的形式
    val newTime :String = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(time*1000)
    println("时间戳转换"+newTime)

    val time1:Long= 1547718199000L //毫秒

    val timestampToDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(time1))

    println("时间戳创建日期"+timestampToDate)

    val nowTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date)
    println(nowTime)
    //通过指定日期创建时间  不能直接写字符串，需要通过SimpleDateFormat
    //    val now_date = new DateTime("2021-12-01 12:30:13")
    val now_date1 = new Date()
    //    println(new SimpleDateFormat("HH:mm:ss").format(now_date))
    println(now_date1.getTime)
  }
}
