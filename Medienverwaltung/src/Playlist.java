import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Playlist {
	
	private String title;
	private Date erstellDatum;
	private boolean favorit;
	private List<Medium> medien = new LinkedList<Medium>();
	
	public Playlist(String title, Date erstellDatum) {
		this.title = title;
		this.erstellDatum = erstellDatum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isFavorit() {
		System.out.println("boolean jam");
		return favorit;
	}

	public void setFavorit(boolean favorit) {
		this.favorit = favorit;
	}

	public Date getErstellDatum() {
		return erstellDatum;
	}
	
	public void abspielen(boolean zufall) {
		
	}
	
	public void pausieren() {
		
	}
	
	public void add(Medium medium) {
		medien.add(medium);
		
		System.out.println("test");
	}
	
	public boolean delete(int indexNr) {
		boolean jam;
		try {
			medien.remove(indexNr);
			jam = true;
		}catch(IndexOutOfBoundsException e) {
			jam = false;
		}
		return jam;
	}
	
	public Medium get(int indexNr) {
		try {
			return medien.get(indexNr);
		}catch(IndexOutOfBoundsException e) {
			return null;
		}
		
	}
	
	public int getLaenge() {
		return medien.size();
	}

	@Override
	public String toString() {
		return "Playlist [title=" + title + ", erstellDatum=" + erstellDatum + ", favorit=" + favorit + ", medien="
				+ medien + "]";
	}
}
