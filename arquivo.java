package trabalho3;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class arquivo {

	  	private String filenameR = "C:/Users/cleberMelo/Downloads/fontes/fontes";
	    private String filenameS = "D:/mem/trabalho_neander3_tradado.txt";
	    FileWriter fw;
	    
	    
	    public ArrayList<String> v = new ArrayList<String>();
	    
	    public void ler(){
	        byte b=0;
	        int a=0;

	        try {
	            InputStream input = null;

	            input = new BufferedInputStream(new FileInputStream(filenameR));
	            DataInputStream dt = new DataInputStream(input);
	            byte data;
	            while ((data = dt.readByte()) != -1){
	                //System.out.println(Integer.toHexString(data));
	                v.add(Integer.toHexString(data));
	            }
	            input.close();
	        }catch(FileNotFoundException e) {
	            System.out.println("Error" + e);
	        }catch(IOException e){
	            //System.out.println("Error" + e);
	            //como capturar apenas o EOFException? (end of file - final de arquivo)
	            //o io extende ele... mas tem como tratar sozinho?
	        }
	    }    
	    public void escrever(ArrayList<String> v){
	        try{
	            fw = new FileWriter(filenameS,false);
	            BufferedWriter arq = new BufferedWriter(fw);
	            for (int i=0; i<v.size(); i++){
	                arq.write(v.get(i));
	            }
	            arq.close();
	        }catch(IOException e){
	            System.out.println("I/O Error!!");
	        }
	    }
}
