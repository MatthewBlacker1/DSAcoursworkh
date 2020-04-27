/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author matthewblacker
 */
public interface IADTtrackList {
    public void insertLink(int trackID, String title, String artist, int trackLength, String composer, String releasedate, String album, String genre);
    public String dislayTrack();
    public String dislayTracks();
    public String searchTitle(String title);
    public String searchArtist(String artist);

    public String displayTracks();
    
}
