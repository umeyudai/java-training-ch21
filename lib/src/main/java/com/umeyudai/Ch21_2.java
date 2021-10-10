package com.umeyudai;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
public class Ch21_2 {
    public static void main(String[] args) {
		LocalDate d1 = LocalDate.of(2020,1,1);
		LocalDate d2 = LocalDate.of(2020,7,1);
		LocalDate d3 = LocalDate.of(2020,9,1);
		LocalDate d4 = LocalDate.of(2020,10,1);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MM月dd日 eeee");

		TemporalAdjuster adj2M = TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.MONDAY);
		TemporalAdjuster adj3M = TemporalAdjusters.dayOfWeekInMonth(3, DayOfWeek.MONDAY);
		
		System.out.println(d1.with(adj2M).format(fmt));
		System.out.println(d2.with(adj3M).format(fmt));
		System.out.println(d3.with(adj3M).format(fmt));
		System.out.println(d4.with(adj2M).format(fmt));		
	}

}
