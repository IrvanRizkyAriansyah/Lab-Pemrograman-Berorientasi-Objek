class Laptop2 { //main class
    public int Layar = 13;
    public int RAM = 16;
    public int ROM = 512;

    public void Processor() {
        System.out.println("Intel Core i5");
    }

    public int Layar(){
        return this.Layar;
    }

    public int RAM(){
        return this.RAM;
    }

    public int ROM(){
        return this.ROM;
    }
}

class Hp extends Laptop2{ //sub class
    public void tipeseries(){
        System.out.println("HP Pavilion 14");
    }

    public String OperatingSystem(String x){
        return x;
    }
}

class Dell extends Laptop2{ //sub class
    public void tipeseries(){
        System.out.println("DELL E4310");
    }

    public String OperatingSystem(String x){
        return x;
    }
}
/**
 * Laptop
 */
public class Laptop {
    public static void main(String[] args) {
        Laptop2 l = new Laptop2();
        System.out.println("Class Laptop - main class");
        System.out.print("Processor : ");
        l.Processor();
        int layar = l.Layar();
        int ram = l.RAM();
        int rom = l.ROM();
        System.out.println("Layar     : "+layar+" inch");
        System.out.println("RAM       : "+ram+"GB RAM");
        System.out.println("ROM       : "+rom+"GB SSD storage");

        Hp h = new Hp();
        System.out.println("===============================");
        System.out.println("Class Hp - sub class");
        h.tipeseries();
        System.out.print("Processor : ");
        h.Processor();
        layar = h.Layar();
        ram = h.RAM();
        rom = h.ROM();
        System.out.println("Layar     : "+layar+" inch");
        System.out.println("RAM       : "+ram+"GB RAM");
        System.out.println("ROM       : "+rom+"GB SSD storage");
        String operatingSystem = h.OperatingSystem("windows");
        System.out.println("OS        : "+operatingSystem);
        
        Dell d = new Dell();
        System.out.println("===============================");
        System.out.println("Class Dell - sub class");
        d.tipeseries();
        System.out.print("Processor : ");
        d.Processor();
        layar = d.Layar();
        ram = d.RAM();
        rom = d.ROM();
        System.out.println("Layar     : "+layar+" inch");
        System.out.println("RAM       : "+ram+"GB RAM");
        System.out.println("ROM       : "+rom+"GB SSD storage");
        operatingSystem= d.OperatingSystem("Linux");
        System.out.println("OS        : "+operatingSystem);

        System.out.println("===============================");
        System.out.println("Class Encapsulation");
        Encapsulation e = new Encapsulation();
        e.setTipeSeries("Macbook Pro");
        e.setProcessor("Intel Core i9");
        e.setLayar(16);
        e.setRAM(8);
        e.setROM(64);
        e.setOperatingSystem("macOS");

        System.out.println(e.getTipeSeries());
        System.out.println("Processor : "+e.getProcessor());
        System.out.println("Layar     : "+e.getLayar()+" inch");
        System.out.println("RAM       : "+e.getRAM()+"GB RAM");
        System.out.println("ROM       : "+e.getROM()+"GB SSD storage");
        System.out.println("OS        : "+e.getOperatingSystem());
    }
}

class Encapsulation {
    public String tipeseries, processor, operatingsystem;
    public int ram, rom, layar;

    public void setTipeSeries(String tipeseries){
        this.tipeseries = tipeseries;
    }    
    public String getTipeSeries(){
        return this.tipeseries;
    }

    public void setProcessor(String processor){
        this.processor = processor;
    }    
    public String getProcessor(){
        return this.processor;
    }

    public void setLayar(int layar){
        this.layar = layar;
    }    
    public int getLayar(){
        return this.layar;
    }

    public void setRAM(int ram){
        this.ram = ram;
    }    
    public int getRAM(){
        return this.ram;
    }

    public void setROM(int rom){
        this.rom = rom;
    }    
    public int getROM(){
        return this.rom;
    }

    public void setOperatingSystem(String operatingsystem){
        this.operatingsystem = operatingsystem;
    }    
    public String getOperatingSystem(){
        return this.operatingsystem;
    }
}
