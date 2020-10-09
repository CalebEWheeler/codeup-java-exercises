class Accountant extends Employee {
    public Accountant(String name, String department) {
        super(name, department);
    }

    public String sayHello() {
        return "Hello my name is " + this.name + ", I work in " + this.department + ".";
    }

    public String doWork() {
        return "crunching numbers";
    }

}
