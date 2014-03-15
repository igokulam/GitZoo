package com.igokulam.zoo;

public class Shark extends Animal {
	public Shark(String aName){
		super(Constants.ANIMAL_TYPE_SHARK, aName);
	}

	@Override
	public String getImageFile() {
		// TODO Auto-generated method stub
		 return Constants.PICTURE_FILE_SHARK;
	}

	@Override
	public void sound()  throws Exception{
		// TODO Auto-generated method stub
		Helper.playWavSound(Constants.SOUND_FILE_SHARK);

	}

}
