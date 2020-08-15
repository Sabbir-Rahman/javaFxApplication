import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class buttonsMnemonics extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Buttons and mnemonics");
        stage.setWidth(600);
        stage.setHeight(400);

        VBox parent = new VBox();

        Button button1 = new Button("Click me");
        button1.setStyle("-fx-font-size: 30px");
        button1.setStyle("-fx-background-color: #ff0000; ");
        button1.setStyle("-fx-font-color: yellow");
        button1.setText("Md Sabbir Rahman");
        button1.setWrapText(true);

        parent.getChildren().addAll(button1);

        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
}
