package trabalho3;

import java.io.*;

public class NeaderBinaryCommandReader {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			byte b = 0;
			int a = 0;
			
			try {
			      
				InputStream input = null;
			      
			       input = new BufferedInputStream(new FileInputStream("D:\\/fontes/fontes/teste1bin.mem"));
			       DataInputStream dt = new DataInputStream(input);
			       byte data;
			       while ((data = dt.readByte()) != -1){
			    	   if(data >= 4){
			    		   System.out.println(Integer.toHexString((byte)data));
			    	   }
			    	   
			    	   
			       }			         
			     
			        input.close();
			      
			    }
			
				catch(IOException e){
			    
			    	System.out.println("Error" + e);

			    }

		}
	
}
