package org.example.demo2;

import javafx.scene.control.TreeItem;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Hash {
    public Hashtable<String, String> graphVerticies = new Hashtable<>();

    Hash() {

        //graphVerticies = this.graphVerticies;
        //this.graphVerticies = graphVerticies;

        graphVerticies.put("0", "Вы планируете тренировать верх или низ тела? ");
        graphVerticies.put("1", "Какая группа мышц: низ или верх ног?");
        graphVerticies.put("2", "Какая группа мышц верха тела: задняя или передняя?");
        graphVerticies.put("3", "Вы предпочитаете тренажер или свободный вес?");
        graphVerticies.put("4", "Класс: бедренная группа мышц. Вы планируете делать упор на переднюю и внешнюю или заднюю и внутреннюю поверхность бедра?");
        graphVerticies.put("5", "Приоритет на нижнюю или верхнюю группу мышц?");
        graphVerticies.put("6", "Мышцы верха или низа тела?");
        graphVerticies.put("7", "Вы хотите тренировать камбаловидную мышцу или трицепс голени?");
        graphVerticies.put("8", "Вы предпочитаете изолированные упражнения или со свободным весом?");
        graphVerticies.put("9", "Вы предпочитаете больший упор на переднюю или внешнюю поверхность бедра?");
        graphVerticies.put("10", "Вы предпочитаете больший упор на внутреннюю или заднюю поверхность бедра?");
        graphVerticies.put("11", "Класс: поясничный отдел. Вы предпочитаете тягу или разгибание поясничного отдела?");
        graphVerticies.put("12", "Класс: ромбовидный отдел. Вы хотите сделать упор на трапециевидные или межлопаточные мышцы?");
        graphVerticies.put("13", "Приоритет на грудную или плечевую группу мышц?");
        graphVerticies.put("14", "Упор на верхний или нижний отдел пресса?");
        graphVerticies.put("15", "Тип: упражнение - подъем на носки сидя в тренажере");
        graphVerticies.put("16", "Тип: упражнение - разгибание голеностопа в пресс-машине");
        graphVerticies.put("17", "Тип: упражнение - подъем на носки стоя с дополнительным весом");
        graphVerticies.put("18", "Вы предпочитаете работу со свободным весом или упражнения на тренажере?");
        graphVerticies.put("19", "Вы предпочитаете статическую нагрузку или динамическую?");
        graphVerticies.put("20", "Вы предпочитаете статическую или динамическую нагрузку?");
        graphVerticies.put("21", "Предпочтение на тренажер или свободный вес?");
        graphVerticies.put("22", "Вы предпочитаете мертвую или классическую станову тягу?");
        graphVerticies.put("23", "Вы предпочитаете статическую или динамическую нагрузку?");
        graphVerticies.put("24", "Статическая или динамическая нагрузка?");
        graphVerticies.put("25", "Свободные веса или тренажер?");
        graphVerticies.put("26", "Класс: грудной отдел. Вы предпочитаете упор на вверх грудной мышцы или на середину/низ?");
        graphVerticies.put("27", "Класс: Дельты. На какую дельту упор: переднюю или среднюю/заднюю");
        graphVerticies.put("28", "Тип: упражнение - сгибание/разгибание корпуса в полуамплитуде на вверх пресса"); // Завершены
        graphVerticies.put("29", "Тип: упражнения - подъем ног в положении лежа"); // Завершены
        graphVerticies.put("30", "Тип: упражнение - присед со штангой?");
        graphVerticies.put("31", "Тип: упражнение - разгибание ног в тренажере");
        graphVerticies.put("32", "Тип: упражнение - удержание ноги в воздухе");
        graphVerticies.put("33", "Тип: упражнение - разведение ног в стороны на приводящей машине");
        graphVerticies.put("34", "Тип: упражнение - сдавливание мяча бедрами");
        graphVerticies.put("35", "Тип: упражнение - сведение ног в приводящей машине");
        graphVerticies.put("36", "Тип: упражнение - сгибание ног в коленном суставе");
        graphVerticies.put("37", "Тип: упражнение - мертвая становая тяга (больший акцент на заднюю поверхность бедра, нежели чем на поясничный отдел)");
        graphVerticies.put("38", "Тип: упражнение - становая тяга изолированно на поясничный отдел");
        graphVerticies.put("39", "Тип: упражнение - удержание поясничного отдела с весом в наклоне");
        graphVerticies.put("40", "Тип: упражнение - гиперэкстензия");
        graphVerticies.put("41", "Тип: упражнение - удержание веса с поднятыми плечами");
        graphVerticies.put("42", "Тип: упражнение - шраги");
        graphVerticies.put("43", "Тип: упражнение - тяга Т-грифа к себе");
        graphVerticies.put("44", "Тип: упражнение - тяга горизонтального блока к себе");
        graphVerticies.put("45", "Предпочтение: штанга или гантели?");
        graphVerticies.put("46", "Больший приоритет идет на середину или низ груди?");
        graphVerticies.put("47", "Каков приоритет в упражнении: сведение или жим?");
        graphVerticies.put("48", "На какую дельту больший приоритет, на среднюю или заднюю?");
        graphVerticies.put("49", "Тип: упражнение - жим штанги на наклонной скамье");
        graphVerticies.put("50", "Тип: упражнение - подъем гантелей вверх по диагонали");
        graphVerticies.put("51", "Тип: упражнение - жим штанги на скамье");
        graphVerticies.put("52", "Каков приоритет в упражнении: жим или сведение в кроссовере");
        graphVerticies.put("53", "Тип: упражнение - сведение гантелей над головой в положении сидя");
        graphVerticies.put("54", "Тип: упражнение - жим штанги на тренажере Скотта");
        graphVerticies.put("55", "Тип: упражнение - махи гантелей в стороны");
        graphVerticies.put("56", "Каков приоритет в упражнении: разведение тренажере или махи в стороны?");
        graphVerticies.put("57", "Тип: упражнение - жим штанги на наклонной скамье головой к низу");
        graphVerticies.put("58", "Тип: упражнение - сведение рук в кроссовере");
        graphVerticies.put("59", "Тип: упражнение - разведение рук в стороны в блочном тренжере");
        graphVerticies.put("60", "Тип: упражнение - махи гантелей в стороны в наклоне");
    }

    public void DisplayAllHash() {
        for(int i = 0; i <= graphVerticies.size() - 1; i++) {
            System.out.println("[" + i + "]" + " " + graphVerticies.get(String.valueOf(i)));
        }
    }

    public void SortHash(Hashtable<String, String> graphVerticies) {
        this.graphVerticies = graphVerticies;
        Set<String> keys = graphVerticies.keySet();
        Iterator<String> itr = keys.iterator();

        // traverse the TreeMap using iterator
        while (itr.hasNext()) {
            String i = itr.next();
            System.out.println(i + " " + graphVerticies.get(i));
        }
    }

    public Set<String> GetElemById(String index) {
        return graphVerticies.keySet();
    }

//    public void GetTreeValue(TreeItem<String> rootTreeNode, String key) {
//        HashMap<String, String> hashMap = new HashMap<>();
//        hashMap.put("key", "value");
//
//        String value = hashMap.get("key");
//
//        if (value != null) {
//            System.out.println("Значение по ключу найдено: " + value);
//        } else {
//            System.out.println("По ключу ничего не найдено");
//        }
//    }

    public void InitializeTreeItem(TreeItem<String> rootTreeNode, String key) {
        TreeItem<String> treeItem = new TreeItem<>();
        treeItem.setExpanded(true);

        String value = graphVerticies.get(key);
        treeItem.setValue(value);

        rootTreeNode.getChildren().add(new TreeItem<String>(key));
    }

    public boolean CheckVerticies(String key) {
        if(graphVerticies.get(key).contains("Тип:")){
            System.out.println("Подстрока найдена");
            return true;
        }else{
            System.out.println("Подстрока не найдена");
        }
        return false;
    }
}
