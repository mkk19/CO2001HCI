import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;


public class FileHandle {
	
	public static int i = 1;
	
	public static void main(String[] args){
       
		BufferedReader br = null;
		
		String line;
		String randomWord;
		FileReader fr;
		ArrayList<String> allWords = new ArrayList<String>();
		ArrayList<String> Words50 = new ArrayList<String>();
		Random random = new Random();

		try {
			br = new BufferedReader(fr = new FileReader("file" + i + ".txt"));
			
			while((line = br.readLine()) != null){
				allWords.add(line);
			}
			fr.close();
			
			Random r = new Random();
			for (int i=0; i <50; i++){
				int nextLine = r.nextInt(allWords.size());
				Words50.add(allWords.get(nextLine));
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
		for (int i = 1; i <5; i++){
			System.out.println(Words50);
		}

}
}
