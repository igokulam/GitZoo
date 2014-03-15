package com.igokulam.zoo;

public class Cheetah extends Felida {
	
	public Cheetah(String aName){
		super(Constants.ANIMAL_TYPE_CHEETAH, aName);
	}

	@Override
	public String getImageFile() {
		return Constants.PICTURE_FILE_CHEETAH;
	}

	@Override
	public void sound()  throws Exception{
		Helper.playWavSound(Constants.SOUND_FILE_CHEETAH);
	}

}
