package com.umeyudai;
import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
public class Ch21_1 {
    public static void main(String[] args) {
		LocalDate date = LocalDate.of(2024,8,2);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("Gy年M月d日 eee");
		System.out.println(JapaneseDate.from(date).format(fmt));
		
		Period p = Period.between(LocalDate.of(2018,2,1), date);
		System.out.print("オリンピックまであと");
		System.out.print(p.getYears()+"年");
		System.out.print(p.getMonths()+"月");
		System.out.print(p.getDays()+"日");
	}
}
