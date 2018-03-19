class MVCDemo {
    public static void main(String[] args) {
        Employee e = new Employee();
        EmployeeView v = new EmployeeView();
        EmployeeController controller = new EmployeeController(e, v);
        controller.setEmployeeDetail("Roshan", "Rijasldsd", 1111111);
        v.showLoading();
        v.showEmployeeName(controller.getEmployeeName());
    }
}