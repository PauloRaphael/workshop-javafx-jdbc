package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

@SuppressWarnings("all")
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
    this.loadView("/gui/About.fxml");
  }
  
  @Override
  public void initialize(final URL arg0, final ResourceBundle arg1) {
  }
  
  private void loadView(final String absoluteName) {
    throw new Error("Unresolved compilation problems:"
      + "\nVBox cannot be resolved to a type."
      + "\nVBox cannot be resolved to a type."
      + "\nVBox cannot be resolved to a type."
      + "\ngetChildren cannot be resolved"
      + "\nget cannot be resolved"
      + "\ngetChildren cannot be resolved"
      + "\nclear cannot be resolved"
      + "\ngetChildren cannot be resolved"
      + "\nadd cannot be resolved"
      + "\ngetChildren cannot be resolved"
      + "\naddAll cannot be resolved"
      + "\ngetChildren cannot be resolved");
  }
}
