/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.pojo.Estudiante;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Elotlan
 */
public class MenuPrincipalEstudianteController implements Initializable {

    @FXML
    private Button btnBuscar;

    Estudiante recibirEstudiante = new Estudiante();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void recibirEstudiante(Estudiante estudiante){
        recibirEstudiante = estudiante;
    }
    
}
