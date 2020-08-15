import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class myFirstApplication extends Application {


    //this will be run before void start method useful for loading scene etc


    @Override
    public void init() throws Exception {
        System.out.println("Before");
    }

    @Override
    public void start(Stage stage) throws Exception {
        //stage is the main window
        stage.setTitle("My First Application");
        stage.show();


        //stage2 is the econd window
        Stage stage2 = new Stage();
        stage2.setTitle("Second Window");

        //setting the height and width by pixel

        stage2.setWidth(700);
        stage2.setHeight(350);

        //setting the position
        stage2.setX(0);
        stage2.setY(0);

        stage2.show();

//        Stage newWindow = new Stage();
//        //modality
//        //it hase threee option by this we can select the user can minimize the app or not?
//        newWindow.initModality(Modality.APPLICATION_MODAL);//without closing this nothing can work
//        newWindow.setTitle("New Window with Application modality");
//
//        newWindow.show();


//        Stage newWindow2 = new Stage();
//        //modality
//        //it hase threee option by this we can select the user can minimize the app or not?
//        newWindow2.initModality(Modality.NONE);//without closing this nothing can work
//        newWindow2.setTitle("New Window 2 with none modality");
//        newWindow2.show();


        Stage newWindow3 = new Stage();
        //modality
        //it hase threee option by this we can select the user can minimize the app or not?
        newWindow3.initModality(Modality.WINDOW_MODAL);//without closing this nothing can work
        newWindow3.setTitle("New Window 3 with window modality");
        newWindow3.initStyle(StageStyle.DECORATED);//normal window
//        newWindow3.initStyle(StageStyle.TRANSPARENT);//transparent window not visible
//        newWindow3.initStyle(StageStyle.UTILITY);//window only have cros button
        newWindow3.show();


    }

    //it will run when the application is closed
    @Override
    public void stop() throws Exception {
        System.out.println("Application is stop");
    }
}
