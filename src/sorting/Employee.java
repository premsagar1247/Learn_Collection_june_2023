package sorting;

public class Employee {
    private String name;
    private String add;
    private String EmpId;

    // make private constructor

    public Employee(String name, String add, String empId) {
        this.name = name;
        this.add = add;
        EmpId = empId;
    }
    //making gette and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getEmpId() {
        return EmpId;
    }

    public void setEmpId(String empId) {
        EmpId = empId;
    }
    // get ToString method

}
