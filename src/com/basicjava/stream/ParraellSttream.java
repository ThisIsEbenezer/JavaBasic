package com.basicjava.stream;

import java.util.Arrays;
import java.util.List;

class Students {
	
	String name;
	int score;
	
	public Students(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
	
		
}
public class ParraellSttream {
	public static void main(String[] args) {
		List<Students> studList = Arrays.asList( 
				new Students("A",81),
				new Students("b",64),
				new Students("c",20),
				new Students("f",98),
				new Students("g",97),
				new Students("d",51),
				new Students("e",91)
				);
		studList.stream().filter(s->s.getScore() >=80).limit(3)
		.forEach(stu->System.out.println(stu.getName()+ "="+stu.getScore()));
		System.out.println("----");
		
		studList.parallelStream().filter(s->s.getScore() >=80).limit(3)
		.forEach(stu->System.out.println(stu.getName()+ "="+stu.getScore()));
		System.out.println("----");
		studList.stream().parallel().filter(s->s.getScore() >=80).limit(3)
		.forEach(stu->System.out.println(stu.getName()+ "="+stu.getScore()));
		
		
		
		
	}

}
