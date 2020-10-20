import java.util.Comparator;

public class WordData  implements Comparator <WordData>{

	public String word;
	public int distance;
	
	
	public WordData(String word, int distance) {
		this.word = word;
		this.distance = distance;
	}


	@Override
	public int compare(WordData a, WordData b) {
		
		return a.distance - b.distance; 
	}
	
	
	
}
