package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.model.ItemDTO;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemDAO {
    public void saveItem(String code, String description, BigDecimal unitPrice, int qtyOnHand) throws SQLException, ClassNotFoundException;

    public ArrayList<ItemDTO> getAllItems() throws SQLException , ClassNotFoundException;

    public boolean updateItem( String description,BigDecimal unitPrice , int qtyOnHand ,String code) throws SQLException, ClassNotFoundException;

    public boolean existItem(String code) throws SQLException, ClassNotFoundException;

    public void deleteItem(String code) throws SQLException, ClassNotFoundException ;

    public ItemDTO searchItem(String code) throws SQLException, ClassNotFoundException;

    public String generateNewID() throws SQLException, ClassNotFoundException ;
}
