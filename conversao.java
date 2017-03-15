package trabalho3;

import java.util.ArrayList;

public class conversao {

	
	 private boolean ehMnemonico = true;
	   private int linha=0;
	   
	    public ArrayList<String> TrataArrayList(ArrayList<String> v, int memdados){
	        ArrayList<String> vaux = new ArrayList<String>();
	        v.remove(3);
	        v.remove(2);
	        v.remove(1);
	        v.remove(0);
	        String str;
	        String strlinha = "";
	        for(int i=0; i<v.size(); i=i+2){
	            if(v.get(i).length() > 1)
	                str = "" + v.get(i).charAt(v.get(i).length()-2) + v.get(i).charAt(v.get(i).length()-1);
	            else
	                str = v.get(i);
	            
	            if(i<memdados*2){
	                if(ehMnemonico){
	                    strlinha = Integer.toHexString(linha)+"  "+buscaMnemonico(str);
	                }else{
	                    strlinha += "  "+ str;
	                    ehMnemonico = true;
	                }
	                if(ehMnemonico)
	                    vaux.add(strlinha+"\n");
	                    //System.out.println(strlinha);
	            }else{
	                //System.out.println(Integer.toHexString(linha)+"  "+str);
	                vaux.add(Integer.toHexString(linha)+"  "+str+"\n");
	                linha++;
	            }
	        }
	        //// temos os codigos, agora temos que tratar as linhas com os mnemonicos
	        //preparar a string que vai ser cada linha do arraylist que vai ser escrito no arquivo
	        
	        return vaux;
	    }
	    
	    public String buscaMnemonico(String strcod){
	        if(strcod.equals("0")){
	            ehMnemonico = true;
	            linha++;
	            return "NOP";
	        }else if(strcod.equals("10")){
	            ehMnemonico = false;
	            linha = linha + 2;
	            return "STA";
	        }else if(strcod.equals("20")){
	            ehMnemonico = false;
	            linha = linha + 2;
	            return "LDA";
	        }else if(strcod.equals("30")){
	            ehMnemonico = false;
	            linha = linha + 2;
	            return "ADD";
	        }else if(strcod.equals("40")){
	            ehMnemonico = false;
	            linha = linha + 2;
	            return "OR";
	        }else if(strcod.equals("50")){
	            ehMnemonico = false;
	            linha = linha + 2;
	            return "AND";
	        }else if(strcod.equals("60")){
	            ehMnemonico = true;
	            linha++;
	            return "NOT";
	        }else if(strcod.equals("80")){
	            ehMnemonico = false;
	            linha = linha + 2;
	            return "JMP";
	        }else if(strcod.equals("90")){
	            ehMnemonico = false;
	            linha = linha + 2;
	            return "JN";
	        }else if(strcod.equals("A0") || strcod.equals("a0")){
	            ehMnemonico = false;
	            linha = linha + 2;
	            return "JZ";
	        }else if(strcod.equals("F0") || strcod.equals("f0")){
	            ehMnemonico = true;
	            linha++;
	            return "HLT";
	        }else
	            return strcod;
	    }
}
