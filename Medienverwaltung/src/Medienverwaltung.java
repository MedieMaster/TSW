import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Medienverwaltung {
	
	private List<Foto> fotoListe;
	private List<Musiktitel> musiktitelListe;
	private List<Video> videoListe;
	private List<Playlist> playlistenListe;
	
	
	public Medienverwaltung() {
		fotoListe = new ArrayList<Foto>();
		musiktitelListe = new ArrayList<Musiktitel>();
		videoListe = new ArrayList<Video>();
		playlistenListe = new LinkedList<Playlist>();
		binladen();
	}

	public List<Medium> suchen(String name, int mArt) {
		
		List<Medium> liste = new ArrayList<Medium>();
		name = name.toLowerCase();
		
		if(mArt == 1 || mArt == 0) {
			for(int i=0; i<fotoListe.size(); i++) {
				if(fotoListe.get(i).getName().toLowerCase().contains(name)) {
					liste.add(fotoListe.get(i));
				}
			}
		}
		if(mArt == 2 || mArt == 0){
			for(int i=0; i<videoListe.size(); i++) {
				if(videoListe.get(i).getName().toLowerCase().contains(name)) {
					liste.add(videoListe.get(i));
				}
			}
		}
		if(mArt == 3 || mArt == 0) {
			for(int i=0; i<musiktitelListe.size(); i++) {
				if(musiktitelListe.get(i).getName().toLowerCase().contains(name)) {
					liste.add(musiktitelListe.get(i));
				}
			}
		}
			
			
		return liste;
	}
	
	public void addMedium(Medium medium) {
		
		if(medium instanceof Foto) {
			fotoListe.add((Foto)medium);
		}
		else if(medium instanceof Video) {
			videoListe.add((Video)medium);
		}
		else if(medium instanceof Musiktitel) {
			musiktitelListe.add((Musiktitel)medium);
		}
		
	}
	
	public boolean deleteMedium(Medium medium) {
		
		boolean jam = false;
		
		if(medium instanceof Foto) {
			for(int i=0; i<fotoListe.size(); i++) {
				if(fotoListe.get(i).equals(medium)) {
					jam = true;
					fotoListe.remove(i);
				}
			}
		}
		else if(medium instanceof Video) {
			for(int i=0; i<videoListe.size(); i++) {
				if(videoListe.get(i).equals(medium)) {
					jam = true;
					videoListe.remove(i);
				}
			}
		}
		else if(medium instanceof Musiktitel) {
			for(int i=0; i<musiktitelListe.size(); i++) {
				if(musiktitelListe.get(i).equals(medium)) {
					jam = true;
					musiktitelListe.remove(i);
				}
			}
		}
		
		return jam;
	}
	
	public void addPlaylist(Playlist playlist) {
		playlistenListe.add(playlist);
	}
	
	public boolean deletePlaylist(Playlist playlist) {
		return playlistenListe.remove(playlist);
	}
	
	public List<Playlist> getPlaylistenListe(){
		return new LinkedList<Playlist>(playlistenListe);
	}
	
	public void binladen() {
		Musiktitel m1 = new Musiktitel(3l, "Never gonna give you up", "mp3", new Date(), "idk", "Rick Astley", "Whenever you need somebody", 213, 256, "pop");
		musiktitelListe.add(m1);
		Foto f1 = new Foto(1l, "Mona Lisa", "png", new Date(), "idk", 2160, 3840, null, "Louvre");
		fotoListe.add(f1);
		Video v1 = new Video(1l, "Linus Drop Tips", "mp4", new Date(), "idk", 420, 3840, 2160, 60, "MP4");
		videoListe.add(v1);
		
		Musiktitel m2 = new Musiktitel(3l, "Crab Rave", "mp3", new Date(), "idk", "Noisestorm", "", 213, 256, "pop");
		musiktitelListe.add(m1);
		Foto f2 = new Foto(1l, "Gigachad Face", "png", new Date(), "idk", 2160, 3840, null, "Photoshop");
		fotoListe.add(f1);
		Video v2 = new Video(1l, "Linus Sex Tips", "mp4", new Date(), "idk", 420, 3840, 2160, 60, "MP4");
		videoListe.add(v1);
		
		Playlist p1 = new Playlist("Dinge", new Date());
		p1.setFavorit(true);
		p1.add(m1);
		p1.add(f1);
		p1.add(v1);
		playlistenListe.add(p1);
		
		Playlist p2 = new Playlist("Dinge2", new Date());
		p2.setFavorit(false);
		p2.add(m2);
		p2.add(f2);
		p2.add(v2);
		playlistenListe.add(p2);
	}
	
	public void speichern() {
		
	}
}