package org.example.week3_assignment;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.week3_assignment.db.CartService;
import org.example.week3_assignment.db.LocalizationService;
import org.example.week3_assignment.model.CartItem;
import org.example.week3_assignment.model.CartRecord;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ShoppingCartController {

    @FXML
    private Label titleLabel;

    @FXML
    private ComboBox<String> languageBox;

    @FXML
    private TextField item1PriceField;

    @FXML
    private TextField item1QuantityField;

    @FXML
    private TextField item2PriceField;

    @FXML
    private TextField item2QuantityField;

    @FXML
    private Button calculateButton;

    @FXML
    private Label resultLabel;

    private final LocalizationService localizationService = new LocalizationService();
    private final CartService cartService = new CartService();

    @FXML
    public void initialize() {
        languageBox.getItems().addAll("en", "fi", "sv", "ja");
        languageBox.setValue("en");

        loadLanguage("en");

        languageBox.setOnAction(event -> loadLanguage(languageBox.getValue()));
    }

    private void loadLanguage(String lang) {
        Map<String, String> t = localizationService.getTranslations(lang);

        System.out.println("Selected language: " + lang);
        System.out.println("Translations loaded: " + t);

        titleLabel.setText(t.getOrDefault("title", "Shopping Cart"));
        calculateButton.setText(t.getOrDefault("calculate", "Calculate"));

        item1PriceField.setPromptText(t.getOrDefault("item1price", "Item 1 Price"));
        item1QuantityField.setPromptText(t.getOrDefault("item1quantity", "Item 1 Quantity"));

        item2PriceField.setPromptText(t.getOrDefault("item2price", "Item 2 Price"));
        item2QuantityField.setPromptText(t.getOrDefault("item2quantity", "Item 2 Quantity"));

        resultLabel.setText(t.getOrDefault("total", "Total") + ":");
    }

    @FXML
    private void handleCalculate() {
        try {
            double price1 = Double.parseDouble(item1PriceField.getText());
            int qty1 = Integer.parseInt(item1QuantityField.getText());

            double price2 = Double.parseDouble(item2PriceField.getText());
            int qty2 = Integer.parseInt(item2QuantityField.getText());

            CartItem item1 = new CartItem(1, price1, qty1);
            CartItem item2 = new CartItem(2, price2, qty2);

            List<CartItem> items = new ArrayList<>();
            items.add(item1);
            items.add(item2);

            double total = item1.getSubtotal() + item2.getSubtotal();

            String lang = languageBox.getValue();
            Map<String, String> t = localizationService.getTranslations(lang);

            resultLabel.setText(t.getOrDefault("total", "Total") + ": " + total);

            CartRecord record = new CartRecord(2, total, lang, items);
            cartService.saveCart(record);

        } catch (Exception e) {
            resultLabel.setText("Invalid input");
            e.printStackTrace();
        }
    }
}