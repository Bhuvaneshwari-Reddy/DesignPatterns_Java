package org.Practice;
//Allows the interface of an existing class to be used as another interface,
// making it compatible with what the client expects.

 interface MediaPlayer{
     void play(String audioType,String fileName);
 }

 class Mp3Player implements MediaPlayer{
   public void play(String audioType,String fileName){
   System.out.println("Playing MP3 file:"+fileName);
     }
   }

 class MediaAdapter implements  MediaPlayer{
     private Mp3Player mp3player=new Mp3Player();
     public  void play(String audioType,String fileName )
     {
     if(audioType.equalsIgnoreCase("MP3")){
         mp3player.play(audioType,fileName);
     }
     }

 }

public class AdapterDesign {
public static void main(String [] args){
    MediaPlayer obj=new MediaAdapter();
    obj.play("MP3","song.mp3");
}

}
