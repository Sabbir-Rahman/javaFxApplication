import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class scene extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("My First Scene");
        stage.setHeight(500);
        stage.setWidth(800);

        VBox parent = new VBox();//setting parent layout

        Label label1 = new Label("This is my first text on java fx");
        Label label2 = new Label("Another Text");
        parent.getChildren().addAll(label1,label2);

        Scene scene1 = new Scene(parent);

        scene1.setCursor(Cursor.CLOSED_HAND);//cursor can be changed
        stage.setScene(scene1);
        stage.show();
    }
}
