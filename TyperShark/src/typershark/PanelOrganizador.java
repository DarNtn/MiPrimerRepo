/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 //holaaaa
package typershark;

import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;

/**
 *
 * @author Dario Ntn Carpio
 */
public class PanelOrganizador {
    private BorderPane root;
    
    public PanelOrganizador(){
        root = new BorderPane();
        
        
        
    }
    
    public BorderPane getRoot(){
        return root;
    }
    
    public void setSceneMenu(){
        VBox panel = new VBox();
        Button start = new Button("Start");
        Button leaderBoard = new Button("LeaderBoard");
        Button quit = new Button("Quit");
                
        panel.getChildren().addAll(start,leaderBoard,quit);
        panel.setAlignment(Pos.CENTER);
        panel.setSpacing(20);
        
        root.setCenter(panel);
    }
}
