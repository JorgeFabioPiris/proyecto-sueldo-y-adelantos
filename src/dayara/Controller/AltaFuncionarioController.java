/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dayara.Controller;

import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextArea;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 * FXML Controller class
 *
 * @author brother
 * 
 */
   

public class AltaFuncionarioController implements Initializable {

    /**
     * Initializes the controller class.
     */
     @FXML
    private JFXTextField tfNombre;

    @FXML
    private JFXTextField tfApellido;

    @FXML
    private JFXTextField tfCedula;

    @FXML
    private JFXTextField tfTelefono;
     @FXML
    private JFXDatePicker fechaIngreso;

    @FXML
    private JFXTextField tfSalario;

    @FXML
    private JFXCheckBox estado;
    
    @FXML
    private JFXTextArea tfObservacion;

  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
      @FXML
    void btnActionCancelar(ActionEvent event) {

    }

    @FXML//boton que se encarga de registrar
    void btnActionRegistrar(ActionEvent event) {

    }
    
}
