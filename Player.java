public interface MediaPlayer{
 public void play(String filename);
}

interface AdvancedMediaPlayer{
 public void playFile(String filename);
}

class MP3Player implements MediaPlayer{
 @Override
 public void play(String filename){
 	System.out.println("Playing MP3 file " + filename);
 }
 }
 
 class MP4Player implements AdvancedMediaPlayer{
  @Override
  public void playFile(String filename){
  	System.out.println("Playing MP4 file " + filename);
  	}
  }
 
 class VLCPlayer implements AdvancedMediaPlayer{
 @Override
 public void playFile(String filename){
 	System.out.println("Playing VLC Player file " + filename);
 	}
 }
 
 class MediaPlayerAdapter implements MediaPlayer{
  private AdvancaedMediaPlayer advancedMediaPlayer;
  public MediaPlayerAdapter (AdvancedMediaPlayer advancedMediaPlayer){
  	this.advancedMediaPlayer = advancedMediaPlayer;
  	}
  	@Override
  	public void play(String filename){
  	System.out.print("Using Media Player Adapter:- ");
  	advancedMediaPlayer.playFile(filename);
  	}
  }
 
 
  
