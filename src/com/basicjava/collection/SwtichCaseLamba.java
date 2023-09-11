package com.basicjava.collection;

public class SwtichCaseLamba {
	public static void main(String[] args) {
		String day = "W";
		String result = switch (day) {
		    case "M", "W", "F" -> "MWF";
		    case "T", "TH", "S" -> "TTS";

		    default -> {
			    if (day.isEmpty()) {
				    yield "Please insert a valid day.";
			    }
			    else {
				    yield "Looks like a Sunday.";
			    }
		    }
		};

		System.out.println(result); // TTH
	}
}
