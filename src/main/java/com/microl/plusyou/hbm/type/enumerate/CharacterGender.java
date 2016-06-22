package com.microl.plusyou.hbm.type.enumerate;

public enum CharacterGender {
	FEMALE('F'),
	MALE('M');
	
	public final char code;

	private CharacterGender(char code) {
		this.code = code;
	}
	
	public static CharacterGender fromCode(char code) throws Exception {
		if(code == 'M' || code == 'm') {
			return MALE;
		}
		
		if(code == 'F' || code == 'f') {
			return FEMALE;
		}
		
		throw new Exception("Not male or female gender.");
	}
	
	public char getCode() {
		return code;
	}
}
