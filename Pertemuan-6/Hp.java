public class Hp extends Laptop{
    public String tipeseries, processor, operatingsystem; 
    public int ram, rom, layar; 
     
    public void setTipeSeries(String tipeseries){ 
        this.tipeseries = tipeseries; } 
        
    public String getTipeSeries(){ 
        return this.tipeseries; } 
        
    public void setProcessor(String processor){ 
        this.processor = processor; } 
    
    public String getProcessor(){ 
        return this.processor; } 
    
    public void setLayar(int layar){ 
        this.layar = layar; } 
        
    public int getLayar(){
        return this.layar; } 
        
    public void setRAM(int ram){ 
        this.ram = ram; } 
        
    public int getRAM(){ 
        return this.ram; } 
        
    public void setROM(int rom){ 
        this.rom = rom; } 
        
    public int getROM(){ 
        return this.rom; } 
        
    public void setOperatingSystem(String operatingsystem){ 
        this.operatingsystem = operatingsystem; } 
    public String getOperatingSystem(){ return this.operatingsystem; } 
}
