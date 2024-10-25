package exercise1;

public class Main {

	/* 1. Convert the adapter sample to a Class Adapter. */
	public static void main(String[] args) {
		//CigaretteLighterReceptacle carLighter = new CigaretteLighterReceptacle();
		//MP3Player myPlayer = new MP3Player("SanDisk",4,new UsbToCarAdapter(carLighter));
		//myPlayer.charge();

		MP3Player myPlayer = new MP3Player("SanDisk",4, new ClassAdapter());
		myPlayer.charge();
	}

}
