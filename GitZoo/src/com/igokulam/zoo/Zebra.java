package com.igokulam.zoo;

public class Zebra extends Animal {
	
	public Zebra(String aName) {
		super(Constants.ANIMAL_TYPE_ZEBRA, aName);
	}

	@Override
	public String getImageFile() {
		// TODO Auto-generated method stub
		return Constants.PICTURE_FILE_ZEBRA;
	}

	@Override
	public void sound()  throws Exception{
		// TODO Auto-generated method stub
		Helper.playWavSound(Constants.SOUND_FILE_ZEBRA);

	}

}
