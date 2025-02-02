package com.fiap.ms_order.repository;

import com.fiap.ms_order.dto.CustomerDto;
import com.fiap.ms_order.dto.OrderDto;
import com.fiap.ms_order.dto.ProductDto;
import oracle.jdbc.pool.OracleDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderRepository {
    OracleDataSource dataSource;
    {
        try {
            dataSource = new OracleDataSource();
            dataSource.setURL("jdbc:oracle:thin:@localhost:1521/dborder");
            dataSource.setUser("order_owner");
            dataSource.setPassword("order_owner");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<OrderDto> getAllOrders(){

        List<OrderDto> orders = new ArrayList<>();
        String sql = "select * from orders";

        try {
            Connection conn = dataSource.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                OrderDto order = new OrderDto();
                CustomerDto customer = new CustomerDto();
                ProductDto product = new ProductDto();
                List<ProductDto> listProducts = new ArrayList<>();
                customer.setCustomerDocument("customer_document");
                customer.setCustomerId(rs.getInt("customer_id"));
                customer.setCustomerEmail(rs.getString("customer_email"));
                customer.setCustomerName(rs.getString("customer_name"));

                product.setProductId(rs.getInt("product_id"));
                product.setProductName(rs.getString("product_name"));
                product.setProductDescription(rs.getString("product_description"));
                product.setProductCategory(rs.getString("product_category"));
                product.setProductPrice(rs.getInt("product_price"));
                product.setProductQuantity(rs.getInt("product_quantity"));

                listProducts.add(product);

                order.setOrderId(rs.getInt("order_id"));
                order.setOrderTotal(rs.getInt("order_total"));
                order.setOrderStatus(rs.getString("order_status"));
                order.setCustomer(customer);
                order.setProducts(listProducts);
                orders.add(order);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return orders;
    }

    public boolean getProductById(int productId){
        String sql = "select * from products where productId = ?";

        boolean response =  false;

        return response;
    }

    public boolean getCustomerById(int customerId){
        String sql = "select * from customers";

        boolean response =  false;

        return response;
    }

    public boolean insertOrder(OrderDto order){
        String sql = "insert into orders values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        int response = 0;

        return response == 0 ? true : false;
    }

    public boolean updateCustomer(OrderDto order){
        String sql = "update customers set customerName = ? where customerId = ?";

        int response = 0;

        return response == 0 ? true : false;
    }
}
