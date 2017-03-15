package concert;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ConcertBuilderDemo extends Application{
	
	MenuBar mainBar;
	@Override
	public void start(Stage primaryStage) throws Exception{	
		
	   primaryStage.setTitle("Concert Organizer");
	 
	   mainBar= new MenuBar();
	   Menu mainMenu = new Menu("Concert Organizer Main Menu");
	   MenuItem memManagement = new MenuItem("Member Management");
	   MenuItem seaManagement = new MenuItem("Concert Season Management");
	   MenuItem compManagement = new MenuItem("Composition Management");
	   MenuItem conManagement = new MenuItem("Concert Management");
	   MenuItem exit = new MenuItem("Exit");
	   mainMenu.getItems().addAll(memManagement,seaManagement,compManagement,conManagement,exit);
	   mainBar.getMenus().add(mainMenu);
	   	   
	   Pane splashPane = getSplashPane("Welcome to Concert Organizer");
	   
	   Scene scene =  new Scene(splashPane, 1240, 520);
	   primaryStage.setScene(scene);
	   primaryStage.show();	
	   exit.setOnAction(e->Platform.exit());
	}
	
	public static void main(String[] args){
		Application.launch(args);
	}
	
	
	private Pane getSplashPane(String str ){
		Text text = new Text(str);
		text.setStyle("-fx-font: 40px Tahoma; -fx-stroke: blue; -fx-stroke-width: 1;");
		BorderPane splashPane = new BorderPane();
		splashPane.setCenter(text);
		splashPane.setTop(mainBar);
		
		
		
		return splashPane;	
	}
	
	
	 /* public static void main(String[] args) {
		   
	
	ConcertBuilder concertBuilder = new ConcertBuilder();

   Concert concert =  concertBuilder.preparConcert();
   
   System.out.println("Concert");
   
    concert.showItems();
    
  
    
	 }
*/
}
