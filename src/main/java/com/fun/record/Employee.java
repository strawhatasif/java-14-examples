package com.fun.record;

/**
 * This is a PREVIEW feature in Java 14 (JEP 359)
 * Records are amazing! They reduce the amount of code/clicks a Programmer needs to perform for a data class!!!
 *
 * I found more helpful information here - https://mkyong.com/java/java-14-record-data-class/
 *
 * P.S. record classes are immutable (no setters, all values passed in are final).
 */
public record Employee(int employeeID, String name) {};
