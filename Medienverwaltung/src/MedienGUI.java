import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class MedienGUI {
	
	private Medienverwaltung mv;
	JTabbedPane verwaltung; 
	SucheGUI suche; 
	PlaylistGUI playlist;
	
	public MedienGUI(Medienverwaltung mv) {
		this.mv = mv;
	}
	
	public void start() {
		
		verwaltung = new JTabbedPane();
		suche = new SucheGUI(mv);
		playlist = new PlaylistGUI(mv);
		
		verwaltung.add("Medien", suche.getGUI());
		verwaltung.add("Playlist", playlist.getGUI());
		
		JFrame frame = new JFrame("Medienverwaltung");
		frame.setSize(900, 600);
		frame.add(verwaltung);
		frame.setVisible(true);
		
	}

}
