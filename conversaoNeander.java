package trabalho3;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class conversaoNeander {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  
		        int memdados = Integer.parseInt(JOptionPane.showInputDialog("Informe onde comeca os dados: "));
		        ArrayList<String> vaux = new ArrayList<String>();
		        arquivo arq = new arquivo();
		        arq.ler();
		        //removendo os 4 primeiros bytes ou 0 0 0 0
		        conversao trd = new conversao();
		        //mandando o arraylist gerado na leitura pra ser tradado em negocio
		        vaux = trd.TrataArrayList(arq.v, memdados);
		        
		        arq.escrever(vaux);
		        
		        //for(int i=0; i<vaux.size(); i++){
		        //    System.out.println(vaux.get(i));
		        //}	
		
	}
}