/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

public class EmployeeDirectory {
    private ArrayList<Employee> employeelist;
    
    public EmployeeDirectory()
    {
        employeelist=new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeelist() {
        return employeelist;
    }

    public void setEmployeelist(ArrayList<Employee> employeelist) {
        this.employeelist = employeelist;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setEmployeeName(name);
        employeelist.add(employee);
        return employee;
    }
    
    public void deleteEmployee(Employee e)
    {
        employeelist.remove(e);
    } 
    
    public Employee searchEmployee(int id)
    {
        for(Employee e:employeelist)
        {
            if(e.getEmployeeId()==id)
                return e;
        }
        return null;
    }

    public Employee checkIfnameIsUnique(String username){
        for (Employee e : employeelist){
            if (e.getEmployeeName().equals(username))
                return e;
        }
        return null;
    }
}
