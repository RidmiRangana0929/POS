package dao;

import model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CrudDAO {
    ArrayList<CustomerDTO> getAll() throws SQLException, ClassNotFoundException;

    boolean save(CustomerDTO dto) throws SQLException, ClassNotFoundException;

    boolean update(CustomerDTO dto) throws SQLException, ClassNotFoundException;

    boolean exist(String id) throws SQLException, ClassNotFoundException;

    boolean delete(String id) throws SQLException, ClassNotFoundException;

    String generateNewID() throws SQLException, ClassNotFoundException;
}