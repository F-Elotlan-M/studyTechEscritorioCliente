/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.pojo.Estudiante;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Elotlan
 */
public class LoginController implements Initializable {

    @FXML
    private Button btnIngresar;
    @FXML
    private TextField tfUsuario;
    @FXML
    private PasswordField pfContrasena;
    @FXML
    private Button btnCancelar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void clicIngresar(ActionEvent event) throws IOException {
        String nombreEstudiante = tfUsuario.getText();
        String contraseñaEstudiante = pfContrasena.getText();
        Estudiante estudianteLogin = new Estudiante();
        estudianteLogin.setUsername(nombreEstudiante);
        estudianteLogin.setContraseña(contraseñaEstudiante);
        Stage mostrarMenuEstudiante = new Stage();
        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass().getResource("/Interfaces/MenuPrincipalEstudiante.fxml").openStream());
        MenuPrincipalEstudianteController menuPrincipalEstudiantesController = (MenuPrincipalEstudianteController) loader.getController();
        menuPrincipalEstudiantesController.recibirEstudiante(estudianteLogin);
        Scene scene = new Scene(root);
        mostrarMenuEstudiante.setScene(scene);
        mostrarMenuEstudiante.setTitle("StudyTech");
        mostrarMenuEstudiante.setAlwaysOnTop(true);
        mostrarMenuEstudiante.initModality(Modality.APPLICATION_MODAL);
        mostrarMenuEstudiante.show();
        Stage stageActual = (Stage)tfUsuario.getScene().getWindow();
        Stage stage = (Stage) stageActual.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void clicCancelar(ActionEvent event) {
    }
    
}
