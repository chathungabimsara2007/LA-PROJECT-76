package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerDAO {
    public ArrayList<CustomerDTO> getAllCustomers() throws SQLException, ClassNotFoundException;

    public boolean saveCustomers(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;

    public boolean updateCustomers(String id, String name, String address) throws SQLException, ClassNotFoundException;

    public boolean exitCustomers(String id) throws SQLException, ClassNotFoundException;

    public boolean deleteCustomers(String id) throws SQLException, ClassNotFoundException;

    public String generateNewID() throws SQLException, ClassNotFoundException;
}
