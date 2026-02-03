package com.example.layeredarchitecture.bo.custom;

import com.example.layeredarchitecture.model.CustomerDTO;
import com.example.layeredarchitecture.model.ItemDTO;
import com.example.layeredarchitecture.model.OrderDTO;
import com.example.layeredarchitecture.model.OrderDetailDTO;
import java.sql.SQLException;
import java.util.ArrayList;

public interface PlaceOrderBO {
    public String generateNewOrderID() throws SQLException, ClassNotFoundException;
    public boolean existOrder(String orderId) throws SQLException, ClassNotFoundException;
    public boolean saveOrder(OrderDTO orderDTO) throws SQLException, ClassNotFoundException;
    public boolean saveOrderDetails(OrderDetailDTO orderDetailDTO) throws SQLException, ClassNotFoundException;
    public CustomerDTO searchCustomers(String id) throws SQLException, ClassNotFoundException;
    public ItemDTO searchItems(String code) throws SQLException, ClassNotFoundException;
    public boolean existCustomers(String id) throws SQLException, ClassNotFoundException;
    public boolean existItems(String code) throws SQLException, ClassNotFoundException;
    public ArrayList<CustomerDTO> getAllCustomers() throws SQLException, ClassNotFoundException;
    public ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException;
    public boolean updateItems(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;
}
