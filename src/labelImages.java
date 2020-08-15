import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.awt.*;
import java.io.FileInputStream;

public class labelImages extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Label and Images");
        stage.setWidth(800);
        stage.setHeight(500);


        VBox parent = new VBox();

        FileInputStream inputStream = new FileInputStream("C:\\Users\\User\\Desktop\\Images\\sadik.jpg");

        Image image = new Image(inputStream);

        Label labelText = new Label("Label and Images");
        labelText.setFont(new Font("Cambria",45));
        labelText.setTextFill(Color.web("#e81f10"));
        ImageView imageView = new ImageView(image);//to do direct from the web put the link instead of image

        //imageView.setFitHeight(400);//it will fix the height

        Label labelImage = new Label("Sadik",imageView);
        //labelImage.setRotate(10);//it will rotate image

        parent.getChildren().addAll(labelText,labelImage);

        Scene scene1 = new Scene(parent);
        stage.setScene(scene1);

        stage.show();

    }
}
