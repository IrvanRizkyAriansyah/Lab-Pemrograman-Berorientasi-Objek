/**
 * Person
 */
public class Person {

    private String name, birthdate, department, major;
    private int age, height, weight;
    private double time, distance;
    public static void main(String[] args) {
        Person test = new Person();
        test.setName("Irvan Rizky Ariansyah");
        String name = test.getName();
        System.out.println("Nama = "+name);
        test.setBirthdate("8 Maret 2002");
        String birthdate = test.getBirthdate();
        System.out.println("Tanggal lahir = "+birthdate);
        test.setDepartment("Institut Bisnis dan Infomatika Kesatuan");
        String department = test.getDepartment();
        System.out.println("Departemen = "+department);
        test.setMajor("Teknologi Informasi");
        String major = test.getMajor();
        System.out.println("Prodi = "+major);
        test.setAge(19);
        int age = test.getAge();
        System.out.println("Usia = "+age+" tahun");
        test.setHeight(165);
        int height = test.getHeight();
        System.out.println("Tinggi = "+height+" cm");
        test.setWeight(45);
        int weight = test.getWeight();
        System.out.println("Berat = "+weight+" kg");
        test.setDistance(14);
        double distance = test.getDistance();
        System.out.println("Jarak = "+distance+" km");
        test.setTime(+distance);
        double time = test.getTime();
        System.out.println("Waktu = "+time+" menit");
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getBirthdate() {
        return this.birthdate;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return this.major;
    }
    
    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getHeight(){
        return this.height;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public int getWeight(){
        return this.weight;
    }

    public void setDistance(double distance){
        this.distance = distance;
    }

    public double getDistance(){
        return this.distance;
    }

    public void setTime(double distance){
        int kecepatan = 80;
        this.time = distance/kecepatan;
    }

    public double getTime(){
        return this.time;
    }
}public class Person {
    
}
