import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class cssStyling extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Css styling");
        stage.setWidth(500);
        stage.setHeight(300);

        VBox parent = new VBox();

        Label lavelText = new Label("This is start of styling bro");
        parent.getChildren().addAll(lavelText);

        Scene scene = new Scene(parent);
        scene.getStylesheets().add("stylesheets/styles.css");

        stage.setScene(scene);

        stage.show();

    }


}
