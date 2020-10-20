import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Levenshtein {
	
	 private static JButton search= new JButton("Search");
	 private static JTextField inputTF = new JTextField(" ", 20);
	 private static JTextArea outputs = new JTextArea();
	 private static JLabel resultsTime=new JLabel("Total Time Elapsed =");
	 private static JFrame frame;
	 
 
    public static int distance(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        int [] costs = new int [b.length() + 1];
        for (int j = 0; j < costs.length; j++)
            costs[j] = j;
        for (int i = 1; i <= a.length(); i++) {   
            costs[0] = i;
            int nw = i - 1;
            for (int j = 1; j <= b.length(); j++) {
                int cj = Math.min(1 + Math.min(costs[j], costs[j - 1]), a.charAt(i - 1) == b.charAt(j - 1) ? nw : nw + 1);
                nw = costs[j];
                costs[j] = cj;
            }
        }
        return costs[b.length()];
    }
 
    public static void main(String [] args) throws IOException {
    	outputs.append("Results");
    	JPanel panel1 = new JPanel();
    	panel1.add(inputTF);
    	panel1.add(search);
    	JPanel panel2 = new JPanel();
    	panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
    	panel2.add(panel1);
    	panel2.add(outputs);
    	panel2.add(resultsTime);
    	panel2.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
    	frame = new JFrame( "NLP Search");
    	frame.add(panel2);
    	frame.setSize(700, 300);
    	frame.setVisible(true);
      
    	 search.addActionListener(new ActionListener() {
 	  		
 	  		@Override
 	  		public void actionPerformed(ActionEvent arg0) {
 	  			try {
					operations();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
 	  			
 	  		}
 	  	});
        
    }
    public static void operations() throws IOException{
    	String input = inputTF.getText();
    	outputs.setText("");
    	
    	long start_time = System.nanoTime();
    	File file = new File("sozcuk_listesi.txt");
        BufferedReader br = new BufferedReader(new FileReader(file)); 
        ArrayList<WordData> wordList=new ArrayList<WordData>();//Creating arraylist
        String st; 
        while ((st = br.readLine()) != null) {
        	
        	WordData wordData = new WordData(st, distance(input,st));
        	wordList.add(wordData);
        }
        
        Collections.sort(wordList, (a, b) -> b.compare(a, b));
        
        long end_time = System.nanoTime(); 
		long running_time = end_time - start_time; // Geçen süre nanosaniye cinsinden elde edilir
		double seconds = (double)running_time/1000000000;
		//System.out.println("Total running time (s)="+seconds);
        outputs.append("Results  \n");
        for (int i = 0; i < 5; i++) {
			//System.out.println(wordList.get(i).word + " distance= "+ wordList.get(i).distance);
			outputs.append( wordList.get(i).word+ " distance= "+ wordList.get(i).distance +"\n");
		}
        resultsTime.setText("Total Time Elapsed = " + seconds + " s");
    }
}