/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author matthewblacker
 * 
 */       

public class trackList implements IADTtrackList {
    public Track firstLink;
    public trackList(){
        firstLink = null;
    }
    


public void insertLink(int trackID, String title, String artist, int tracklength, String composer, String releasedate, String album, String genre){ 
    
    Track newTrack= new Track(trackID, title, artist, tracklength, composer, releasedate, album, genre);
    newTrack.next = firstLink;
    firstLink = newTrack;
    
}

public String displayTrack() {
    Track track = firstLink;
    String msg = null;
    
    while(track != null)
            {
              
                
                msg = ("\n Track ID is " + track.getTrackID() + "\n Track name is " + track.getTitle() + "\n Track album is " + track.getAlbum() + "\n Track release date is " + track.getReleasedate() + "\n Track length is " + track.getTracklength() + "\n Track genre is " + track.getGenre());
            track = track.next;    
            }
    return msg;
}


@Override
public String searchArtist(String artist)
{
    Track track = firstLink;
    String msg;
    if (!isEmpty()){
        while (track.getArtist() != artist)
        {
            if(track.next == null){
                return"no track";
            }
            else {
                track = track.next;
            }
            }
    } 
    else { 
        return "empty";
    }
    
    msg =  "\n Track ID is " + track.getTrackID() + "\n Track name is " + track.getTitle() + "\n Track album is " + track.getAlbum() + "\n Track release date is " + track.getReleasedate() + "\n Track length is " + track.getTracklength() + "\n Track genre is " + track.getGenre();
    return msg;
}






@Override
public String searchTitle(String title)
{
    Track track = firstLink;
    String msg;
    if (!isEmpty()){
        while (track.getTitle() != title)
        {
            if(track.next == null){
                return"no track";
            }
            else {
                track = track.next;
            }
            }  
    } 
    else { 
        return "empty";
    }
    msg = "\n Track ID is " + track.getTrackID() + "\n Track name is " + track.getTitle() + "\n Track album is " + track.getAlbum() + "\n Track release date is " + track.getReleasedate() + "\n Track length is " + track.getTracklength() + "\n Track genre is " + track.getGenre();
    return msg;
}




    
    public String displayTracks(){
    Track track = firstLink;
    String trackList = "";
    while(track != null) {
      trackList += (  "\n Track ID is " + track.getTrackID() + "\n Track name is " + track.getTitle() + "\n Track album is " + track.getAlbum() + "\n Track release date is " + track.getReleasedate() + "\n Track length is " + track.getTracklength() + "\n Track genre is " + track.getGenre()+ "\n");
   track = track.next;
    }
    return trackList;
}
    
    
public  boolean isEmpty(){
    return(firstLink == null);
}
    @Override
    public String dislayTrack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String dislayTracks() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
    

      


