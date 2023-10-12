package com.example.matrixfx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.util.Random;

public class HelloController {
    @FXML
    private Button randomBut;

    @FXML
    private Button arrangeBut;

    @FXML
    private VBox randomBox;

    @FXML
    private VBox arrangeBox;

    @FXML
    public void random() {
        int[][] num = new int[10][10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                num[i][j] = rand.nextInt(99);
                randomBox.getChildren().addAll(num[i][j]);
            }
        }
    }
//    public  void arrange () {
//      ArrayList<Integer> array = new ArrayList<Integer>();
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                array.add(num[i][j]);
//            }
//        }
//        Collections.sort(array);
//        int k = 0;
//        int[][] num1 = new int[10][10];
//        for (int i = 9; i > -1 ; i--) {
//            if(i%2 == 0)
//            {
//                for (int j = 0; j < 10 ; j++) {
//                    num1[i][j] = array.get(k);
//                    k++;
//                }
//            }
//            else
//            {
//                for (int j = 9; j > -1; j--) {
//                    num1[i][j] = array.get(k);
//                    k++;
//                }
//            }
//        }
//    }
}