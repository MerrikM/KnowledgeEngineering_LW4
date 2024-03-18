package org.example.demo2;

import java.util.Hashtable;

public class Explanation {
    public Hashtable<String, String> explanation = new Hashtable<>();
    Explanation() {
        explanation.put("0", "Если вы планируете тренировать верх тела, то переход к вершине “1”, если низ тела, то переход к вершине “2”.");
        explanation.put("1", "Если группа мышц: низ или верх ног, то переход к вершине 3 в случае первого варианта и к вершине 4 в случае второго варианта.");
        explanation.put("2", "Если группа мышц верха тела задняя, то переход к вершине “5“, если передняя, то переход к вершине “6“");
        explanation.put("3", "Если предпочитаете тренажер, то переход к вершине “7”, если свободный вес, то переход к вершине “8”.");
        explanation.put("4", "Если вы планируете делать упор на переднюю и внешнюю поверхность бедра, то переход к вершине “9”, если заднюю и внутреннюю поверхность бедра, то переход к вершине “10”");
        explanation.put("5", "Если приоритет на нижнюю группу мышца, то переход к вершине “11”, если на верхнюю группу мышц, то переход к вершине “12”.");
        explanation.put("6", "Если мышцы верха тела, то переход к вершине “13”, если низ тела, то переход к вершине “14”.");
        explanation.put("7", "Если вы хотите тренировать камбаловидную мышцу, то тип упражнения - подъем на носки сидя в тренажере (вершина 7), если трицепс голени, то тип упражнения - разгибание голеностопа в пресс-машине (вершина 16).");
        explanation.put("15", "Установлено, что тип упражнения - подъем на носки сидя в тренажере. Дальнейшей детализации в данном примере не предусмотрено.");
        explanation.put("16", "Установлено, что тип упражнения - разгибание голеностопа в пресс-машине. Дальнейшей детализации в данном примере не предусмотрено.");
        explanation.put("8", "Если вы предпочитаете изолированные упражнения, то тип упражнения - подъем на носки стоя с дополнительным весом, если вы предпочитаете свободный вес, то тип упражнения - присед со штангой.");
        explanation.put("17", "Установлено, что тип упражнения - подъем на носки стоя с дополнительным весом. Дальнейшей детализации в данном примере не предусмотрено.");
        explanation.put("9", "Если вы предпочитаете больший упор на переднюю поверхность бедра, то переход к вершине “18”, если упор внешнюю поверхность бедра, то переход к вершине “19”.");
        explanation.put("10", "Если вы предпочитаете больший упор на внутреннюю поверхность бедра, то переход к вершине “20”, если на заднюю поверхность бедра, то прехед к вершине “21”.");
        explanation.put( "11", "Если вы предпочитаете тягу поясничного отдела, то переход к вершине “22”, разгибание поясничного отдела, то переход к вершине “23”.");
        explanation.put( "12", "Если вы хотите сделать упор на трапециевидные мышцы, то переход к вершине “24”, если на межлопаточные мышцы, то переход к вершине “25”.");
        explanation.put( "13", "Если приоритет на грудную группу мышц, то переход к вершине “26”, если на плечевую группу мышц, то переход к вершине “27”.");
        explanation.put( "14", "Если упор на верхний отдела пресса, то тип упражнения - сгибание/разгибание корпуса в полуамплитуде на вверх пресса, если на нижний отдел пресса, то тип упражнения - подъем ног в положении лежа.");
        explanation.put( "28", "Установлено, что тип упражнения - сгибание/разгибание корпуса в полуамплитуде на вверх пресса. Дальнейшей детализации в данном примере не предусмотрено.");
        explanation.put( "29",	"Установлено, что тип упражнения - подъем ног в положении лежа. Дальнейшей детализации в данном примере не предусмотрено.");
        explanation.put( "18",	"Если вы предпочитаете работу со свободным весом, то тип упражнения - присед со штангой, если на тренажере, то тип упражнения - разгибание ног в тренажере.");
        explanation.put( "30",	"Установлено, что тип: упражнения - присед со штангой. Дальнейшей детализации в данном примере не предусмотрено.");
        explanation.put( "31",	"Установлено, что тип: упражнения - разгибание ног в тренажере. Дальнейшей детализации в данном примере не предусмотрено.");
        explanation.put( "19",	"Если вы предпочитаете статическую нагрузку, то тип упражнения - удержание ноги в воздухе, если динамическую, то тип упражнения - разведение ног в стороны на приводящей машине");
        explanation.put("32",	"Установлено, что тип: упражнения - удержание ноги в воздухе. Дальнейшей детализации в данном примере не предусмотрено.");
        explanation.put( "33",	"Установлено, что тип упражнения - разведение ног в стороны на приводящей машине. Дальнейшей детализации в данном примере не предусмотрено.");
        explanation.put("20",	"Если вы предпочитаете статическую нагрузку, то тип упражнения - сдавливание мяча бедрами, если динамическую нагрузку, то тип упражнения - сведение ног в приводящей машине.");
        explanation.put( "34",	"Установлено, что тип упражнения - сдавливание мяча бедрами. Дальнейшей детализации в данном примере не предусмотрено.");
        explanation.put("35",	"Установлено, что тип упражнения - сведение ног в приводящей машине. Дальнейшей детализации в данном примере не предусмотрено.");
        explanation.put("21",	"Если вы предпочтение тренажер, то тип упражнения - сгибание ног в коленном сустав, если свободный вес, то тип упражнения - мертвая становая тяга.");
        explanation.put("36",	"Установлено, что тип упражнения - сгибание ног в коленном суставе. Дальнейшей детализации в данном примере не предусмотрено.");
        explanation.put("22",	"Если вы предпочитаете мертвую становую тягу, то тип упражнения - мертвая становая тяга (больший акцент на заднюю поверхность бедра, нежели чем на поясничный отдел), если классическую становую тягу, то тип упражнения - становая тяга изолированно на поясничный отдел.");
        explanation.put("37",	"Установлено, что тип упражнения - мертвая становая тяга (больший акцент на заднюю поверхность бедра, нежели чем на поясничный отдел). Дальнейшей детализации в данном примере не предусмотрено.");
        explanation.put("38",	"Установлено, что тип упражнения - становая тяга изолированно на поясничный отдел. Дальнейшей детализации в данном примере не предусмотрено.");
        explanation.put("23",	"Если, вы предпочитаете статическую нагрузку, то тип упражнения - удержание поясничного отдела с весом в наклоне, если динамическую нагрузку, то тип упражнения - гиперэкстензия.");
        explanation.put("39",	"Установлено, что тип упражнения - удержание поясничного отдела с весом в наклоне. Дальнейшей детализации в данном примере не предусмотрено.");
        explanation.put("40",	"Установлено, что тип упражнения - гиперэкстензия. Дальнейшей детализации в данном примере не предусмотрено.");
        explanation.put("24",	"Если вы предпочитаете статическую нагрузку, то тип упражнения - удержание веса с поднятыми плечами, если динамическую нагрузку, то тип упражнения - шраги.");
        explanation.put("41",	"Установлено, что тип упражнения - удержание веса с поднятыми плечами. Дальнейшей детализации в данном примере не предусмотрено.");
        explanation.put("42",	"Установлено, что тип упражнения - шраги. Дальнейшей детализации в данном примере не предусмотрено.");
        explanation.put( "25",	"Если свободные веса, то тип упражнения - тяга Т-грифа к себе, если тренажер, то тип упражнения - тяга горизонтального блока к себе.");
        explanation.put( "43",	"Установлено, что тип упражнения - тяга Т-грифа к себе. Дальнейшей детализации в данном примере не предусмотрено.");
        explanation.put( "44",	"Установлено, что тип упражнения - тяга горизонтального блока к себе. Дальнейшей детализации в данном примере не предусмотрено.");
        explanation.put( "26",	"Если вы предпочитаете упор на верх грудной мышцы, то переход к вершине “45”, если на середину/низ, то переход к вершине “46”.");
        explanation.put( "27",	"Если упор на переднюю дельту, то переход к вершине “47”, если на среднюю/заднюю, то переход к вершине “48”.");
        explanation.put( "45",	"Если предпочтение штанга, то тип упражнения - жим штанги на наклонной скамье, если гантели, то тип упражнения - подъем гантелей вверх по диагонали.");
        explanation.put( "49",	"Установлено, что тип упражнения - жим штанги на наклонной скамье. Дальнейшей детализации в данном примере не предусмотрено.");
        explanation.put( "50",	"Установлено, что тип упражнения - подъем гантелей вверх по диагонали. Дальнейшей детализации в данном примере не предусмотрено.");
        explanation.put( "46",	"Если больший приоритет идет на середину груди, то тип упражнения - жим штанги на скамье, если на низ груди, то переход к вершине “52”.");
        explanation.put( "51",	"Установлено, что тип упражнения - жим штанги на скамье. Дальнейшей детализации в данном примере не предусмотрено.");
        explanation.put("47",	"Если приоритет в упражнении сведение, то тип упражнения - сведение гантелей над головой в положении сидя, если жим, то тип упражнения - жим штанги на тренажере Скотта.");
        explanation.put("53",	"Установлено, что тип упражнения - сведение гантелей над головой в положении сидя. Дальнейшей детализации в данном примере не предусмотрено.");
        explanation.put("54",	"Установлено, что тип упражнения - жим штанги на тренажере Скотта. Дальнейшей детализации в данном примере не предусмотрено.");
        explanation.put("48",	"Если больший приоритет на среднюю дельту, то тип упражнения - махи гантелей в стороны, если на заднюю, то переход к вершине “56”.");
        explanation.put("55",	"Установлено, что тип упражнения - махи гантелей в стороны. Дальнейшей детализации в данном примере не предусмотрено.");
        explanation.put("52",	"Если приоритет в упражнении жим, то тип упражнения - жим штанги на наклонной скамье головой к низу, если на сведение в кроссовере, то тип упражнения - сведение рук в кроссовере.");
        explanation.put("57",	"Установлено, что тип упражнения - жим штанги на наклонной скамье головой к низу. Дальнейшей детализации в данном примере не предусмотрено.");
        explanation.put("58",	"Установлено, что тип упражнения - сведение рук в кроссовере. Дальнейшей детализации в данном примере не предусмотрено.");
        explanation.put("56",	"Если приоритет в упражнении разведение тренажере, то тип упражнения - разведение рук в стороны в блочном тренажере, если махи в стороны, то тип упражнения - махи гантелей в стороны в наклоне.");
        explanation.put("59" ,   "Установлено, что тип упражнения - разведение рук в стороны в блочном тренажере. Дальнейшей детализации в данном примере не предусмотрено.");
        explanation.put("60",	"Установлено, что тип упражнения - махи гантелей в стороны в наклоне. Дальнейшей детализации в данном примере не предусмотрено.");

    }
}
