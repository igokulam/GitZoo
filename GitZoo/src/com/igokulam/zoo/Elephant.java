package com.igokulam.zoo;

public class Elephant extends Animal {

	int trunkSize = 5;
	
	public Elephant (String aName) {
		super(Constants.ANIMAL_TYPE_ELEPHANT, aName);
	}
	@Override
	public String getImageFile() {
		return Constants.PICTURE_FILE_ELEPHANT;
	}

	@Override
	public void sound()  throws Exception{
		Helper.playWavSound(Constants.SOUND_FILE_ELEPHANT);
	} 
}
