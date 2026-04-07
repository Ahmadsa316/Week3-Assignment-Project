package org.example.week3_assignment.db;

import org.example.week3_assignment.model.CartItem;
import org.example.week3_assignment.model.CartRecord;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class CartService {

    public void saveCart(CartRecord cart) {

        String insertCart = "INSERT INTO cart_records (total_items, total_cost, language) VALUES (?, ?, ?)";
        String insertItem = "INSERT INTO cart_items (cart_record_id, item_number, price, quantity, subtotal) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection()) {

            // Insert cart
            PreparedStatement cartStmt = conn.prepareStatement(insertCart, Statement.RETURN_GENERATED_KEYS);
            cartStmt.setInt(1, cart.getTotalItems());
            cartStmt.setDouble(2, cart.getTotalCost());
            cartStmt.setString(3, cart.getLanguage());

            cartStmt.executeUpdate();

            var rs = cartStmt.getGeneratedKeys();
            int cartId = 0;

            if (rs.next()) {
                cartId = rs.getInt(1);
            }

            // Insert items
            for (CartItem item : cart.getItems()) {
                PreparedStatement itemStmt = conn.prepareStatement(insertItem);

                itemStmt.setInt(1, cartId);
                itemStmt.setInt(2, item.getItemNumber());
                itemStmt.setDouble(3, item.getPrice());
                itemStmt.setInt(4, item.getQuantity());
                itemStmt.setDouble(5, item.getSubtotal());

                itemStmt.executeUpdate();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}