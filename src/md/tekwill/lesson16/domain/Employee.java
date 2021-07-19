package md.tekwill.lesson16.domain;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import md.tekwill.lesson16.service.impl.EmployeeServiceImpl;

public class Employee {
    private long id;
    private String firstName;
    private String lastName;
    private Department department;
    private static long idCount;
    //    private JPanel Employee;
    public JPanel panel1;
    private JTextField idText;
    private JTextField firstNameText;
    private JTextField lastNameText;
    private JComboBox departmentBox;
    private JButton createButton;

    public Employee(String firstName, String lastName, Department department) {
        id = ++idCount;

        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }

    public Employee() {

        //id = ++idCount;
        //idText.setText(""+id);
        addToJComboBox();
        createButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
                Department itDepartment = new Department(departmentBox.getSelectedItem().toString());
                Employee employee1 = employeeService.create(new Employee(firstNameText.getText(), lastNameText.getText(), itDepartment));
                Employee savedEmployee = employeeService.create(employee1);

                idText.setText("" + savedEmployee.id);

                System.out.println(employeeService.read(savedEmployee.getId()));
                JOptionPane.showMessageDialog(null, "Object created succesufully!");

            }
        });
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department=" + department +
                '}';
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public void addToJComboBox() {
        departmentBox.addItem(("IT"));
        departmentBox.addItem(("HR"));
    }
}
