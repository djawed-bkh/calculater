package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller  {

    //initialisations bouttons
    @FXML
    private Button n0;
    @FXML
    private Button n1;
    @FXML
    private Button n2;
    @FXML
    private Button n3;
    @FXML
    private Button n4;
    @FXML
    private Button n5;
    @FXML
    private Button n6;
    @FXML
    private Button n7;
    @FXML
    private Button n8;
    @FXML
    private Button n9;
    @FXML
    private Button add;
    @FXML
    private Button sub;
    @FXML
    private Button mult;
    @FXML
    private Button eq;
    @FXML
    private Button div;
    @FXML
    private TextField screen;
    //initialisation bouttons
         //initialisations variables
    private String clicc="";
    private String clico="";
    private int nombre1=0;
    private int nombre2=0;
    private String inter="";
    private String operator="";
    private String operator1="";
    private int i=0;
    private int result=0;
    //initialisations variables

    //clique sur chiffres
    public void chiffres(ActionEvent event){
        clicc= ((Button) event.getSource()).getText();
        inter=inter+clicc;
        screen.setText(screen.getText()+clicc);
        if (operator1!="" && i==1){
            nombre1=Integer.parseInt(inter);
            operator=operator1;
            operator1="";
            inter="";
            System.out.println(nombre1);
            System.out.println(nombre2);
        }
        if (operator1=="="){
            nombre2=Integer.parseInt(inter);
            calculop();
            System.out.println(nombre1);
            System.out.println(nombre2);
        }

    }



    //clique sur operateurs
    public void operateur(ActionEvent event){
        clico=((Button) event.getSource()).getText();
        screen.setText(screen.getText()+clico);
        i=1;
        operator1=clico;
    }




    //mettre les comptes a zero
    public void resset(ActionEvent event){
      clicc="";
      clico="";
      nombre1=0;
         nombre2=0;
         inter="";
         operator="";
         operator1="";
        i=0;
       result=0;
       screen.setText("0");

    }


    //calcul des operations
    public void calculop(){
        switch (operator){
            case "+": result=nombre1+nombre2;break;
            case "-":result=nombre1-nombre2;break;
            case "*":result=nombre1*nombre2;break;
            case "/":result=nombre1/nombre2;break;
        }
       screen.setText(screen.getText()+result);
    }

}
