public class employee 
{
    private String name;
    private int salary;


    public employee(String name, int salary)
    {
        this.name = name;
        this.salary = salary;
    }


    public void setName(String name) 
    {
        this.name = name;
    }

    public void setSalary(int salary) 
    {
        this.salary = salary;
    }


    public String getName() 
    {
        return name;
    }

    public int getSalary() 
    {
        return salary;
    }


    public void raiseSalary() 
    {
        this.salary *= 1.10;
    }



    public static void main(String[] args)
    {

        employee one = new employee("Vinay", 10000);
        employee two = new employee("Atharv", 20000);

        System.out.println("Before raise Salary:");

        System.out.println(one.getName() + " has salary " + one.getSalary());
        System.out.println(two.getName() + " has salary " + two.getSalary());

        one.raiseSalary();
        two.raiseSalary();
        
        System.out.println("After raise Salary:");

        System.out.println(one.getName() + " has salary " + one.getSalary());
        System.out.println(two.getName() + " has salary " + two.getSalary());
    }
}