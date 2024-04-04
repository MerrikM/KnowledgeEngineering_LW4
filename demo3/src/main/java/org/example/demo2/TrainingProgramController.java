package org.example.demo2;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainingProgramController implements Initializable{
    @FXML
    private ComboBox<String> FirstComboBox;

    @FXML
    private ComboBox<String> SecondComboBox;

    @FXML
    private TreeView<String> treeView;

    @FXML
    private Label labelFinal;

    @FXML
    private Button showAllTreeNodes;

    @FXML
    private Button explanationButton;

    @FXML
    private ImageView imageView;

    @FXML
    private Button leftChildBtn;

    @FXML
    private Button rightChildBtn;

    @FXML
    private Label currentNodeLabel;

    @FXML
    private Button moveBackBtn;
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
    private List<TreeItem<String>> findNode(TreeItem<String> item, String searchValue) {
        List<TreeItem<String>> result = new ArrayList<>();
        if (item != null && item.getValue().equals(searchValue)) {
            result.add(item);
        }
        if (item != null) {
            for (TreeItem<String> child : item.getChildren()) {
                result.addAll(findNode(child, searchValue));
            }
        }
        else {
            System.out.println("Вершина не найдена");
        }
        return result;
    }
    private static void showExplanation(Label explanationLabel, String selectedItem) {
        Explanation expl = new Explanation();
        String explText = expl.getExplanation().get(selectedItem);
        explanationLabel.setText(newLineInLabel(explText));
    }
    private static String findFirstNumber(String str) {
        Pattern pattern = Pattern.compile("^\\D*(\\d+).*$");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return String.valueOf(matcher.group(1));
        } else {
            return "";
        }
    }
    private String loadImage(String imageName) {
        String filePath = "file:\\" + System.getProperty("user.dir") + "\\src\\main\\resources\\images\\" + imageName + ".jpg";

        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("Файл не найден по указанному пути: " + filePath);
        } else {
            System.out.println("Файл существует по указанному пути: " + filePath);
        }
        return filePath;
    }

    private static String newLineInLabel(String text) {
        int maxLength = 50;
        if (text.length() <= maxLength) {
            return text;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i+=maxLength) {
            sb.append(text, i, Math.min(i + maxLength, text.length())).append("\n");
        }
        return sb.toString();
    }

    private void graphTraversal(Button button, Label explanationLabel, TreeItem<String> root) {
        Hash hash = new Hash();
        Edges edge = new Edges();
        String btnText = button.getText();
        String selectedItem = edge.getHashKeyByValue(edge.getGraphEdges(), btnText);
        List<TreeItem<String>> selectedItemInTree = findNode(root, selectedItem + " " + hash.getGraphVerticies().get(selectedItem));

        labelFinal.setText("");

        for (TreeItem<String> child : selectedItemInTree) {
            if (!child.getChildren().isEmpty()) {
                String nextLeftNode = findFirstNumber(child.getChildren().getFirst().getValue());
                String nextRigntNode = findFirstNumber(child.getChildren().getLast().getValue());

                // Получаем текст "ребра" из хэш-таблицы и выводим его в Button
                leftChildBtn.setText(edge.getGraphEdges().get(nextLeftNode));
                rightChildBtn.setText(edge.getGraphEdges().get(nextRigntNode));

                // Устанавливаем текст для Label - родитель двух кнопок, которые являются потомками
                currentNodeLabel.setText("");
                currentNodeLabel.setText(hash.GetVerticiesByStrId(hash.getGraphVerticies(), selectedItem) + " " + hash.getGraphVerticies().get(selectedItem));

                showExplanation(explanationLabel, selectedItem);
            }
            else {
                System.out.println("Дальнейшей детализации не предусмотрено");
            }
            if (hash.getGraphVerticies().get(selectedItem).contains("Тип:")) {
                String text = hash.getGraphVerticies().get(selectedItem);

                labelFinal.setText(newLineInLabel(text));
                labelFinal.setTextFill(Color.GREEN);

                Image image = new Image(loadImage(selectedItem));
                imageView.setImage(image);
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        labelFinal.setText("");

        Hash hash = new Hash();

        int size = 112;
        TreeItem<String> root = new TreeItem<>("0 " + hash.getGraphVerticies().get("0"));

        root.setExpanded(true);
        treeView.setRoot(root);

        // Создание всех будущих вершин TreeView
        TreeItem<String>[] arrayy = new TreeItem[size];
        for(int i = 1; i <= size - 1; i++) {
            arrayy[i] = new TreeItem<>(i + " " + hash.getGraphVerticies().get(String.valueOf(i)));
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
        arrayy[8].getChildren().add(arrayy[17]);        arrayy[8].getChildren().add(arrayy[18]);
        arrayy[9].getChildren().add(arrayy[19]);        arrayy[9].getChildren().add(arrayy[20]);
        arrayy[10].getChildren().add(arrayy[21]);       arrayy[10].getChildren().add(arrayy[22]);
        arrayy[11].getChildren().add(arrayy[23]);       arrayy[11].getChildren().add(arrayy[24]);
        arrayy[12].getChildren().add(arrayy[25]);       arrayy[12].getChildren().add(arrayy[26]);

        arrayy[13].getChildren().add(arrayy[27]);       arrayy[13].getChildren().add(arrayy[28]);
        arrayy[14].getChildren().add(arrayy[29]);       arrayy[14].getChildren().add(arrayy[30]);

        arrayy[18].getChildren().add(arrayy[31]);       arrayy[18].getChildren().add(arrayy[32]);

        arrayy[22].getChildren().add(arrayy[33]);       arrayy[22].getChildren().add(arrayy[34]);
        arrayy[26].getChildren().add(arrayy[35]);       arrayy[26].getChildren().add(arrayy[36]);
        arrayy[27].getChildren().add(arrayy[37]);       arrayy[27].getChildren().add(arrayy[38]);

        arrayy[28].getChildren().add(arrayy[39]);       arrayy[28].getChildren().add(arrayy[40]);
        arrayy[29].getChildren().add(arrayy[41]);       arrayy[29].getChildren().add(arrayy[42]);
        arrayy[30].getChildren().add(arrayy[43]);       arrayy[30].getChildren().add(arrayy[44]);
        arrayy[38].getChildren().add(arrayy[45]);       arrayy[38].getChildren().add(arrayy[46]);
        arrayy[40].getChildren().add(arrayy[47]);       arrayy[40].getChildren().add(arrayy[48]);
        arrayy[41].getChildren().add(arrayy[49]);       arrayy[41].getChildren().add(arrayy[50]);
        arrayy[42].getChildren().add(arrayy[51]);       arrayy[42].getChildren().add(arrayy[52]);
        arrayy[44].getChildren().add(arrayy[53]);       arrayy[44].getChildren().add(arrayy[54]);

        arrayy[47].getChildren().add(arrayy[55]);       arrayy[47].getChildren().add(arrayy[56]);
        arrayy[48].getChildren().add(arrayy[57]);       arrayy[48].getChildren().add(arrayy[58]);
        arrayy[50].getChildren().add(arrayy[59]);       arrayy[50].getChildren().add(arrayy[60]);
        arrayy[52].getChildren().add(arrayy[61]);       arrayy[52].getChildren().add(arrayy[62]);
        arrayy[53].getChildren().add(arrayy[63]);       arrayy[53].getChildren().add(arrayy[64]);
        arrayy[54].getChildren().add(arrayy[65]);       arrayy[54].getChildren().add(arrayy[66]);
        arrayy[56].getChildren().add(arrayy[67]);       arrayy[56].getChildren().add(arrayy[68]);
        arrayy[58].getChildren().add(arrayy[69]);       arrayy[58].getChildren().add(arrayy[70]);
        arrayy[59].getChildren().add(arrayy[71]);       arrayy[59].getChildren().add(arrayy[72]);
        arrayy[60].getChildren().add(arrayy[73]);       arrayy[60].getChildren().add(arrayy[74]);
        arrayy[61].getChildren().add(arrayy[75]);       arrayy[61].getChildren().add(arrayy[76]);
        arrayy[62].getChildren().add(arrayy[77]);       arrayy[62].getChildren().add(arrayy[78]);
        arrayy[63].getChildren().add(arrayy[79]);       arrayy[63].getChildren().add(arrayy[80]);
        arrayy[64].getChildren().add(arrayy[81]);       arrayy[64].getChildren().add(arrayy[82]);
        arrayy[65].getChildren().add(arrayy[83]);       arrayy[65].getChildren().add(arrayy[84]);
        arrayy[66].getChildren().add(arrayy[85]);       arrayy[66].getChildren().add(arrayy[86]);
        arrayy[72].getChildren().add(arrayy[87]);       arrayy[72].getChildren().add(arrayy[88]);
        arrayy[74].getChildren().add(arrayy[89]);       arrayy[74].getChildren().add(arrayy[90]);
        arrayy[76].getChildren().add(arrayy[91]);       arrayy[76].getChildren().add(arrayy[92]);
        arrayy[78].getChildren().add(arrayy[93]);       arrayy[78].getChildren().add(arrayy[94]);

        arrayy[79].getChildren().add(arrayy[95]);       arrayy[79].getChildren().add(arrayy[96]);
        arrayy[80].getChildren().add(arrayy[97]);       arrayy[80].getChildren().add(arrayy[98]);
        arrayy[81].getChildren().add(arrayy[99]);       arrayy[81].getChildren().add(arrayy[100]);
        arrayy[82].getChildren().add(arrayy[101]);       arrayy[82].getChildren().add(arrayy[102]);
        arrayy[83].getChildren().add(arrayy[103]);       arrayy[83].getChildren().add(arrayy[104]);
        arrayy[84].getChildren().add(arrayy[105]);       arrayy[84].getChildren().add(arrayy[106]);
        arrayy[85].getChildren().add(arrayy[107]);       arrayy[85].getChildren().add(arrayy[108]);
        arrayy[86].getChildren().add(arrayy[109]);       arrayy[86].getChildren().add(arrayy[110]);



        Label explanationLabel = new Label("Label"); // Label для Explanation Form
        showExplanation(explanationLabel, findFirstNumber(root.getValue())); //Вывод объяснения для каждого ребра графа

        //Первые 2 потомка нулевой вершины
        FirstComboBox.getItems().add(root.getValue());

        FirstComboBox.setOnAction(event -> {
            String selectedItem = FirstComboBox.getValue();
            // Находим TreeItem по выбранному элементу в первом ComboBox
            TreeItem<String> selectedItemInTree = findTreeItem(root, selectedItem);
            System.out.println(selectedItem);
            // Очищаем второй ComboBox перед добавлением новых элементов
            SecondComboBox.getItems().clear();
            // Добавляем потомков выбранного элемента во второй ComboBox
            if (selectedItemInTree != null) {
                for (TreeItem<String> child : selectedItemInTree.getChildren()) {
                    SecondComboBox.getItems().add(child.getValue());

//                    labelQuestion.setText("");
//                    labelQuestion.setText(h.graphVerticies.get(selectedItem));
                }

                showExplanation(explanationLabel, selectedItem);
            }
        });

        SecondComboBox.setOnAction(event -> {
            String selectedItem = SecondComboBox.getValue();
            // Находим TreeItem по выбранному элементу во втором ComboBox
            TreeItem<String> selectedItemInTree = findTreeItem(root, selectedItem);
            if (selectedItemInTree != null) {
                FirstComboBox.getItems().add(selectedItem);

//                labelAnswer.setText("");
//                labelAnswer.setText(h.graphVerticies.get(selectedItem));

                showExplanation(explanationLabel, selectedItem);

                String text = SecondComboBox.getValue();

                if(text.contains("Тип:")) {
                    labelFinal.setText(text);
                    labelFinal.setTextFill(Color.GREEN);
                    String comboBoxNumber = selectedItem.substring(0, 2);
                    String comboBoxNumber2 = selectedItem.substring(0, 3);
                    System.out.println(comboBoxNumber);
                    System.out.println(comboBoxNumber2);
                    Image image = new Image(("file:///F:/Java_Project/demo2/src/main/resources/images/" + comboBoxNumber + ".jpg"));
                    System.out.println(selectedItem);
                    imageView.setImage(image);
                    System.out.println(image);
                    System.out.println(comboBoxNumber);
                }
            }
        });

        Edges edge = new Edges();
        currentNodeLabel.setText(root.getValue());

        leftChildBtn.setText(edge.getGraphEdges().get(root.getChildren().getFirst().getValue().substring(0, 1)));
        // Обработчик события левой кнопки для прохода графа
        leftChildBtn.setOnAction((event) -> {
            graphTraversal(leftChildBtn, explanationLabel, root);
        });

        rightChildBtn.setText(edge.getGraphEdges().get(root.getChildren().getLast().getValue().substring(0, 1)));
        // Обработчик события левой кнопки для прохода графа
        rightChildBtn.setOnAction(event -> {
            graphTraversal(rightChildBtn, explanationLabel, root);
        });

        // Обработчик события для "шага назад" в обходе графа
        moveBackBtn.setOnAction(event -> {
            String selectedItem = edge.getHashKeyByValue(edge.getGraphEdges(), rightChildBtn.getText());
            List<TreeItem<String>> selectedItemInTree = findNode(root, selectedItem + " " + hash.getGraphVerticies().get(selectedItem));
            for (TreeItem<String> child : selectedItemInTree) {
                if (child.getParent().getParent() != null) {
                    String prevParent = child.getParent().getParent().getValue();
                    String prevLeftNode = findFirstNumber(child.getParent().getParent().getChildren().getFirst().getValue());//.getValue().substring(0, 2);
                    String prevRigntNode = findFirstNumber(child.getParent().getParent().getChildren().getLast().getValue());//.getValue().substring(0, 2);

                    imageView.setImage(null);
                    labelFinal.setText("");

                    leftChildBtn.setText(edge.getGraphEdges().get(prevLeftNode));
                    rightChildBtn.setText(edge.getGraphEdges().get(prevRigntNode));

                    currentNodeLabel.setText("");
                    currentNodeLabel.setText(prevParent);

                    showExplanation(explanationLabel, findFirstNumber(prevParent));
                }
                else {
                    System.out.println("Шаг назад недоступен, у данных потомков отсутствует родитель, с которого можно начать обход");
                }
            }
        });

        showAllTreeNodes.setOnAction(e -> {
            FXMLLoader fxmlLoader1 = new FXMLLoader(TrainingProgramApplication.class.getResource("AllTreeNodes.fxml"));
            Scene scene2;
            try {
                scene2 = new Scene(fxmlLoader1.load(), 600, 400);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            Stage stage = new Stage();
            stage.setTitle("AllTreeNodes");
            stage.setScene(scene2);
            stage.show();
        });

        explanationButton.setOnAction(e -> {
            Stage stage = new Stage();
            stage.setTitle("Explanation");
            Scene scene = new Scene(new Group(), 400, 200);
            ((Group) scene.getRoot()).getChildren().addAll(explanationLabel);
            stage.setScene(scene);
            stage.show();
        });
    }
}