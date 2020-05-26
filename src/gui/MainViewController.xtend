package gui

import java.io.IOException
import java.net.URL
import java.util.ResourceBundle
import application.Main
import gui.util.Alerts
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.fxml.Initializable
import javafx.scene.Node
import javafx.scene.Scene
import javafx.scene.control.Alert.AlertType
import javafx.scene.control.MenuItem
import javafx.scene.control.ScrollPane
import j

class MainViewController implements Initializable {
	@FXML MenuItem menuItemSeller
	@FXML MenuItem menuItemDepartment
	@FXML MenuItem menuItemAbout

	@FXML def void onMenusItemSellerAcction() {
		System::out.println("onMenusItemSellerAction")
	}

	@FXML def void onMenusItemDepatmentAcction() {
		System::out.println("onMenusItemDepartmentAction")
	}

	@FXML def void onMenusItemAboutAcction() {
		loadView("/gui/About.fxml")
	}

	override void initialize(URL arg0, ResourceBundle arg1) {
	}

	def private void loadView(String absoluteName) {
		try {
			var FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName))
			var VBox newVBox = loader.load()
			var Scene mainScene = Main::getMainScene()
			var VBox mainVBox = (((mainScene.getRoot() as ScrollPane)).getContent() as VBox)
			var Node mainMenu = mainVBox.getChildren().get(0)
			mainVBox.getChildren().clear()
			mainVBox.getChildren().add(mainMenu)
			mainVBox.getChildren().addAll(newVBox.getChildren())
		} catch (IOException e) {
			Alerts::showAlert("IO Exeption", "Error loading view", e.getMessage(), AlertType::ERROR)
		}

	}
}
