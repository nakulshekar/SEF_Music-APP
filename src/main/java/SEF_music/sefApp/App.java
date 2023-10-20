package SEF_music.sefApp;
import java.io.*;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // ArtistMain.init();
        Artist artist = new Artist(
        	"596AMMRS{'",
        	"Rahul Gnanashekar",
        	"Chennai|Tamilnadu|India",
        	"09-02-1999",
        	"how are you i am nakul gnanashekar and i am awesome",
        	List.of("music writer","composer"),List.of("pop","jazz","rap"),
        	List.of("2003, Nakul Gnanashekar award for excellence")		
        		);
       System.out.println(ArtistMain.addArtist(artist));
       // System.out.println(ArtistMain.UpdateArtist(artist));
        ArtistMain.printfile();
    }
}
