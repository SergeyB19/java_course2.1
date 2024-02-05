package com.zaurtregulov.nested_classes.static_nested_class.local_inner_class;

import java.sql.SQLOutput;

public class LocalInner1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult(21, 4);
    }
}

class Math {
    private int a = 10;

    public void getResult(final int delimoe, final int delitel) {
//        int delimoe = 21;
        class Delenie {
          /*  private int delimoe;
            private int delitel;

            public int getDelimoe() {
                return delimoe;
            }*/

/*            public void setDelimoe(int delimoe) {
                this.delimoe = delimoe;
            }*/

/*            public int getDelitel() {
                return delitel;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }*/

            public int getChastnoe() {
                return delimoe / delitel;
            }

            public int getOstatok() {
                System.out.println(a);
                return delimoe % delitel;
            }

        }
        Delenie delenie = new Delenie();
      /*  delenie.setDelimoe(21);
        delenie.setDelitel(4);*/
        System.out.println("delenie = " + delenie);
        System.out.println("delenie.getDelimoe() = " + delimoe);
        System.out.println("delenie.getDelitel() = " + delitel);
        System.out.println("delenie.getChastnoe() = " + delenie.getChastnoe());
        System.out.println("delenie.getOstatok() = " + delenie.getOstatok());
    }
}
