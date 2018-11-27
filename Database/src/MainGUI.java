import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import java.sql.*;

public class MainGUI extends Application implements EventHandler<ActionEvent>{

	//JDBC driver name and database URL
	//static final String JDBC_DRIVER =;
	//static final String DB_URL = ;

	//Database Credentials
	//static final String USER = "username";
	//static final String PASS = "password";


	//Holds launch
	public static void main(String[] args) {
		launch(args);	
		//Connection conn = null;
		//Statement stmt = null;
		/* try{
		 * 
		 * Step 2: Register JDBC driver
		 * Class.forName("");
		 *  */
	}
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Student Identification");

		//add button
		Button addbtn = new Button("Add");
		addbtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override 
			public void handle(ActionEvent e) {
				Stage stage = new Stage();
				try {AddWindow.start(stage);} catch (Exception e1) {e1.printStackTrace();}
			}
		});
		addbtn.setLayoutY(270);
		addbtn.setLayoutX(15);

		//delete button
		Button deletebtn = new Button("Delete");
		deletebtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override 
			public void handle(ActionEvent e) {
				Stage stage = new Stage();
				try {Delete.start(stage);} catch (Exception e1) {e1.printStackTrace();}
			}
		});
		deletebtn.setLayoutY(270);
		deletebtn.setLayoutX(355);

		//modify button
		Button modifybtn = new Button("Modify");
		modifybtn.setLayoutY(270);
		modifybtn.setLayoutX(185);

		//search button
		Button searchbtn = new Button("Search");
		searchbtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override 
			public void handle(ActionEvent e) {
				Stage stage = new Stage();
				try {Searched.start(stage);} catch (Exception e1) {e1.printStackTrace();}
			}
		});
		searchbtn.setLayoutY(10);
		searchbtn.setLayoutX(319);
		
		//This is where all the other stuff will go
		Text ID = new Text("Student ID:");
		ID.setLayoutX(20);
		ID.setLayoutY(30);

		TextField SID = new TextField();
		SID.setLayoutX(125);
		SID.setLayoutY(10);

		Text StudentName = new Text("Student Name: ");
		StudentName.setLayoutX(20);
		StudentName.setLayoutY(75);

		TextField NameField = new TextField();
		NameField.setLayoutX(125);
		NameField.setLayoutY(55);

		Text Address = new Text("Address: ");
		Address.setLayoutX(20);
		Address.setLayoutY(115);

		TextField AddressField = new TextField();
		AddressField.setLayoutX(125);
		AddressField.setLayoutY(95);

		Text DOB = new Text("Date of Birth: ");
		DOB.setLayoutX(20);
		DOB.setLayoutY(155);

		TextField DobField = new TextField();
		DobField.setLayoutX(125);
		DobField.setLayoutY(135);

		Text Year = new Text("Year: ");
		Year.setLayoutX(20);
		Year.setLayoutY(195);

		TextField YearField = new TextField();
		YearField.setLayoutX(125);
		YearField.setLayoutY(175);

		Text School = new Text("School: ");
		School.setLayoutX(15);
		School.setLayoutY(230);

		TextField SF = new TextField();
		SF.setLayoutX(125);
		SF.setLayoutY(210);

		Pane layout = new Pane();
		layout.getChildren().addAll(addbtn, deletebtn, modifybtn,
				ID, SID, searchbtn,
				StudentName, NameField,
				Address, AddressField,
				DOB, DobField,
				Year, YearField, School, SF);
		Scene scene = new Scene(layout, 450, 300); //width(x), height(y)
		stage.setScene(scene);
		stage.show();
	}
	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub

	}


}
