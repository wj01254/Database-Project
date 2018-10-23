import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

public class MainGUI extends Application implements EventHandler<ActionEvent>{
	
	Button addbtn;
	Button deletebtn;
	Button modifybtn;
	Button Scholarship;
	Text ID;
	Button searchbtn;
	Text StudentName;
	Text Address;
	Text DOB;
	Text Year;
	
	//Holds launch
	public static void main(String[] args) {
		launch(args);	
	}
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Student Identification");
				
		//add button
		addbtn = new Button("Add");
		addbtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override 
		public void handle(ActionEvent e) {
				Stage stage = new Stage();
				//fill the stage
				stage.setTitle("Add A Student");
				Text studentName = new Text("Student Name: ");
				studentName.setLayoutX(20);
				studentName.setLayoutY(30);
				TextField Name = new TextField();
				Name.setLayoutX(125);
				Name.setLayoutY(10);
				Text studentID = new Text("Student ID: ");
				studentID.setLayoutX(20);
				studentID.setLayoutY(75);
				TextField ID = new TextField();
				ID.setLayoutX(125);
				ID.setLayoutY(55);
				Text Address = new Text("Address");
				Address.setLayoutX(20);
				Address.setLayoutY(115);
				TextField AID = new TextField();
				AID.setLayoutX(125);
				AID.setLayoutY(95);
				Text DOB = new Text("Date of Birth: ");
				DOB.setLayoutX(20);
				DOB.setLayoutY(155);
				TextField DOBID = new TextField();
				DOBID.setLayoutX(125);
				DOBID.setLayoutY(135);
				Text Year = new Text("Year: ");
				Year.setLayoutX(20);
				Year.setLayoutY(205);
				TextField YID = new TextField();
				YID.setLayoutX(125);
				YID.setLayoutY(185);
				Button Ok = new Button("Ok");
				Ok.setLayoutX(150);
				Ok.setLayoutY(250);
				Button Exit = new Button("Exit");
				Exit.setLayoutX(250);
				Exit.setLayoutY(250);
				Exit.setOnAction(new EventHandler<ActionEvent> () {
					@Override
					public void handle(ActionEvent e) {
						System.exit(0);
					}
				});
								Pane Addwindow = new Pane();
				Addwindow.getChildren().addAll(studentName,Name,
											   studentID, ID,
											   Address, AID,
											   DOB,DOBID,
											   Year, YID, Ok, Exit);
				Scene added = new Scene(Addwindow,350,300);
				stage.setScene(added);
				stage.show();
				//if(addbtn.getText().equals("Clicked")) addbtn.setText("Add");
				//else addbtn.setText("Clicked");
			}
		});
		addbtn.setLayoutY(230);
		addbtn.setLayoutX(15);
		
		//delete button
		deletebtn = new Button("Delete");
		deletebtn.setLayoutY(230);
		deletebtn.setLayoutX(355);
		deletebtn.setOnAction(this);
		
		//modify button
		modifybtn = new Button("Modify");
		
		modifybtn.setLayoutY(230);
		modifybtn.setLayoutX(185);
		
		//search button
		searchbtn = new Button("Search");
		searchbtn.setLayoutY(10);
		searchbtn.setLayoutX(319);
		
		//Scholarship Button
		Scholarship = new Button("Scholarships");
		Scholarship.setLayoutX(319);
		Scholarship.setLayoutY(45);
		
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
		
		Text Year = new Text("Year : ");
		Year.setLayoutX(20);
		Year.setLayoutY(205);
		
		TextField YearField = new TextField();
		YearField.setLayoutX(125);
		YearField.setLayoutY(185);
		
		
		Pane layout = new Pane();
		layout.getChildren().addAll(addbtn, deletebtn, modifybtn,
									ID, SID, searchbtn,
									StudentName, NameField,
									Address, AddressField,
									DOB, DobField,
									Year, YearField, Scholarship
									);
										//width(x), height(y)
		Scene scene = new Scene(layout, 450, 300);
		stage.setScene(scene);
		stage.show();
	}
}
