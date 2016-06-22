package com.microl.plusyou.hbm.type.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.microl.plusyou.hbm.type.enumerate.CharacterGender;

@Converter
public class CharacterGenderConverter implements AttributeConverter<CharacterGender, Character> {

	public Character convertToDatabaseColumn(CharacterGender gender) {
		if(gender == null) {
			return null;
		}
		
		return gender.getCode();
	}

	public CharacterGender convertToEntityAttribute(Character charValue){
		if(charValue == null) {
			return null;
		}
		
		CharacterGender charGender = null;
		try {
			charGender = CharacterGender.fromCode(charValue);
		} catch(Exception ex) {
			System.out.println("Caught Not Male or Female");
		} finally {
			System.out.print("charGender is " + charGender);
		}
		
		return charGender;
	}
}
