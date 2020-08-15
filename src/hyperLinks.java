import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class hyperLinks extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("Hyperlinks");
        stage.setWidth(500);
        stage.setHeight(200);

        VBox parent = new VBox();

        Hyperlink link = new Hyperlink("Click me");

        link.setOnAction(e ->{

            System.out.println("Link is clicked");

        });

        parent.getChildren().addAll(link);

        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();


    }
}
