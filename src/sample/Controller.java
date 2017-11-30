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
    private Button ac;
    @FXML
    private Button c;
    @FXML
    private Button virgule;
    @FXML
    private TextField screen;
    //initialisation bouttons

    //initialisations variables
    private int operation;
    private float data;
    private int datai;
    private boolean vir=false;



    //initialisations variables
    @FXML
    public void action (ActionEvent event){
        if(event.getSource()==n1){

            screen.setText(screen.getText()+"1");

        }else if((event.getSource()==n2)){

            screen.setText(screen.getText()+"2");
        }else if((event.getSource()==n3)){

            screen.setText(screen.getText()+"3");
        }else if((event.getSource()==n4)){

            screen.setText(screen.getText()+"4");
        }else if((event.getSource()==n5)){

            screen.setText(screen.getText()+"5");
        }else if((event.getSource()==n6)){

            screen.setText(screen.getText()+"6");
        }else if((event.getSource()==n7)){

            screen.setText(screen.getText()+"7");
        }else if((event.getSource()==n8)){

            screen.setText(screen.getText()+"8");
        }else if((event.getSource()==n9)){

            screen.setText(screen.getText()+"9");
        }else if((event.getSource()==n0)){

            screen.setText(screen.getText()+"0");
        }
        else if (event.getSource()==virgule){
            screen.setText(screen.getText()+".");
            vir=true;

        }
        else if((event.getSource()==ac)||event.getSource()==c){

            screen.setText("0");
            vir=false;

        }
        else if((event.getSource()==add )){
            if (vir==true){
                data=Float.parseFloat(screen.getText());
                operation=1;//addition
                screen.setText(" ");
            }else{
                datai=Integer.parseInt(screen.getText());
                operation=1;//addition
                screen.setText(" ");
            }


        }
        else if((event.getSource()==sub)){
            if(vir==true){
                data=Float.parseFloat(screen.getText());
                operation=2;//soust
                screen.setText(" ");
            }else {
                datai=Integer.parseInt(screen.getText());
                operation=2;//soust
                screen.setText(" ");
            }


        }
        else if((event.getSource()==mult)){
            if(vir==true){
                data=Float.parseFloat(screen.getText());
                operation=3;//produit
                screen.setText(" ");
            }else {
                datai=Integer.parseInt(screen.getText());
                operation=3;//produit
                screen.setText(" ");
            }


        }
        else if((event.getSource()==div)){
            data=Float.parseFloat(screen.getText());
            operation=4;//devise
            screen.setText(" ");

        }
        else if((event.getSource()==eq)){
            float op;
            Float secondOperand= Float.parseFloat(screen.getText());
            int opi;
            switch (operation){

                case 1:if (vir==true){
                    op= data+secondOperand;
                    screen.setText(String.valueOf(op));
                    System.out.println(op);

                }else {
                    opi= (int)(datai+secondOperand);
                    screen.setText(String.valueOf(opi));
                    System.out.println(opi);}
                    break;
                case 2:
                    if (vir==true){
                        op= (data-secondOperand);
                        screen.setText(String.valueOf(op));
                    }else{
                        opi= (int)(datai-secondOperand);
                        screen.setText(String.valueOf(opi));
                    }

                    break;
                case 3:
                    if (vir==true){
                        op=1;
                        op= (data*secondOperand);
                        screen.setText(String.valueOf(op));
                    }else{
                        opi=1;
                        opi= (int)(datai*secondOperand);
                        System.out.println(datai+"   "+secondOperand+"  "+opi);
                        screen.setText(String.valueOf(opi));break;
                    }
                case 4:
                    op=0f;
                    try{
                        op= data/secondOperand;
                    } catch (ArithmeticException  e){
                        screen.setText("erreur");
                    }
                    screen.setText(String.valueOf(op));
                    break;

            }

        }

    }
}