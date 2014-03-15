package com.igokulam.zoo;

public class Lion extends Felida {
	
	public Lion(String aName) {
		super(Constants.ANIMAL_TYPE_LION, aName);
	}
	@Override
	public String getImageFile() {
		// TODO Auto-generated method stub
		return Constants.PICTURE_FILE_LION;
	}
	

	@Override
	public void sound()  throws Exception{
		// TODO Auto-generated method stub
		Helper.playWavSound(Constants.SOUND_FILE_LION);

	}

}
