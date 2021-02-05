import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataTextFile {

	public static void main(String[] args) throws IOException  {
		//FileReader
		
			FileReader fis=new FileReader("C:\\Users\\admin\\Desktop\\Anu\\ibm_2.txt");
			BufferedReader br=new BufferedReader(fis);
			String str;
			while((str=br.readLine())!=null) {
				System.out.println(str);
			
		}
		
			br.close();
	}

}
