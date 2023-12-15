package com.cola.example.utils;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;
import java.util.TimeZone;

/**
 * 时间工具类以这个为主，逐步替换老的工具类
 * 线程安全，性能佳
 *
 * @autho
 */
public class DateUtils {

    public static final Long MIN_LEN10_VALUE = 1000000000L;

    public static final Long MAX_LEN10_VALUE = 9999999999L;

    public static final int SECOND = 1000;

    public static final int MINUTE = 60 * SECOND;

    public static final int HOUR = 60 * MINUTE;

    public static final int DAY = 24 * HOUR;

    /**
     * 时间格式，不够自己加
     */
    public enum Pattern {
        yyyy_MM("yyyy-MM"),
        yyyyMM("yyyyMM"),
        yyyy_MM_dd("yyyy-MM-dd"),
        yyyyMMdd("yyyyMMdd"),
        yyyy_MM_dd_HH_mm_ss("yyyy-MM-dd HH:mm:ss"),
        yyyyMMddHHmmss("yyyyMMddHHmmss"),
        yyyy_MM_dd_HH_mm_ss_zh("yyyy年MM月dd日HH时mm分ss秒"),
        yyyy_MM_dd_HH_mm_ss_SSS("yyyy-MM-dd HH:mm:ss.SSS"),
        yyyy_MM_dd_zh("yyyy年MM月dd日"),
        yyyy_MM_dd_HH_mm_zh("yyyy年MM月dd日HH时mm分"),
        HH_mm("HH:mm"),
        yyyy_MM_dd_HH_mm("yyyy-MM-dd HH:mm"),
        yyyy_MM_DD_HH_MM_SSZ("yyyy-MM-dd HH:mm:ssZ");

        private String pattern;

        Pattern(String pattern) {
            this.pattern = pattern;
        }

        public String getPattern() {
            return pattern;
        }
    }



    /**
     * 时间转为字符串
     *
     * @param date
     * @param pattern
     * @return
     */
    public static String date2str(Date date, Pattern pattern) {
        DateTimeFormatter fmt = DateTimeFormat.forPattern(pattern.getPattern());
        DateTime dateTime = new DateTime(date);
        return fmt.print(dateTime);
    }

    /**
     * 毫秒转为字符串
     *
     * @param milliseconds
     * @param pattern
     * @return
     */
    public static String long2str(Long milliseconds, Pattern pattern) {
        DateTimeFormatter fmt = DateTimeFormat.forPattern(pattern.getPattern());
        DateTime dateTime = new DateTime(milliseconds);
        return fmt.print(dateTime);
    }

    /**
     * 增加分钟
     *
     * @param date
     * @param minutes
     * @return
     */
    public static Date plusMinutes(Date date, int minutes) {
        DateTime dateTime = new DateTime(date.getTime());
        return dateTime.plusMinutes(minutes).toDate();
    }

    /**
     * 增加天数
     *
     * @param date
     * @param days
     * @return
     */
    public static Date plusDays(Date date, Integer days) {
        DateTime dateTime = new DateTime(date.getTime());
        return dateTime.plusDays(days).toDate();
    }

    /**
     * 缩短天数
     *
     * @param date
     * @param days
     * @return
     */
    public static Date minusDays(Date date, Integer days) {
        DateTime dateTime = new DateTime(date.getTime());
        return dateTime.minusDays(days).toDate();
    }

    public static int calculateTimestampInSecond(long endTimestamp, long beginTimestamp) {
        return (int) ((endTimestamp - beginTimestamp) / SECOND);
    }

    public static int calculateTimestampInSecondOfAbsolute(long oneTimestamp, long secondTimestamp) {
        return (int) (Math.abs(oneTimestamp - secondTimestamp) / SECOND);
    }

    public static long calculateTimestampInMillisecond(long endTimestamp, long beginTimestamp) {
        return endTimestamp - beginTimestamp;
    }

    //获取当天零点零分零秒的毫秒数
    public static long getTodayBeginTimestamp() {
        return System.currentTimeMillis() / DAY * DAY - TimeZone.getDefault().getRawOffset();
    }

    //获取当天23点59分59秒的毫秒数
    public static long getTodayEndTimestamp() {
        return getTodayBeginTimestamp() + DAY - 1;
    }

    //获取当天时间的毫秒数
    public static long getCurrentTimestamp() {
        return System.currentTimeMillis();
    }

    //获取当天剩余秒数
    public static int getRemainingSecondsOfTheDay() {
        return calculateTimestampInSecond(getTodayEndTimestamp(), getCurrentTimestamp());
    }

    /**
     * 获取10位的时间戳
     *
     * @param date 目标日期
     * @return 10位时间戳（long）
     */
    public static long getTimestampByDate(Date date) {
        return date.getTime() / 1000;
    }

    /**
     * 获取当前的10位时间戳
     *
     * @return 10位时间戳（long）
     */
    public static Long currentTimestamp() {
        return System.currentTimeMillis() / 1000;
    }


}
