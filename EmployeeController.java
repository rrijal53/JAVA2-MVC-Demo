class EmployeeController{
   Employee mModel;
   EmployeeView mView;

     public EmployeeController(Employee mModel, EmployeeView mView) {
           this.mModel = mModel;
           this.mView = mView;
       }


    public void getEmployeeName(){
          
           mView.showLoading();
           mView.showEmployeeName( mModel.getName());
    }

   public void setEmployeeDetail(String name, String address, int salary){

        mModel.setName(name);
        mModel.setAddress(address);
        mModel.setSalary(salary);
   }
}