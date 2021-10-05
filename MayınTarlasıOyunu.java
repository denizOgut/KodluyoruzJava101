package mayıntarlasıoyunu;

import java.util.Random;
import java.util.Scanner;

class MineSweeper {

    int row, column;

    public MineSweeper(int row, int column) {
        this.row = row;
        this.column = column;
    }

    String[][] mineBoard() {

        String array[][] = new String[row][column];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = "-";
            }
        }

        return array;
    }

    String[][] mineBoardWithMines() {
        Random random = new Random();
        int minesNumber = (this.row * this.column) / 4;

        String array[][] = mineBoard();
        while (minesNumber > 0) {
            int randomX = random.nextInt(array.length);
            int randomY = random.nextInt(array[randomX].length);
            if (array[randomX][randomY].equals("-")) {
                array[randomX][randomY] = "*";
                minesNumber--;
            }

        }

        return array;
    }

    void printMineBoard(String[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

    int checkNeighbours(int r, int c, String[][] board) {
        int count = 0;

        for (int x = Math.max(0, r - 1); x <= Math.min(r + 1, board.length - 1); x++) {
            for (int y = Math.max(0, c - 1); y <= Math.min(c + 1, board[0].length - 1); y++) {
                if (x != r || y != c) {

                    if (board[x][y].equals("*")) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    void run() {
        int userRight = (this.row * this.column) - ((this.row * this.column) / 4);
        Scanner sc = new Scanner(System.in);
        String[][] gameBoardHideMines = mineBoard();
        String gameBoard[][] = mineBoardWithMines();
        printMineBoard(gameBoard);
        System.out.println("===========================");
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
        System.out.println(" ");
        printMineBoard(mineBoard());      
        System.out.println(" ");
        while (userRight != 0) {
            System.out.print("Satır Giriniz : ");
            int userRow = sc.nextInt();
            System.out.print("Sütun Giriniz : ");
            int userColumn = sc.nextInt();

            if ((userRow < 0 || userRow > gameBoard.length ) || (userColumn < 0 || userColumn > gameBoard.length )) {
                System.out.println("Hatalı değer girdiniz !!!");
                continue;
            }
            
            if (gameBoard[userRow][userColumn].equals("*")) {
                System.out.println("Mayına Bastınız Oyun Bitti !!");
                break;
            }

            gameBoard[userRow][userColumn] = Integer.toString(checkNeighbours(userRow, userColumn, gameBoard)); 
            gameBoardHideMines[userRow][userColumn] = Integer.toString(checkNeighbours(userRow, userColumn, gameBoard)); 
            printMineBoard(gameBoardHideMines);
            System.out.println("Mayın Sayısı: " + checkNeighbours(userRow, userColumn, gameBoard));
            System.out.println("userRight = " + userRight);
            userRight--;
            
            if (userRight == 0) {
                System.out.println("Tebrikler oyunu kazandınız !!!");
            }
        }

    }

}

public class MayınTarlasıOyunu {

    public static void main(String[] args) {

        MineSweeper ms = new MineSweeper(2, 2);
        ms.run();

    }
}


/*
Oyun Kuralları :


Oyun metin tabanlıdır.


Çift boyutlu diziler üzerinden oynanmalı ve MineSweeper sınıfı içerisinde tasarlanmalı.


Matris boyutunu yani satır ve sütun sayısını kullanıcı belirlemeli.


Diziye ait eleman sayısının çeyreği (elemanSayisi / 4) kadar rastgele mayın yerleştirilmeli. Örneğin dizi 4x3 boyutunda ise eleman sayısı (satırSayısı * sütunSayısı) formülü ile hesaplanmalı ve boyutu 12 olmalı. Bu durumda mayın sayısı 12 / 4 = 3 adet olmalıdır. (ipucu : bu mayınların konumlarını tutacak ikinci bir dizi oluşturabilirsiniz.)


Kullanıcı matris üzerinden bir nokta seçmeli. Nokta seçimi için satır ve sütun değerlerini girmeli.


Seçilen noktanın dizinin sınırları içerisinde olup olmadığını kontrol edilmeli ve koşul sağlanmazsa tekrar nokta istenmeli.


Kullanıcının girdiği noktada mayın var ise oyunu kaybetmeli.


Mayın yok ise, ilgili noktaya değen tüm konumlarına bakılmalı (sağı,solu,yukarısı,aşağısı,sol üst çapraz,sağ üst çapraz,sağ alt çapraz,sol alt çapraz) ve etrafındaki mayınların sayısının toplamı ilgili noktaya yazılmalı. Noktaya değen herhangi bir mayın yok ise "0" değeri atanmalı.


Kullanıcı hiç bir mayına basmadan tüm noktaları seçebilirse oyunu kazanmalı.


*/