package SEF_music.sefApp;
import java.io.*;
import java.util.*;

public class Artist implements Serializable {
private String ID;
private String Name;
private String Address;
private String Birthdate;
private String Bio;
private List <String> Occupations;
private List <String> Genres;
private List <String> Awards;

public Artist(String id, String name, String address, String birthdate, String bio, 
		List <String> occupations, List <String> genres, List <String> awards)
{
	ID =id;
	Name=name;
	Address=address;
	Birthdate=birthdate;
	Bio=bio;
	Occupations=occupations;
	Genres=genres;
	Awards=awards;	
}

public String getID() {
	return ID;
}

public String getName() {
	return Name;
}

public String getAddress() {
	return Address;
}

public String getBirthdate() {
	return Birthdate;
}

public String getBio() {
	return Bio;
}

public List<String> getOccupations() {
	return Occupations;
}

public List<String> getGenres() {
	return Genres;
}

public List<String> getAwards() {
	return Awards;
}

@Override
public int hashCode() {
	return Objects.hash(ID);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Artist artist = (Artist) obj;
	return Objects.equals(ID, artist.ID);
}


@Override
public String toString() {
	return "Artist [ID=" + ID + ", Name=" + Name + ", Address=" + Address + ", Birthdate=" + Birthdate + ", Bio=" + Bio
			+ ", Occupations=" + Occupations + ", Genres=" + Genres + ", Awards=" + Awards + "]";
}



}
