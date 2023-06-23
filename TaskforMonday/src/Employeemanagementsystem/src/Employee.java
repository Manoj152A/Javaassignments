class Employee {
    private String name;
    private String employeeId;

    public Employee(String name, String employeeId, String mailid) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nEmployee ID: " + employeeId + "\n";
    }
}
