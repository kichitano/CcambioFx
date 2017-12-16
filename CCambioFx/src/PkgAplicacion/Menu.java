/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgAplicacion;

import java.io.IOException;
import javafx.application.Application;
<<<<<<< HEAD
=======
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
>>>>>>> design0.1
import javafx.stage.Stage;

/**
 *
 * @author Corei7
 */
public class Menu extends Application {
    
    @Override
    public void start(Stage menuStage) throws IOException {
<<<<<<< HEAD

=======
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuDesign.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        menuStage.setScene(scene);
        menuStage.show();
        
>>>>>>> design0.1
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
