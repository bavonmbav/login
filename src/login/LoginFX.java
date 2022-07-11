
package login;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class LoginFX extends Application {
    
    @Override
    public void start(Stage stage) throws IOException {
        
      FXMLLoader node = new  FXMLLoader(getClass().getResource("homepage.fxml"));
            Parent  root = node.load();
            stage.setScene( new Scene(root));
            stage.initStyle(StageStyle.UNDECORATED);
            stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
