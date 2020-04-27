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
public class Track {
    protected int trackID;
    protected String title;
    protected String artist;
    protected int tracklength;
    protected String composer;
    protected String releasedate;
    protected String album;
    protected String genre;
    protected Track next;
    
    /**
     *
     * @param trackID
     * @param title
     * @param artist
     * @param trackLength
     * @param composer
     * @param releaseDate
     * @param album
     * @param genre
     */
    public Track(int trackID, String title, String artist, int tracklength, String composer, String releaseDate, String album, String genre){
        this.trackID = trackID;
        this.title = title;
        this.artist = artist;
        this.tracklength = tracklength;
        this.composer = composer;
        this.releasedate = releasedate;
        this.album = album;
        this.genre = genre;
                
         
        
    }
    public void display(){
}
    
    public String getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(String releasedate) {
        this.releasedate = releasedate;
    }

    public int getTrackID() {
        return trackID;
    }

    public void setTrackID() {
        this.trackID = trackID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getTracklength() {
        return tracklength;
    }

    public void setTracklength(int tracklength) {
        this.tracklength = tracklength;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

   

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    
    
}
