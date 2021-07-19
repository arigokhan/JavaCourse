package md.tekwill.lesson16.domain;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.*;
import java.util.Vector;

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
    private JTable table1;
    private JScrollPane JScrollPanel;


    EmployeeServiceImpl employeeService = new EmployeeServiceImpl();

    public Employee(String firstName, String lastName, Department department) {
        id = ++idCount;

        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }

    public Employee() {

        //id = ++idCount;
        //idText.setText(""+id);
        createUIComponents();
        selectEmployees();
        createButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                Department itDepartment = new Department(departmentBox.getSelectedItem().toString());
                Employee employee1 = employeeService.create(new Employee(firstNameText.getText(), lastNameText.getText(), itDepartment));
                Employee savedEmployee = employeeService.create(employee1);

                idText.setText("" + savedEmployee.id);

                System.out.println(employeeService.read(savedEmployee.getId()));
                selectEmployees();
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
        table1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "ID", "First Name", "Last Name", "Department"
                }
        ));

        JScrollPanel.setViewportView(table1);


        addToJComboBox();
    }

    public void addToJComboBox() {
        departmentBox.addItem(("IT"));
        departmentBox.addItem(("HR"));
    }

    public void selectEmployees() {
        Employee[] listOfEmployees = employeeService.getEmployees();

        for (Employee employee : listOfEmployees) {
            if (employee != null) {
                Vector v = new Vector();
                v.add(employee.id);
                v.add(employee.firstName);
                v.add(employee.lastName);
                v.add(employee.department.getName());
                DefaultTableModel dt = (DefaultTableModel) table1.getModel();
                dt.addRow(v);
            }

        }

    }

}
















