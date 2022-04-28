package customer.controller;


import customer.entity.Customer;
import customer.model.CustomerDaolmpl;

import java.sql.SQLException;
import java.util.ArrayList;

    public class ControllerCustomer {
        CustomerDaolmpl customerDaoImpl = new CustomerDaolmpl();

        public void addNewCustomer(Customer customer) throws SQLException, ClassNotFoundException {
            customerDaoImpl.addNewCustomer(customer);
        }

        public ArrayList<Customer> findCustomerByName(String name) throws ClassNotFoundException, SQLException {
            return customerDaoImpl.findCustomerByName(name);
        }

        public ArrayList<Customer> showAllCustomers() throws ClassNotFoundException, SQLException {
            return customerDaoImpl.showAllCustomers();
        }
    }

