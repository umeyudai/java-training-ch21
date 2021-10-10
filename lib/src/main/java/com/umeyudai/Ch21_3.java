package com.umeyudai;
import java.time.Duration;
import java.time.LocalTime;
public class Ch21_3 {
    public static void main(String[] args) {
		Duration tanaka = Duration.between(LocalTime.of(9,12,30), LocalTime.of(14,15,10));
		Duration suzuki = Duration.between(LocalTime.of(9,35,20), LocalTime.of(15,44,20));
		disp("田中宏　", tanaka);
		disp("鈴木二郎", suzuki);
		Duration dif = suzuki.minus(tanaka);
		disp("時間差　", dif);
	}
	public static void disp(String title, Duration d) {
		System.out.print(title + " ");
		System.out.print(d.toHoursPart() + "時間 ");
        System.out.print(d.toMinutesPart()+ "分 ");
        System.out.println(d.toSecondsPart() + "秒 ");		
	}
}
