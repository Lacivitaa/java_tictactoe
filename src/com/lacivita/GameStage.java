package com.lacivita;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javax.swing.*;

public class GameStage extends Stage {
    static GridPane gridPane;

    public static void start(Stage gameStage){
        gridPane = new GridPane();
        gridPane.setMinSize(300,300);
        gridPane.setPadding(new Insets(20,20,20,20));
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.setAlignment(Pos.CENTER);
    }
}
