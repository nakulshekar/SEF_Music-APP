package SEF_music.sefApp;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.util.List;

import org.junit.Test;


public class ArtistMainTest 
{
	//Checking for valid ID format
    @Test
    public void testID() //test_case-1
   
    {
    	  //test-data_1
    	 Artist artist = new Artist(
    	        	"596AMMRT{'",
    	        	"Nakul Gnanashekar",
    	        	"Chennai|Tamilnadu|India",
    	        	"09-02-1999",
    	        	"how are you i am nakul gnanashekar and i am awesome",
    	        	List.of("music writer","composer"),List.of("pop","jazz","rap"),
    	        	List.of("2003, Nakul Gnanashekar award for excellence")		
  
    			 );
    	 assertTrue( ArtistMain.addArtist(artist) ); 
    	 
    	 //test-data_2
    	 artist = new Artist(
 	        	"196AMMRS{'",
 	        	"Nakul Gnanashekar",
 	        	"Chennai|Tamilnadu|India",
 	        	"09-02-1999",
 	        	"how are you i am nakul gnanashekar and i am awesome",
 	        	List.of("music writer","composer"),List.of("pop","jazz","rap"),
 	        	List.of("2003, Nakul Gnanashekar award for excellence")		

 			 );
    	 assertFalse( ArtistMain.addArtist(artist) ); 
    	 
    }
    //Checking for valid date format
    @Test
    public void testDate() //test-case_2
    {
    	//test-data_1
    	Artist artist = new Artist(
	        	"696AMMRS{'",
	        	"Nakul Gnanashekar",
	        	"Chennai|Tamilnadu|India",
	        	"09-02-1999",
	        	"how are you i am nakul gnanashekar and i am awesome",
	        	List.of("music writer","composer"),List.of("pop","jazz","rap"),
	        	List.of("2003, Nakul Gnanashekar award for excellence")		

			 );	
    	 assertTrue( ArtistMain.addArtist(artist) ); 
    	 
    	 //test_data-2
    	  artist = new Artist(
 	        	"596AMMRS{'",
 	        	"Nakul Gnanashekar",
 	        	"Chennai|Tamilnadu|India",
 	        	"09/02-1999",
 	        	"how are you i am nakul gnanashekar and i am awesome",
 	        	List.of("music writer","composer"),List.of("pop","jazz","rap"),
 	        	List.of("2003, Nakul Gnanashekar award for excellence")		

 			 );	
    	 assertFalse( ArtistMain.addArtist(artist) ); 
    }
   @Test
    public void testAddress() {
	   Artist artist = new Artist(
	        	"596AMMRS{'",
	        	"Nakul Gnanashekar",
	        	"Chennai|Tamilnadu|India",
	        	"09-02-1999",
	        	"how are you i am nakul gnanashekar and i am awesome",
	        	List.of("music writer","composer"),List.of("pop","jazz","rap"),
	        	List.of("2003, Nakul Gnanashekar award for excellence")		

			 );	
   	 assertTrue( ArtistMain.addArtist(artist) ); 
   	 
   	 artist = new Artist(
	        	"596AMMRS{'",
	        	"Nakul Gnanashekar",
	        	"Melbourne-Victoria|Australia",
	        	"09-02-1999",
	        	"how are you i am nakul gnanashekar and i am awesome",
	        	List.of("music writer","composer"),List.of("pop","jazz","rap"),
	        	List.of("2003, Nakul Gnanashekar award for excellence")		

			 );	
 	 assertFalse( ArtistMain.addArtist(artist) ); 
    }
    @Test
   public void testbio()
   {
    	 Artist artist = new Artist(
 	        	"596AMMRS{'",
 	        	"Nakul Gnanashekar",
 	        	"Chennai|Tamilnadu|India",
 	        	"09-02-1999",
 	        	"how are you i am nakul gnanashekar and i am awesome",
 	        	List.of("music writer","composer"),List.of("pop","jazz","rap"),
 	        	List.of("2003, Nakul Gnanashekar award for excellence")		

 			 );	
    	 assertTrue( ArtistMain.addArtist(artist) ); 
    	 
    	 artist = new Artist(
  	        	"596AMMRS{'",
  	        	"Nakul Gnanashekar",
  	        	"Chennai|Tamilnadu|India",
  	        	"09-02-1999",
  	        	"Hi",
  	        	List.of("music writer","composer"),List.of("pop","jazz","rap"),
  	        	List.of("2003, Nakul Gnanashekar award for excellence")		

  			 );	
    	 assertFalse( ArtistMain.addArtist(artist) ); 
    	 
   }
    @Test
    public void testOccupation()
    {
    	 Artist artist = new Artist(
  	        	"596AMMBS{'",
  	        	"Nakul Gnanashekar",
  	        	"Chennai|Tamilnadu|India",
  	        	"09-02-1999",
  	        	"how are you i am nakul gnanashekar and i am awesome",
  	        	List.of("music writer","composer"),List.of("pop","jazz","rap"),
  	        	List.of("2003, Nakul Gnanashekar award for excellence")		

  			 );	
     	 assertTrue( ArtistMain.addArtist(artist) ); 
     	 
     	 artist = new Artist(
   	        	"596AMMRS{'",
   	        	"Nakul Gnanashekar",
   	        	"Chennai|Tamilnadu|India",
   	        	"09-02-1999",
   	        	"how are you i am nakul gnanashekar and i am awesome",
   	        	List.of("music writer","composer","director","camerman","stuntman","Lyricist"),List.of("pop","jazz","rap"),
   	        	List.of("2003, Nakul Gnanashekar award for excellence")		

   			 );	
     	 assertFalse( ArtistMain.addArtist(artist) ); 
     	 
     	 
    }
    @Test
    public void testGenre()
    {
    	 Artist artist = new Artist(
   	        	"599AMMRS{'",
   	        	"Nakul Gnanashekar",
   	        	"Chennai|Tamilnadu|India",
   	        	"09-02-1999",
   	        	"how are you i am nakul gnanashekar and i am awesome",
   	        	List.of("music writer","composer"),List.of("pop","jazz","rap"),
   	        	List.of("2003, Nakul Gnanashekar award for excellence")		

   			 );	
      	 assertTrue( ArtistMain.addArtist(artist) ); 
      	 
      	 artist = new Artist(
    	        	"596AMMRS{'",
    	        	"Nakul Gnanashekar",
    	        	"Chennai|Tamilnadu|India",
    	        	"09-02-1999",
    	        	"how are you i am nakul gnanashekar and i am awesome",
    	        	List.of("music writer","composer"),List.of("pop","rock"),
    	        	List.of("2003, Nakul Gnanashekar award for excellence")		

    			 );	
      	 assertFalse( ArtistMain.addArtist(artist) ); 
      	 
    }
    @Test
    public void testUpdateOccupation()
    {
    	Artist artist = new Artist(
   	        	"586AMMRS{'",
   	        	"Nakul Gnanashekar",
   	        	"Melbourne|Victoria|Australia",
   	        	"09-02-1999",
   	        	"how are you i am nakul gnanashekar and i am awesome",
   	        	List.of("music writer","composer"),List.of("pop","jazz","rap"),
   	        	List.of("2003, Nakul Gnanashekar award for excellence")		

   			 );	
      	 assertTrue( ArtistMain.addArtist(artist) ); 
  
      	artist = new Artist(
   	        	"586AMMRS{'",
   	        	"Nakul Gnanashekar",
   	        	"Melbourne|Victoria|Australia",
   	        	"09-02-1999",
   	        	"how are you i am nakul gnanashekar and i am awesome",
   	        	List.of("music writer","director"),List.of("pop","jazz","rap"),
   	        	List.of("2003, Nakul Gnanashekar award for excellence")		

   			 );	
      	 assertFalse( ArtistMain.UpdateArtist(artist) );
      	 }
    @Test
   public void testAward()
   {
	   Artist artist = new Artist(
  	        	"576AMMRS{'",
  	        	"Nakul Gnanashekar",
  	        	"Melbourne|Victoria|Australia",
  	        	"09-02-1999",
  	        	"how are you i am nakul gnanashekar and i am awesome",
  	        	List.of("music writer","composer"),List.of("pop","jazz","rap"),
  	        	List.of("1999, Nakul Gnanashekar award for excellence")		

  			 );	
     	 assertTrue( ArtistMain.addArtist(artist) ); 
     	 
     	artist = new Artist(
  	        	"576AMMRS{'",
  	        	"Nakul Gnanashekar",
  	        	"Melbourne|Victoria|Australia",
  	        	"09-02-1999",
  	        	"how are you i am nakul gnanashekar and i am awesome",
  	        	List.of("music writer","composer"),List.of("pop","jazz","rap"),
  	        	List.of("1999, Nakul Gnanashekar award for debut composer")	
  	        	

  			 );	
     	 assertFalse( ArtistMain.UpdateArtist(artist) );
   }
   @Test
   public void testAddartist()
   {
	   Artist artist = new Artist(
 	        	"577AMMRS{'",
 	        	"Nakul Gnanashekar",
 	        	"Melbourne|Victoria|Australia",
 	        	"09-02-1999",
 	        	"how are you i am nakul gnanashekar and i am awesome",
 	        	List.of("music writer","composer"),List.of("pop","jazz","rap"),
 	        	List.of("1999, Nakul Gnanashekar award for excellence")		

 			 );	
    	 assertTrue( ArtistMain.addArtist(artist) ); 
    	 
    	 artist = new Artist(
  	        	"777AMMRS{'",
  	        	"Nakul Gnanashekar",
  	        	"Melbourne|Victoria|Australia",
  	        	"09-02-1999",
  	        	"how are you i am nakul gnanashekar and i am awesome",
  	        	List.of("music writer","composer"),List.of("pop","jazz","rap"),
  	        	List.of("1999, Nakul Gnanashekar award for excellence")		

  			 );	 
    	 assertFalse( ArtistMain.UpdateArtist(artist) );}
   
    
}
