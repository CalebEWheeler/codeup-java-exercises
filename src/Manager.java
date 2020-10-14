class Manager extends Employee {
    public Manager(String name, String department) {
        super(name, department);
    }

    public String sayHello() {
        return "Hello my name is " + this.name + ", I am a " + this.department + ".";
    }

    @Override
    public String doWork() {
        return "holding meetings";
    }

}
