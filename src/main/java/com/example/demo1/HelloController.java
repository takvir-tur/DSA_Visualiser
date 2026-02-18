package com.example.demo1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.scene.input.MouseEvent;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    void gotoSorting(MouseEvent click){
        System.out.println("sort_window");
    }
    @FXML
    void gotoArray(MouseEvent click){
        System.out.println("array_window");
    }
    @FXML
    void gotoLinkedList(MouseEvent click){
        System.out.println("LL_window");
    }
    @FXML
    void gotoStack(MouseEvent click){
        System.out.println("stack_window");
    }
    @FXML
    void gotoQueue(MouseEvent click){
        System.out.println("queue_window");
    }
    @FXML
    void gotoGraph(MouseEvent click){
        System.out.println("graph_window");
    }


}
