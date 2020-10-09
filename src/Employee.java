abstract class Employee {
    protected String name;
    protected String department;
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    //Make a message that says hello
    // use Overriding to make a unique message for the Manager and Accountant.
    public abstract String sayHello();

    public abstract String doWork();

}

