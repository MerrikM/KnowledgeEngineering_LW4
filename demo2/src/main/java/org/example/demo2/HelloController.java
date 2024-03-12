package org.example.demo2;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.*;

public class HelloController implements Initializable{
    @FXML
    private ComboBox<String> FirstComboBox;

    @FXML
    private ComboBox<String> SecondComboBox;

    @FXML
    private TreeView<String> treeView;

    @FXML
    private Label labelTreePath;

    @FXML
    private Label labelQuestion;

    @FXML
    private Label labelAnswer;

    @FXML
    private Label labelFinal;

    public void FillTree() {
        int size = 62;

        TreeItem<String> rootTreeNode = new TreeItem<>("0");
        rootTreeNode.setExpanded(true);
        treeView.setRoot(rootTreeNode);

        TreeItem<String>[] arrayy = new TreeItem[size];
        for(int i = 1; i <= size - 1; i++) {
            arrayy[i] = new TreeItem<>(String.valueOf(i));
        }

        rootTreeNode.getChildren().add(arrayy[1]);
        rootTreeNode.getChildren().add(arrayy[2]);

        arrayy[1].getChildren().add(arrayy[3]);         arrayy[1].getChildren().add(arrayy[4]);
        arrayy[2].getChildren().add(arrayy[5]);         arrayy[2].getChildren().add(arrayy[6]);
        arrayy[3].getChildren().add(arrayy[7]);         arrayy[3].getChildren().add(arrayy[8]);
        arrayy[4].getChildren().add(arrayy[9]);         arrayy[4].getChildren().add(arrayy[10]);
        arrayy[5].getChildren().add(arrayy[11]);        arrayy[5].getChildren().add(arrayy[12]);
        arrayy[6].getChildren().add(arrayy[13]);        arrayy[6].getChildren().add(arrayy[14]);

        arrayy[7].getChildren().add(arrayy[15]);        arrayy[7].getChildren().add(arrayy[16]);
        arrayy[8].getChildren().add(arrayy[17]);        arrayy[8].getChildren().add(arrayy[30]);
        arrayy[9].getChildren().add(arrayy[18]);        arrayy[9].getChildren().add(arrayy[19]);
        arrayy[10].getChildren().add(arrayy[20]);       arrayy[10].getChildren().add(arrayy[21]);
        arrayy[11].getChildren().add(arrayy[22]);       arrayy[11].getChildren().add(arrayy[23]);
        arrayy[12].getChildren().add(arrayy[24]);       arrayy[12].getChildren().add(arrayy[25]);

        arrayy[13].getChildren().add(arrayy[26]);       arrayy[13].getChildren().add(arrayy[27]);
        arrayy[14].getChildren().add(arrayy[28]);       arrayy[14].getChildren().add(arrayy[29]);

        arrayy[18].getChildren().add(arrayy[30]);       arrayy[18].getChildren().add(arrayy[31]);

        arrayy[19].getChildren().add(arrayy[32]);       arrayy[19].getChildren().add(arrayy[33]);
        arrayy[20].getChildren().add(arrayy[34]);       arrayy[20].getChildren().add(arrayy[35]);
        arrayy[21].getChildren().add(arrayy[36]);       arrayy[21].getChildren().add(arrayy[37]);
        arrayy[22].getChildren().add(arrayy[37]);       arrayy[22].getChildren().add(arrayy[38]);
        arrayy[23].getChildren().add(arrayy[39]);       arrayy[23].getChildren().add(arrayy[40]);
        arrayy[24].getChildren().add(arrayy[41]);       arrayy[24].getChildren().add(arrayy[42]);

        arrayy[25].getChildren().add(arrayy[43]);       arrayy[25].getChildren().add(arrayy[44]);
        arrayy[26].getChildren().add(arrayy[45]);       arrayy[26].getChildren().add(arrayy[46]);
        arrayy[27].getChildren().add(arrayy[47]);       arrayy[27].getChildren().add(arrayy[48]);

        arrayy[45].getChildren().add(arrayy[49]);       arrayy[45].getChildren().add(arrayy[50]);
        arrayy[46].getChildren().add(arrayy[51]);       arrayy[46].getChildren().add(arrayy[52]);
        arrayy[47].getChildren().add(arrayy[53]);       arrayy[47].getChildren().add(arrayy[54]);
        arrayy[48].getChildren().add(arrayy[55]);       arrayy[46].getChildren().add(arrayy[56]);
        arrayy[52].getChildren().add(arrayy[57]);       arrayy[52].getChildren().add(arrayy[58]);
        arrayy[56].getChildren().add(arrayy[59]);       arrayy[56].getChildren().add(arrayy[60]);
    }

    private void traverseTree(TreeItem<String> node) {
        for(int i=0;i<node.getChildren().size();i++){
            //System.out.println("node with value :"+node.getValue());
            System.out.println(node.getChildren().get(i));
            traverseTree(node.getChildren().get(i));
            //return node.getChildren().get(i);
        }
    }

    private TreeItem<String> findTreeItem(TreeItem<String> root, String name) {
        if (root.getValue().equals(name)) {
            return root;
        }
        for (TreeItem<String> child : root.getChildren()) {
            TreeItem<String> found = findTreeItem(child, name);
            if (found != null) {
                return found;
            }
        }
        return null;
    }

    public static void sortTreeItems(TreeItem<String>[] treeItems) {
        Arrays.sort(treeItems, Comparator.comparingInt(item -> Integer.parseInt(item.getValue())));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        labelFinal.setText("");
        labelTreePath.setText("");
        labelAnswer.setText("");
        labelQuestion.setText("");

        Hash h = new Hash();
        int size = 62;
        TreeItem<String> root = new TreeItem<>("0");
        root.setExpanded(true);
        treeView.setRoot(root);

        // Создание всех будущих вершин TreeView
        TreeItem<String>[] arrayy = new TreeItem[size];
        for(int i = 1; i <= size - 1; i++) {
            arrayy[i] = new TreeItem<>(String.valueOf(i));
        }

        // Заполнение TreeView TreeItem'ами
        root.getChildren().add(arrayy[1]);
        root.getChildren().add(arrayy[2]);

        arrayy[1].getChildren().add(arrayy[3]);         arrayy[1].getChildren().add(arrayy[4]);
        arrayy[2].getChildren().add(arrayy[5]);         arrayy[2].getChildren().add(arrayy[6]);
        arrayy[3].getChildren().add(arrayy[7]);         arrayy[3].getChildren().add(arrayy[8]);
        arrayy[4].getChildren().add(arrayy[9]);         arrayy[4].getChildren().add(arrayy[10]);
        arrayy[5].getChildren().add(arrayy[11]);        arrayy[5].getChildren().add(arrayy[12]);
        arrayy[6].getChildren().add(arrayy[13]);        arrayy[6].getChildren().add(arrayy[14]);

        arrayy[7].getChildren().add(arrayy[15]);        arrayy[7].getChildren().add(arrayy[16]);
        arrayy[8].getChildren().add(arrayy[17]);        arrayy[8].getChildren().add(arrayy[30]);
        arrayy[9].getChildren().add(arrayy[18]);        arrayy[9].getChildren().add(arrayy[19]);
        arrayy[10].getChildren().add(arrayy[20]);       arrayy[10].getChildren().add(arrayy[21]);
        arrayy[11].getChildren().add(arrayy[22]);       arrayy[11].getChildren().add(arrayy[23]);
        arrayy[12].getChildren().add(arrayy[24]);       arrayy[12].getChildren().add(arrayy[25]);

        arrayy[13].getChildren().add(arrayy[26]);       arrayy[13].getChildren().add(arrayy[27]);
        arrayy[14].getChildren().add(arrayy[28]);       arrayy[14].getChildren().add(arrayy[29]);

        arrayy[18].getChildren().add(arrayy[30]);       arrayy[18].getChildren().add(arrayy[31]);

        arrayy[19].getChildren().add(arrayy[32]);       arrayy[19].getChildren().add(arrayy[33]);
        arrayy[20].getChildren().add(arrayy[34]);       arrayy[20].getChildren().add(arrayy[35]);
        arrayy[21].getChildren().add(arrayy[36]);       arrayy[21].getChildren().add(arrayy[37]);
        arrayy[22].getChildren().add(arrayy[37]);       arrayy[22].getChildren().add(arrayy[38]);
        arrayy[23].getChildren().add(arrayy[39]);       arrayy[23].getChildren().add(arrayy[40]);
        arrayy[24].getChildren().add(arrayy[41]);       arrayy[24].getChildren().add(arrayy[42]);

        arrayy[25].getChildren().add(arrayy[43]);       arrayy[25].getChildren().add(arrayy[44]);
        arrayy[26].getChildren().add(arrayy[45]);       arrayy[26].getChildren().add(arrayy[46]);
        arrayy[27].getChildren().add(arrayy[47]);       arrayy[27].getChildren().add(arrayy[48]);

        arrayy[45].getChildren().add(arrayy[49]);       arrayy[45].getChildren().add(arrayy[50]);
        arrayy[46].getChildren().add(arrayy[51]);       arrayy[46].getChildren().add(arrayy[52]);
        arrayy[47].getChildren().add(arrayy[53]);       arrayy[47].getChildren().add(arrayy[54]);
        arrayy[48].getChildren().add(arrayy[55]);       arrayy[46].getChildren().add(arrayy[56]);
        arrayy[52].getChildren().add(arrayy[57]);       arrayy[52].getChildren().add(arrayy[58]);
        arrayy[56].getChildren().add(arrayy[59]);       arrayy[56].getChildren().add(arrayy[60]);

        //Первые 2 потомка нулевой вершины
        FirstComboBox.getItems().addAll(root.getChildren().get(0).getValue(), root.getChildren().get(1).getValue());

        FirstComboBox.setOnAction(event -> {
            String selectedItem = FirstComboBox.getValue();
            // Находим TreeItem по выбранному элементу в первом ComboBox
            TreeItem<String> selectedItemInTree = findTreeItem(root, selectedItem);
            // Очищаем второй ComboBox перед добавлением новых элементов
            SecondComboBox.getItems().clear();
            // Добавляем потомков выбранного элемента во второй ComboBox
            if (selectedItemInTree != null) {
                for (TreeItem<String> child : selectedItemInTree.getChildren()) {
                    SecondComboBox.getItems().add(child.getValue());

                    labelQuestion.setText("");
                    labelQuestion.setText(h.graphVerticies.get(selectedItem));
                }
            }
        });

        SecondComboBox.setOnAction(event -> {
            String selectedItem = SecondComboBox.getValue();
            // Находим TreeItem по выбранному элементу во втором ComboBox
            TreeItem<String> selectedItemInTree = findTreeItem(root, selectedItem);
            // Здесь вы можете делать что-то с выбранным элементом, например, отображать его данные или проводить вычисления
            if (selectedItemInTree != null) {
                FirstComboBox.getItems().add(selectedItem);

                labelAnswer.setText("");
                labelAnswer.setText(h.graphVerticies.get(selectedItem));

                labelTreePath.setText("");
                labelTreePath.setText(labelTreePath.getText() + FirstComboBox.getItems());

                if(h.CheckVerticies(selectedItem)) {
                    labelFinal.setText(FirstComboBox.getItems().getLast() + " " + h.graphVerticies.get(selectedItem));
                    labelFinal.setTextFill(Color.GREEN);
                }
            }
        });
    }
}