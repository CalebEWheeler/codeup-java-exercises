public class Business {
    public static void main(String[] args) {
        Employee[] employees = {
                new Accountant("Bill", "Accounting"),
                new Manager("Tom", "Manager")
        };
        //get the message for sayHello() & doWork() to display
        for (Employee e : employees) {
            System.out.println(e.sayHello());
            System.out.println(e.doWork());
        }
    }
}