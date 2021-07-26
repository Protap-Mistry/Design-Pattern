package lab_3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MediaPlayer videoFile = new VideoFile("avi" , "Tutorial1");
		MediaPlayer audioFile = new AudioFile("amr" , "Radio_recording_1");
		MediaPlayer mp3File1 = new Mp3File("Audio" , "Rock_song1");
		MediaPlayer flacFile1 = new FlacFile("Audio" , "Rock_song2");
		MediaPlayer mp4File1 = new Mp4File("Video" , "movie1");
		MediaPlayer mkvFile1 = new MkvFile("Video" , "movie2");
		videoFile.addfile(mkvFile1);
		videoFile.addfile(mp4File1);
		audioFile.addfile(mp3File1);
		audioFile.addfile(flacFile1);
		videoFile.print();  
		audioFile.print();
	}

}
