
package login;

import java.io.IOException;
import java.net.URL;
import java.nio.CharBuffer;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;


public class HomepageController implements Initializable {

    @FXML
    private ProgressIndicator compte;
    @FXML
    private TextField user;
    @FXML
    private TextField passe;

    
    public class runn extends Thread
    {

       @Override
       public void run(){
           for(int i = 0; i<=100; i++)
           {
               try{
                        compte.setProgress(i/100.0);
                         Thread.sleep(100);
                         if(i == 100)
                         {
                              System.exit(0);
                         }
               }catch(Exception e){
                   e.printStackTrace();
               {
                   
               }
               
           }
           
       }
        
       }
    }
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      Thread th = new Thread(new runn());
      th.start();
      
    }    

    @FXML
    private void close(ActionEvent event) {
        
       
      
        
    }

    @FXML
    private void connexion(MouseEvent event) {
    }
    @FXML
    private void connexionne(MouseEvent event) {
    }
    
}
