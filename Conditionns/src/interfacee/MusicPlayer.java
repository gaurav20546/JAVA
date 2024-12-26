package interfacee;

public class MusicPlayer implements AdvancedmediaPlayer {
	
	String music;
	MusicPlayer(String music)
	{
		this.music=music;
		
	}
	
	@Override
	public void pause() 
	{
		System.out.println("Music is pause :"+music);
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Vedio is Play :"+music);
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Vedio is Stop :"+music);
	}
	

}
/*Create a class MusicPlayer that implements AdvancedMediaPlayer and provides implementations for the methods, 
  and write some standard printing message.*/
