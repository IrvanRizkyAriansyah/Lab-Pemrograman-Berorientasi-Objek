import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
@Deprecated

public class Main {
   public static void main(String[] args) {
       File file = new File("D:/Kampus/Semester 3/Pemrograman Berorientasi Objek/Pemrograman-Berorientasi-Objek/Pertemuan-6/DaftarHP.txt");
       FileInputStream fis = null;
       BufferedInputStream bis = null;
       DataInputStream dis = null;
       List<Hp> listHp = new ArrayList<Hp>();
            
       try {
           fis = new FileInputStream(file);
           bis = new BufferedInputStream(fis);
           dis = new DataInputStream(bis);
           
           while(dis.available() != 0) {
               String line = dis.readLine();
               String[] data = line.split(",");                           
               
               Hp h = new Hp();
               h.setTipeSeries(data[0]);
               h.setProcessor(data[1]);
               int layar= Integer.parseInt(data[2]); 
               h.setLayar(layar);
               int RAM= Integer.parseInt(data[3]); 
               h.setRAM(RAM);
               int ROM= Integer.parseInt(data[4]); 
               h.setROM(ROM);
               h.setOperatingSystem(data[5]);
                
               listHp.add(h);    
            }
       } catch (Exception e) { //menampilkan business logic tidak dapat dikerjakan
           System.out.println("File "+file.getName()+" tidak ditemukan");
           System.out.println("Error "+e.getMessage());
       }
       
       Laptop l = new Laptop();
           l.setMerk("HP");
           System.out.println("       Katalog Laptop "+l.getMerk());

       for(Hp h : listHp) {
           System.out.println("===============================");
           System.out.println("Tipe Series : "+h.getTipeSeries());
           System.out.println("Processor   : "+h.getProcessor());
           System.out.println("Layar       : "+h.getLayar());
           System.out.println("RAM         : "+h.getRAM());
           System.out.println("ROM         : "+h.getROM());
           System.out.println("OS          : "+h.getOperatingSystem());
       }


       File file2 = new File("D:/Kampus/Semester 3/Pemrograman Berorientasi Objek/Pemrograman-Berorientasi-Objek/Pertemuan-6/DaftarDELL.txt");
       FileInputStream fis2 = null;
       BufferedInputStream bis2 = null;
       DataInputStream dis2 = null;
       List<Dell> listDell = new ArrayList<Dell>();
          
       try {//Memproses busines logic
           fis2 = new FileInputStream(file2);
           bis2 = new BufferedInputStream(fis2);
           dis2 = new DataInputStream(bis2);
           
           while(dis2.available() != 0) {
               String line = dis2.readLine();
               String[] data = line.split(",");
               
               Dell d = new Dell();
               d.setTipeSeries(data[0]);
               d.setProcessor(data[1]);
               int layar= Integer.parseInt(data[2]); 
               d.setLayar(layar);
               int RAM= Integer.parseInt(data[3]); 
               d.setRAM(RAM);
               int ROM= Integer.parseInt(data[4]); 
               d.setROM(ROM);
               d.setOperatingSystem(data[5]);
               
               listDell.add(d);    
             
           }
       } catch (Exception e2) { //menampilkan business logic tidak dapat dikerjakan
           System.out.println("File "+file2.getName()+" tidak ditemukan");
           System.out.println("Error "+e2.getMessage());
       }
       
       System.out.println("\n");
           l.setMerk("DELL");
           System.out.println("      Katalog Laptop "+l.getMerk());

       for(Dell d : listDell) {
           System.out.println("===============================");
           System.out.println("Tipe Series : "+d.getTipeSeries());
           System.out.println("Processor   : "+d.getProcessor());
           System.out.println("Layar       : "+d.getLayar());
           System.out.println("RAM         : "+d.getRAM());
           System.out.println("ROM         : "+d.getROM());
           System.out.println("OS          : "+d.getOperatingSystem());
       }
   }
  
}
