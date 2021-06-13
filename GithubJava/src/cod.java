
import java.io.BufferedReader;
import java.io.FileReader;

//package clases;

public class cod {
    public String leerTxt (String direccion){
        String texto = "";
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp ="";
            String bfRead;
            while((bfRead= bf.readLine()) != null){
                temp = temp + bfRead+"\n";
               
            }
            bf.close();
            texto = temp;
        }catch(Exception e){ 
            System.err.println("No se encontró archivo");
        }
        return texto;
    }
}
