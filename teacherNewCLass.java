// Fields    
    String name;
    int age;
    double salary;
    String subject;
    String phone;


// Constructor
    public Teacher(String name, int age, double salary, String subject , String phone ) {
        this.name =name;
                this.age =age;
                        this.salary =salary;
                        this.subject =subject;
                        this.phone = phone;
    }
    
    
    // Method (print)
    public void display(int index){
        
        System.out.printf("No. %-3d | Name: %-15s | Age: %-4d | Salary: %-8.1f | Subject: %-12s Phone: %-12s %n" , index , name , age , salary , subject , phone);
}
        
        
