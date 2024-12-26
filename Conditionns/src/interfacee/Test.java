package interfacee;

import New.maintheater;

public class Test 
{
	public static void main(String [] args )
	{
	AdvancedmediaPlayer  m=new MusicPlayer("tere nam");
	m.pause();
	m.play();
	m.stop();
	}
	

}
/*Take  a Test class to demonstrate the functionality of the media player system.


Test Case-1 :
--------------

Sample Input:

Song Title: " Life"

Expected Output :

MusicPlayer [Song Title: Life]
Playing music	: Life
Pausing music	: Life
Stopping music	: Life


Test Case-2 :
---------------
Sample Input :" "

Expected Output :
error message :Title is not be empty string.*/