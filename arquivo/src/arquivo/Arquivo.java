package arquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

	public class Arquivo {
	    public static void main(String[] args) {
	        try {
	            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Manhã\\Desktop\\result.txt" , Charset.forName("UTF8")));
	            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Manhã\\Desktop\\result1.txt" , Charset.forName("UTF8")));
	            String line;
	            StringBuilder content = new StringBuilder();
	            while ((line = reader.readLine()) != null) {
	                line = line.trim();
	                if (!line.matches("\\d+")) {
	                    content.append(line).append("\n");
	                }
	            }
	            reader.close();
	            content = new StringBuilder(content.toString().replace(".", ".\n"));
	            content = new StringBuilder(content.toString().replace("\n\n", "\n"));
	            content = new StringBuilder(content.toString().replace("\t", ""));
	            writer.write(content.toString());
	            writer.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}

	
	
