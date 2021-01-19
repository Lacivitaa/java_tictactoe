package com.lacivita;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.Window;

public class Main extends Application {
    Scene scene;
    Button button;
    RadioButton radioButton1;
    RadioButton radioButton2;
    Stage gameStage;
    Stage stage;
    Label label;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //Start stage ------------------------------------------------------
        stage = primaryStage;
        stage.setTitle("IBM");

        label = OrgLabel();
        button = OrgButton();

        radioButton1 = new RadioButton("X");
        radioButton2 = new RadioButton("O");

        scene = new Scene(OrgVBox(OrgHBox(radioButton1,radioButton2),label,button), 200, 130);
        stage.setScene(scene);
        stage.show();

        button.setOnAction(c -> GameStage.start(gameStage));
    }

    public VBox OrgVBox(HBox hBox, Label label, Button button){
        VBox vBox = new VBox(0);
        vBox.setPadding(new Insets(20,20,20,20));
        vBox.getChildren().addAll(label, hBox,button);
        vBox.setAlignment(Pos.CENTER);
        return vBox;
    }

    public HBox OrgHBox(RadioButton radioButton1, RadioButton radioButton2){
        HBox hBox = new HBox(18);
        hBox.setPadding(new Insets(20,20,20,20));
        hBox.getChildren().addAll(radioButton1,radioButton2);
        hBox.setAlignment(Pos.CENTER);
        return hBox;
    }

    public Label OrgLabel(){
        Label label = new Label("Choose your team");
        label.setStyle("-fx-font-weight: bold;");
        label.setAlignment(Pos.CENTER);
        return label;
    }

    public Button OrgButton(){
        button = new Button("Start");
        button.setMinWidth(20);
        button.setAlignment(Pos.CENTER);
        return button;
    }
}
