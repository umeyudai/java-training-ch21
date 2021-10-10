package com.umeyudai;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Ch21_4 {
    public static void main(String[] args) {
		LocalDateTime dt1 = LocalDateTime.of(2020, 2, 21, 13, 0, 0);
		LocalDateTime dt2 = LocalDateTime.of(2021, 5, 7, 10, 15, 30);
		LocalDateTime dt3 = dt1.plusMinutes(3245).plusSeconds(320);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("y/M/d ahh:mm:ss");
		System.out.println(dt3.format(fmt));
	
		Duration p = Duration.between(dt1, dt2);
		System.out.print("全期間は"+p.toSeconds()+"秒間");
	}
}
