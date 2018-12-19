import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class odev {
    public static void main(String[] args) throws IOException{        
        boolean sonuc=false;
        Scanner input = new Scanner(System.in);
                        String d_adi_yolu2;
			String d_adi_yolu1;
        while(sonuc==false){
            
        System.out.print("Girdi dosyasi giriniz: ");
        d_adi_yolu1 = input.next();
        
        System.out.print("Cikti  dosyasi giriniz: ");
        d_adi_yolu2 = input.next();
        
        File file1 = new File(d_adi_yolu1);
        File file2 = new File(d_adi_yolu2);
        
        if(!file1.exists()){
            System.out.println("Dosya bulunamadi.");
            sonuc=false;
        }else if(!file2.exists()){
            System.out.println("Dosya bulunamadi.");
            sonuc=false;
        }else{
            Scanner tara=new Scanner(file1);
            FileWriter file2_1=new FileWriter(d_adi_yolu2);
            String dosyaicerigi="";
            while(tara.hasNextLine()){               
                dosyaicerigi+=tara.nextLine();
            }        
            file2_1.write(dosyaicerigi);
            System.out.println("Basarili");
            sonuc=true;
            file2_1.close();
        }}}}
