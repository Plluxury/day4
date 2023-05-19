package com.example.day4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField txt_result;

    String op ="";
    float num1;
    float num2;

    @FXML
    protected void Number(ActionEvent ae){
        String no = ((Button)ae.getSource()).getText();
        txt_result.setText(txt_result.getText()+no);
    }
    @FXML
    protected void Operation (ActionEvent ae){
        String operation = ((Button)ae.getSource()).getText();
        if (!operation.equals("=")) {

            if(!op.equals("")){
                return;
            }
            op = operation;
            num1 =Float.parseFloat(txt_result.getText());
            txt_result.setText("");
        }else {
            if (op.equals("")){
                return;
            }
            num2 = Float.parseFloat(txt_result.getText());
            calcalute(num1, num2, op);
            op = "";
        }
    }

    public void calcalute(float n1, float n2, String op){

        switch (op){
            case "+": {
                txt_result.setText(n1+n2+"");break;
            }
            case "-": {
                txt_result.setText(n1-n2+"");break;
            }
            case "*": {
                txt_result.setText(n1*n2+"");break;
            }
            case "/": {
                if (n2 == 0){
                    txt_result.setText("0");break;
                }
                txt_result.setText(n1/n2+"");break;
            }
        }
    }
}