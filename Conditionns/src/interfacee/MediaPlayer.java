package interfacee;

public interface MediaPlayer 
{
	public void play();
	public void stop();
	
	
	
}
/*Question-1
-------------
Design a Software System for a Media Player
---------------------------------------------------
Define an interface named as MediaPlayer 
 in this interface declare two abstract method

Methods :

name 			: play()
Return Type  		:void
Access Modifier 	:public


Methods :

name 			: stop()
Return Type  		:void
Access Modifier 	:public

Define another interface AdvancedmediaPlayer that extends MediaPlayer
and in this interface add one more abstract method i.e :
 
name 			: pause()
Return Type  		:void
Access Modifier 	:public


Create a class MusicPlayer that implements AdvancedMediaPlayer and provides implementations for the methods, and write some standard printing message.

Create a class VideoPlayer that implements AdvancedMediaPlayer and provides implementations for the methods. and write some standard printing message.

Take  a Test class to demonstrate the functionality of the media player system.


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