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
public class Controller {
    private trackList list; 
    public Controller(){ 
        this.list = new trackList();
    }
    public void run() {
        boolean end = false;
        do {
            char choice = displayMenu();
            switch (choice) {
                case '1': 
          list.insertLink(1, "Paint it black", "Rolling Stones", 3, "composer1", "date1", "album1", "Rock");
          list.insertLink(2, "Wasted", "Tiesto", 4, "composer2", "date2", "album2", "Dance");
          list.insertLink(3, "Faded", "Kanye West", 5, "composer3", "date3", "album3", "Hip hop");
          list.insertLink(4, "Meet me halfway", "Fergie", 6, "composer4", "date4", "album4", "Pop");
          list.insertLink(5, "Party rock anthem", "LMFAO", 6, "composer4", "date5", "album5", "Pop");
          list.insertLink(6, "Rockstar", "Nickleback", 7, "composer4", "date6", "album6", "Rock");
          list.insertLink(7, "Highway to hell", "ACDC", 8, "composer4", "date7", "album7", "Rock");
          list.insertLink(8, "Yellow", "Coldplay", 9, "composer4", "date8", "album8", "Indie");
          System.out.println("Test tracks added");
          System.out.println();
                    break;
                case '2':  
          String displayedTrack = list.displayTrack();
          System.out.println("Track: " + displayedTrack);
          System.out.println();
                    break;
                case '3':
          String track = list.searchTitle("Yellow");
          System.out.println("Track: " + track);
          System.out.println();
                    break;
                case '4':
          String artist = list.searchArtist("ACDC");
          System.out.println("Track: " + artist);
          System.out.println();
                    break;
              
                case '5':
                 String allTracks = list.displayTracks();
          System.out.println("Track data: " + allTracks);
          System.out.println();
            }
        }while (!end);
        
    }      
    private char displayMenu() {
        inputhelper inputHelper = new inputhelper();
         System.out.print("\n1. Add tracks to test");
         System.out.print("\n2. Display the track");        
         System.out.print("\n3. Track title search test: Yellow");
         System.out.print("\n4. Track artist search test: ACDC");
         System.out.print("\n5. All tracks test;");
         return inputHelper.readCharacter("\n Enter choice");
    }
}

