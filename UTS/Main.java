import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private String[] MenuList = {"Menginput Product","Melihat Product"};
    private String[] MyProduct = {"Hp","Dell"};
    private List<Hp> listHp  = new ArrayList<Hp>();
    private List<Dell> listDell = new ArrayList<Dell>();
    

    public static void main(String[] args) {
        Main m = new Main();
        m.InputMenu();        
    }


    public void InputMenu() {
        Scanner myObj = new Scanner(System.in);
        int menu;
        
        System.out.println("\n\n--PROGRAM PENJUALAN LAPTOP TOKO KITA--");
        System.out.println("\nPilih menu:");
        int i=1;
        for (String mu : this.MenuList) {
            System.out.println(i+". "+mu);
            i++;
        }
        System.out.print("\nMasukan pilihan menu : ");
        String inputMenu = myObj.nextLine();
        menu = Integer.parseInt(inputMenu);

        switch (menu) {
            case 1:
                this.InputMenuProduct();
                break;
            case 2:
                this.ShowMenuProduct();
                break;
        
            default:
            System.out.println("Pilihan tidak terdaftar");
                break;
        }
        myObj.close();
    }

    public void InputMenuProduct(){
        System.out.println("\n---------------------------");
        System.out.println("       Input Product         ");
        System.out.println("---------------------------\n");
        System.out.println("Pilih Produk : ");
        int i=1;
        for (String p : MyProduct) {
            System.out.println(i+". "+p);
            i++;
        }
        System.out.print("\nMasukan pilihan : ");
        Scanner myObj = new Scanner(System.in);
        int product;
        String inputProduct = myObj.nextLine();
        product = Integer.parseInt(inputProduct);
        switch (product) {
            case 1:                
                try {
                    listHp = this.InputHp();         
                    this.InputMenu();               
                } catch (Exception e) {
                    System.out.println("Failed error input produk Hp");
                    System.out.println("Error: "+e.getMessage());
                }    
            
                break;
            case 2:
                try { 
                    listDell = this.InputDell();  
                    this.InputMenu();              
                } catch (Exception e) {
                    System.out.println("Failed error input produk Dell");
                    System.out.println("Error: "+e.getMessage());
                }   
                break;
        
            default:
                break;
        }
        myObj.close();
    }


    public List InputHp() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("\n===Input Hp===");
        System.out.print("Masukan jumlah data yang dimasukan : ");
        int jmlData;
        String inputjmlData = myObj.nextLine();
        jmlData = Integer.parseInt(inputjmlData);
        for (int i = 0; i < jmlData; i++) {
            Hp h = new Hp();
            System.out.println("#data ke-"+(i+1)+":");
            System.out.print("Tipe Series = ");
            String tipeseries = myObj.nextLine();            
            h.setTipeSeries(tipeseries);
            
            System.out.print("Processor   = ");
            String processor = myObj.nextLine();            
            h.setProcessor(processor);

            System.out.print("Layar       = ");
            int layar = Integer.parseInt(myObj.nextLine());            
            h.setLayar(layar);

            System.out.print("RAM         = ");
            int ram = Integer.parseInt(myObj.nextLine());            
            h.setRAM(ram);
            
            System.out.print("ROM         = ");
            int rom = Integer.parseInt(myObj.nextLine());            
            h.setROM(rom);

            System.out.print("OS          = ");
            String operatingsystem = myObj.nextLine();            
            h.setOperatingSystem(operatingsystem);

            System.out.print("Harga       = Rp.");
            Double prices = Double.parseDouble(myObj.nextLine());            
            h.setPrice(prices);

            System.out.println("---------------------------");
            this.listHp.add(h);
        }
        System.out.println("\n");
        //myObj.close();
        return this.listHp;      
    }

    public List InputDell() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("\n===Input Dell===");
        System.out.print("Masukan jumlah data yang dimasukan : ");
        int jmlData;
        String inputjmlData = myObj.nextLine();
        jmlData = Integer.parseInt(inputjmlData);
        for (int i = 0; i < jmlData; i++) {
            Dell d = new Dell();
            System.out.println("#data ke-"+(i+1)+":");
            System.out.print("Tipe Series = ");
            String tipeseries = myObj.nextLine();            
            d.setTipeSeries(tipeseries);
            
            System.out.print("Processor   = ");
            String processor = myObj.nextLine();            
            d.setProcessor(processor);

            System.out.print("Layar       = ");
            int layar = Integer.parseInt(myObj.nextLine());            
            d.setLayar(layar);

            System.out.print("RAM         = ");
            int ram = Integer.parseInt(myObj.nextLine());            
            d.setRAM(ram);
            
            System.out.print("ROM         = ");
            int rom = Integer.parseInt(myObj.nextLine());            
            d.setROM(rom);

            System.out.print("OS          = ");
            String operatingsystem = myObj.nextLine();            
            d.setOperatingSystem(operatingsystem);

            System.out.print("Harga       = Rp.");
            Double price = Double.parseDouble(myObj.nextLine());            
            d.setPrice(price);

            System.out.println("---------------------------");
            this.listDell.add(d);
        }
        System.out.println("\n");
        //myObj.close();
        return this.listDell;       
    }

    public void ShowMenuProduct(){
        for (Hp h : this.listHp) {
            System.out.println("Tipe Series = "+ h.getTipeSeries() );
            System.out.println("Processor   = "+ h.getProcessor() );
            System.out.println("Layar       = "+ h.getLayar() );
            System.out.println("RAM         = "+ h.getRAM() );
            System.out.println("ROM         = "+ h.getROM() );
            System.out.println("OS          = "+ h.getROM() );
            System.out.println("Harga       = Rp."+ h.getPrice() );
            System.out.println("===========================");
        }
        
        for (Dell d : this.listDell) {
            System.out.println("Tipe Series = "+ d.getTipeSeries() );
            System.out.println("Processor   = "+ d.getProcessor() );
            System.out.println("Layar       = "+ d.getLayar() );
            System.out.println("RAM         = "+ d.getRAM() );
            System.out.println("ROM         = "+ d.getROM() );
            System.out.println("OS          = "+ d.getROM() );
            System.out.println("Harga       = Rp."+ d.getPrice() );
            System.out.println("===========================");
        }

        Scanner myObj = new Scanner(System.in);
        System.out.print("\nUlangi lagi [Y/N] ? ");
        Character loop;
        loop = myObj.nextLine().charAt(0);

        if (loop == 'Y') {
            this.InputMenu();                        
        } else 
        if (loop == 'N'){
            System.out.println("Terima Kasih Sudah Berkunjung :)");
        }
        else {
            System.out.println("\nError code yang diinputkan salah");
            System.out.println("pastikan code menggunakan huruf kapital\n");
            this.ShowMenuProduct();
        }
        //myObj.close();
    }   
}