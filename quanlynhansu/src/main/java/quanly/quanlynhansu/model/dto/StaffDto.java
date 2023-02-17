package quanly.quanlynhansu.model.dto;

public class StaffDto {
    private String id;
    private String name;
    private String address;
    private String phone;
    private String position;
    private String StartDate;
    private double salary;
    private boolean status;
    private int level;

    public StaffDto(String id, String name, String address, String phone, String position, String startDate, double salary, boolean status, int level) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.position = position;
        this.StartDate = startDate;
        this.salary = salary;
        this.status = status;
        this.level = level;
    }
public StaffDto(String id,String name,String address,Double salary,String startDate,String position){
        this.id=id;
        this.name=name;
        this.address=address;
        this.salary=salary;
        this.StartDate=startDate;
        this.position=position;
}
    public StaffDto(String name, String address, String phone, String position, String startDate, double salary, boolean status, int level) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.position = position;
        this.StartDate = startDate;
        this.salary = salary;
        this.status = status;
        this.level = level;
    }

    public StaffDto() {
    }

    public StaffDto(String id, String name, String address, String phone, String position, String startDate, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.position = position;
        this.StartDate = startDate;
        this.salary = salary;
    }

    public StaffDto(String id, String name, String address, String phone, double salary, int level, String position) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.salary = salary;
        this.level = level;
        this.position = position;

    }

    public StaffDto(String name, String address, String phone, double salary, Boolean status, int level) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.salary = salary;
        this.status = status;
        this.level = level;
    }
    public StaffDto(String id,String name,double salary , String startDate,String position){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.StartDate=startDate;
        this.position=position;
    }

    public boolean isStatus() {
        return status;
    }
    public StaffDto(String id, String name, String address,double salary, String Stardate,String position ) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary=salary;
        this.StartDate=Stardate;
        this.position=position;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
