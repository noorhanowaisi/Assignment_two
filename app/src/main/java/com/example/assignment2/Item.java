package com.example.assignment2;


public class Item {
    private final String name;
    private final int imageID;
    private final String description;


    public static final Item[] list = {
            new Item("الدهون والزيوت",R.drawable.oil,"هي من أغذية الطاقة وتوجد في قمة الهرم الغذائي ,هذا النوع من الغذاء يمد الجسم بالطاقة للقيام بمجهود كبير . مثل الزبدة والزيوت "),

            new Item("أغذية البناء ", R.drawable.grow,
                    "تساعد على النمو ,وتعويض الأنسجة التالفة. مثل:اللحوم والحليب ومشتقاته والبيض وبعض البقول الجافة مثل الفاصوليا والعدس والحمص والفول"),

            new Item("أغذية الوقاية", R.drawable.safee,
                    "تعطي الجسم مناعة والوقاية من الأمراض. تشمل الخضراوات والثمار مثل:بندورة, خيار,بطيخ,فراولة"),

            new Item("النشويات والسكريات", R.drawable.choc,
                    "هي من أغذية الطاقة وتوجد في قاع الهرم الغذائي , وتقوم بتزويد الجسم بالطاقة الفورية. مثل: البطاطا والأرز والشوكلاتة"),

    };

    public Item(String name, int imageID, String description) {
        this.name = name;
        this.imageID = imageID;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getImageID() {
        return imageID;
    }

    public String getDescription() {
        return description;
    }

}
