package main.java.com.java.module;

public class ModuleTask2 {
    public static void main(String[] args) {
        // ПОЗИЦИЯ ГДЕ СТОИТ КОНЬ
        int x = 0;
        int y = 0;
        // ПОЗИЦИЯ ДЛЯ ПРОВЕРКИ МОЖЕТ ЛИ ПОЙТИ КОНЬ СЮДА
        int hodX = 2; //
        int hodY = 1; //
        // ТРУ если может, фолс если нет
        System.out.println(yesOrNo(x,y,hodX,hodY));
    }
    public static boolean yesOrNo(int x, int y, int hodX, int hodY) {
        //Верх влево
        int upLeftX = x - 2;   //x-2  y-1
        int upLeftY = y - 1;
        //вверх вправо
        int upRigthX = x - 2;   //x-2  y+1
        int upRigthY = y + 1;
        //влево вверх
        int leftUpX = x - 1;    //x-1  y-2
        int leftUpY = y - 2;
        //влево вниз
        int leftDownX = x - 1;  //x-1  y+2
        int leftDownY = y + 2;
        //вправо вверх
        int rigthUpX = x - 1;   //x-1  y+2
        int rigthUpY = y + 2;
        //вправо вниз
        int rigthDownX = x + 1; //x+1  y-2
        int rigthDownY = y - 2;
        //вниз влево
        int downLeftX = x + 2;  //x+2  y-1
        int downLeftY = y - 1;
        //вниз вправо
        int downRigthX = x + 2; //x+2  y+1
        int downRigthY = y + 1;

        return (upLeftX == hodX && upLeftY == hodY) || (upRigthX == hodX && upRigthY == hodY) ||
                (leftUpX == hodX && leftUpY == hodY) ||
                (leftDownX == hodX && leftDownY == hodY) ||
                (rigthUpX == hodX && rigthUpY == hodY) ||
                (rigthDownX == hodX && rigthDownY == hodY) ||
                (downLeftX == hodX && downLeftY == hodY) ||
                (downRigthX == hodX && downRigthY == hodY);
    }
}
