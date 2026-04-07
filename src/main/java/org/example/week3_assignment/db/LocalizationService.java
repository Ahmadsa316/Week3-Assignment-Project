package org.example.week3_assignment.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

public class LocalizationService {

    public Map<String, String> getTranslations(String language) {
        Map<String, String> translations = new HashMap<>();

        String query = "SELECT `key`, value FROM localization_strings WHERE language = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, language);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                translations.put(rs.getString("key"), rs.getString("value"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return translations;
    }
}