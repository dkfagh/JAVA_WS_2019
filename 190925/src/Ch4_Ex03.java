class Song {
	private String title, artist, country;
	private int year;
	
	public Song(String title, String artist, String country, int year) {
		this.title = title;
		this.artist = artist;
		this.country = country;
		this.year = year;
	}
	public void show() {
		System.out.println(year+"�� "+country+"������ "+artist+"�� �θ� "+title);
	}
}

public class Ch4_Ex03 {
	public static void main(String[] args) {
		Song song = new Song("Dancing Queen", "ABBA", "������", 1978);
		song.show();
	}
}