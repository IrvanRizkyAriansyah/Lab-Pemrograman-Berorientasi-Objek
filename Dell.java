public class Dell extends Laptop{
    public String tipeseries, operatingsystem; 
    public Double price;
     
    public void setTipeSeries(String tipeseries){ 
        this.tipeseries = tipeseries; } 
        
    public String getTipeSeries(){ 
        return this.tipeseries; } 
        
    public void setOperatingSystem(String operatingsystem){ 
        this.operatingsystem = operatingsystem; } 
    public String getOperatingSystem(){ return this.operatingsystem; } 

    public void setPrice(Double price){
        this.price = price;
    }
    public Double getPrice(){
        return this.price;
    }
}
