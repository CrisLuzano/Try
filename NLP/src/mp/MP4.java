package mp;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MP4 {

	public static void main(String[] args) throws IOException{
		
		FileReader fr = new FileReader("C:\\Users\\DionDion\\workspace\\NLP\\src\\mp\\word.txt");
		FileReader input= new FileReader("C:\\Users\\DionDion\\workspace\\NLP\\src\\mp\\input.txt");

		Scanner scan= new Scanner(fr);
		Scanner inputScanner= new Scanner(input);

		boolean inserted= false;

		String x= inputScanner.nextLine().toLowerCase();

		while(scan.hasNextLine())
		{
			String string = scan.nextLine();
			String [] words= string.split(" ");
			for(int a =0; a < words.length; a++)
			{
				if(x.contains(words[a]))
				{
					System.out.println("The word is " + words[a]);
					System.out.println("The Morphemes are " + words[a+1]);
					System.out.println("The rootword is "+ words[a+2] );
					inserted = true;
					break;
				}
			}
		}
		if(inserted == false)
		{
			System.out.println("The word '" + x + "' is not in the dictionary");
		}

	}

}
