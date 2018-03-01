import java.io.InputStream;
import java.io.FileInputStream;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class AudioOS{

private	File fileSong;
private	AudioInputStream audioStream;
private	Clip clip;

	public String Reproducir(String cancion)
	{
		String etiq="";
		try
		{
			String song = cancion+".wav";
			fileSong= new File(song);
			audioStream=AudioSystem.getAudioInputStream(fileSong);
			clip = AudioSystem.getClip();
			clip.open(audioStream);
			clip.start();
			etiq = "Now Playing: "+cancion;
		}
		catch(Exception ex)
		{
			etiq = "Error"+ex;
		}
		return etiq;
	}
	
	
	public void Parar()
	{
		clip.stop();	
	}
}