package model;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Guest on 1/26/18.
 */
public class Birthday {
    private int year;
    private int month;
    private int day;

    public Birthday(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public int getYear(){
        return year;
    }
    public int getMonth() {
        return month;
    }
    public int getDay(){
        return day;
    }
    public int adjustMonth(){
        int oldMonth = getMonth();
        int gregorianAdjustment = oldMonth - 1;
        return gregorianAdjustment;
    }

    public String dateFullForm(){
        GregorianCalendar bday = new GregorianCalendar(getYear(),adjustMonth(),getDay());
        Date bdayDate = bday.getTime();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL);
        String birthdayFullForm = df1.format(bdayDate);
        return birthdayFullForm;
    }
    public int age(){
        GregorianCalendar now = new GregorianCalendar();
        int age = now.get(GregorianCalendar.YEAR)-getYear();
        return age;
    }
}
