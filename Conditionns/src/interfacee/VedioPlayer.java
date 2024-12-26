package interfacee;

public class VedioPlayer implements AdvancedmediaPlayer {

	String music;
	VedioPlayer(String music){
		this.music=music;

	}
	@Override
	public void pause() {
		
		System.out.println("Vedio is pause :"+music);
		
	}

	@Override
	public void play() {
		
		System.out.println("Vedio is Play :"+music);
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Vedio is Stop :"+music);
	}

}
/*Create a class VideoPlayer that implements AdvancedMediaPlayer and provides implementations for the methods.
 *  and write some standard printing message. */
