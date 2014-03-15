package com.igokulam.zoo;



public class Shepard extends Dog {
	

	public Shepard (String aname) {
		 super(Constants.ANIMAL_TYPE_SHEPARD,aname);
	}
	
public String getImageFile() {
	return Constants.PICTURE_FILE_SHEPARD;
}

public void sound()  throws Exception{
	Helper.playWavSound(Constants.SOUND_FILE_SHEPARD);
	
	
}



}











