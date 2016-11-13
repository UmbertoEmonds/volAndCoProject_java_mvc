package sample.Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import sample.Controller.Buisiness.AeroportController;
import sample.Controller.Buisiness.AeroportVilleController;
import sample.Controller.Buisiness.ClientController;
import sample.Controller.DAO.ClientDAO;
import sample.Main;
import sample.Model.Client;
import sample.View.AeroportVue;
import sample.View.ClientVue;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    ClientVue clientVue = new ClientVue();
    AeroportController aeroportController = new AeroportController();
    AeroportVilleController aeroportVilleController = new AeroportVilleController();
    ClientDAO clientDAO = new ClientDAO();
    String txtDate = new SimpleDateFormat("dd/MM/yyyy", Locale.FRANCE).format(new Date());

    @FXML
    private ListView<Client> liste;

    @FXML
    private TextField nom;

    @FXML
    private TextField prenom;

    @FXML
    private TextArea adresse;

    @FXML
    private TextField num;

    @FXML
    private Label nomT;

    @FXML
    private Label prenomT;

    @FXML
    private Label adresseT;

    @FXML
    private Label numT;

    @FXML
    private Button ajouter;

    @FXML
    private MenuItem menuClient;

    @FXML
    private TextArea informations;

    @FXML
    private Label empty;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        nom.setVisible(false);
        prenom.setVisible(false);
        adresse.setVisible(false);
        num.setVisible(false);
        nomT.setVisible(false);
        prenomT.setVisible(false);
        adresseT.setVisible(false);
        numT.setVisible(false);
        ajouter.setVisible(false);

        empty.setVisible(true);

    }

    @FXML
    public void listerClient(){

        liste.getItems().clear();
        clientVue.listerClients(liste);

    }

    @FXML
    public void ajouterClient(){

        if(nom.getText().isEmpty()||prenom.getText().isEmpty()||adresse.getText().isEmpty()||num.getText().isEmpty()){
            showMessage("Veuillez renseigner tout les champs");
        }
        else {

            try {

                clientVue.ajouterClient(nom.getText(), prenom.getText(), adresse.getText(), num.getText());
                listerClient();

                showMessage("Client ajouté");
                informations.appendText("Vous avez ajouté un client nommé " + "\""+nom.getText() + " " + prenom.getText() +"\"" + " le " + txtDate + "\n\n");

            }
            catch (Exception e){
                e.printStackTrace();
                showMessage("Erreur lors de l'ajout du client !");
                }

            nom.setVisible(false);
            prenom.setVisible(false);
            adresse.setVisible(false);
            num.setVisible(false);

            nomT.setVisible(false);
            prenomT.setVisible(false);
            adresseT.setVisible(false);
            numT.setVisible(false);

            ajouter.setVisible(false);

            empty.setVisible(true);

            nom.clear();
            prenom.clear();
            adresse.clear();
            num.clear();

        }

    }

    @FXML
    public void menuRechercheClient(){
       String saisie = JOptionPane.showInputDialog(null, "Entrez le nom ou prénom du client à rechercher");
       informations.appendText("CLIENT TROUVE: " + clientVue.rechercherClient(saisie) + "\n\n");
    }

    @FXML
    public void listerAeroports(){
        for(int i = 0; i<aeroportController.afficherListe().size(); i++){
            informations.appendText(aeroportController.afficherListe().get(i) + "\n");
        }
        informations.appendText("\n\n");
    }

    @FXML
    public void listerAeroportVille(){
        for(int i = 0; i<aeroportVilleController.afficherListe().size(); i++){
            informations.appendText(aeroportVilleController.afficherListe().get(i) + "\n");
        }

        informations.appendText("\n\n");
    }

    @FXML
    public void clearInfo(){
        informations.clear();
    }

    @FXML
    public void menuClient(){

        nom.setVisible(true);
        prenom.setVisible(true);
        adresse.setVisible(true);
        num.setVisible(true);

        nomT.setVisible(true);
        prenomT.setVisible(true);
        adresseT.setVisible(true);
        numT.setVisible(true);


        empty.setVisible(false);
        ajouter.setVisible(true);

    }

    private void showMessage(String message) {
        EventQueue.invokeLater(() -> JOptionPane.showMessageDialog(null, message));
    }

}
