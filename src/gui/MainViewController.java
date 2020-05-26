package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {

	@FXML
	private MenuItem menuItemSeller;
	
	@FXML
	private MenuItem menuItemDepartment;
	
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	public void onMenusItemSellerAcction() {
		 System.out.println("onMenusItemSellerAction");
	}	
	
	@FXML
	public void onMenusItemDepatmentAcction() {
		 System.out.println("onMenusItemDepartmentAction");
	}
	
	@FXML
	public void onMenusItemAboutAcction() {
		 System.out.println("onMenusItemAboutAction");
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}

}
