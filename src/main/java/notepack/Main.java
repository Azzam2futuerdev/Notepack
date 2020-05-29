package notepack;

import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainView.fxml"));
        loader.setResources(ResourceBundle.getBundle("notepack.fonts.FontAwesome"));

//        App.class.getResource(fxml + ".fxml");
        Parent root = loader.load();

        MainViewController ctrl = loader.getController();

        ctrl.hostServices = getHostServices();
        ctrl.appStart();

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setOnShowing((t) -> {
            ctrl.windowRestore();
        });

        stage.setTitle("NotePack");

        stage.show();
    }

}
