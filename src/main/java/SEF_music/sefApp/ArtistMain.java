package SEF_music.sefApp;
import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.io.ObjectInputStream;

public class ArtistMain {

private static final String ID_PATTERN ="^[5-9]{3}[A-Z]{5}[!@#%^&*()_+-=\\[\\]{}|;':\\\",.\\/<>?~']{2}$" ;
private static final String BIRTH_DATE_PATTERN = "^[\\d]{2}-[\\d]{2}-[\\d]{4}$";
private static final String ADDRESS_PATTERN= "^[A-Z][a-z]{3,}\\|[A-Z][a-z]{3,}\\|[A-Z][a-z]{3,}$";
private static final String AWARDS_PATTERN="[\\d]{4},.*";
private static  Set<Artist> ARTISTS= new HashSet<>();


public static void init()
{
	try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\nakul\\new_project\\out.txt")))
	{
		ARTISTS = (HashSet<Artist>)in.readObject();
	} catch (FileNotFoundException e)
	{
		throw new RuntimeException(e);
	}catch (IOException e) {
		throw new RuntimeException (e);
	}catch (ClassNotFoundException e) {
		throw new RuntimeException (e);
	}
}
public static void printfile() {
	ARTISTS.forEach(i->{System.out.println(i.toString());
});
}

private static void writeTofile() {
	try(FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\nakul\\new_project\\out.txt"));
	ObjectOutputStream oos = new ObjectOutputStream(fos)){
		oos.reset();
		oos.writeObject(ARTISTS);
		oos.flush();
	} catch (FileNotFoundException e) {
		throw new RuntimeException (e);
	} catch (IOException e) {
		throw new RuntimeException (e);
	}
}

public static boolean addArtist(Artist artist) {
	final int lengthofBio=artist.getBio().split(" ").length;
	final int lengthofOccupation = artist.getOccupations().size();
	final int lengthofAwards= artist.getAwards().size();
	final int lenghtofGenres = artist.getGenres().size();
	
	if (
			!(Pattern.matches(ID_PATTERN, artist.getID())
			&& Pattern.matches(BIRTH_DATE_PATTERN, artist.getBirthdate())
			&& Pattern.matches( ADDRESS_PATTERN, artist.getAddress())
			
			)
	   ) {
		return false;
	}
	
	if (
		 !((lengthofBio>10 && lengthofBio<30)
		  &&(lengthofOccupation>1 && lengthofOccupation<=5)
		 &&(lengthofAwards<=3)
			)) {
		return false;
	}
	
	

boolean isAwards=true;

for (String award: artist.getAwards()) {
	if (!Pattern.matches(AWARDS_PATTERN, award)) {
		isAwards=false;
	}
	int noOfWords=award.strip().split(",")[1].split(" ").length;
	if(!(noOfWords>4 && noOfWords<10)) {
		isAwards=false;
	}
}
if (! isAwards) {
	return false;
}

if (!(lenghtofGenres>=2 && lenghtofGenres<=5)
	|| (artist.getGenres().contains("rock")&& artist.getGenres().contains("pop")))
{
	return false;
}


for(Artist artist1: ARTISTS) {
	if(artist1.getID().equals(artist.getID())) {
		ARTISTS.remove(artist1);
	}
}
ARTISTS.add(artist);
writeTofile();
return true;
}

public static boolean UpdateArtist(Artist artist) {
boolean isAlreadyExist=false;
Artist currentdata=null;
for(Artist artist1: ARTISTS) {
	if(artist1.getID().equals(artist.getID())) {
		isAlreadyExist=true;
		currentdata=artist1;
	}
	

}
if(!isAlreadyExist) {
	return false;
}
if(Integer.parseInt(currentdata.getBirthdate().split("-")[2])<2000 ) {
	if(!currentdata.getOccupations().equals(artist.getOccupations())) {
		return false;
	}
}
for(String award:currentdata.getAwards()) {
	if((Integer.parseInt(award.split(",")[0])<2000) ) {
		return false;
	}
}
return addArtist(artist);
}
}
