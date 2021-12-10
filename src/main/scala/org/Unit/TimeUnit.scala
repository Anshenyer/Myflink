package org.Unit

import org.joda.time.DateTime

import java.text.SimpleDateFormat
import java.util.Date

object TimeUnit {
  def main(args: Array[String]): Unit = {
    val arr = Array(1L)
  }

//Todo
/*
* 1.创建一个根据指定时间、指定间隔、类型，返回指定长度的时间数据的方法
* timestamp getTimeArray(time,interval,size)
*
* date getTimeArray(time,interval,size)
* */

  def getDateFromTimeStamp(timestamp:Long):Date={
    return new Date()
  }

  def getTimeStampFromDate(date:Date):Long={
    return 1L
  }

  def getTimeStampArray(startDate:Date,size:Int,interval:Int):Array[Long]={
    return Array(1L)
  }

  def getDateArray(startDate:Date,size:Int,interval:Int):Array[Date]={
    return Array(new Date())
  }

  def getIntervalOfTimeStamp(timpStamp1:Long,timpStamp2:Long):Int = {
    return 0
  }

}
