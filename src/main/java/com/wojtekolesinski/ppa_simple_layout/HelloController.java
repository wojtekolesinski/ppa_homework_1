package com.wojtekolesinski.ppa_simple_layout;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;

public class HelloController {


    private int clickcount = 0;

    @FXML
    private TextField SCREEN;

    @FXML
    private Button KEY_ZERO;

    @FXML
    private Button KEY_ONE;

    @FXML
    private Button KEY_TWO;

    @FXML
    private Button KEY_THREE;

    @FXML
    private Button KEY_FOUR;

    @FXML
    private Button KEY_FIVE;

    @FXML
    private Button KEY_SIX;

    @FXML
    private Button KEY_SEVEN;

    @FXML
    private Button KEY_EIGHT;

    @FXML
    private Button KEY_NINE;


    @FXML
    protected void handleNumericClick(ActionEvent e) {

        String number = "";
        Object source = e.getSource();
        if (source.equals(KEY_ZERO)) {
            number = "0";
        } else if (source.equals(KEY_ONE)) {
            number = "1";
        } else if (source.equals(KEY_TWO)) {
            number = "2";
        }  else if (source.equals(KEY_THREE)) {
            number = "3";
        } else if (source.equals(KEY_FOUR)) {
            number = "4";
        } else if (source.equals(KEY_FIVE)) {
            number = "5";
        } else if (source.equals(KEY_SIX)) {
            number = "6";
        } else if (source.equals(KEY_SEVEN)) {
            number = "7";
        } else if (source.equals(KEY_EIGHT)) {
            number = "8";
        } else if (source.equals(KEY_NINE)) {
            number = "9";
        }

        SCREEN.appendText(number);
//        SCREEN.tex
    }
}