package ResolveExam;

import java.util.Scanner;

public class Python {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        String[] commands = scanner.nextLine().split(", ");
        String[][] field = new String[size][size];
        int[] position = new int[2];
        field = fillField(size, scanner);
        position = getPosition(field);
        int food = 1;
        boolean isEnemy = false;
        for (int command = 0; command < commands.length; command++) {
            switch (commands[command]) {
                case "up":
                    field[position[0]][position[1]] = "*";
                    position[0]--;
                    if(position[0] < 0){
                        position[0] = size - 1;
                    }
                    if(isFood(field, position)) {
                        food++;
                    }
                    if(isEnemy(field, position)){
                        isEnemy = true;
                    }
                    field[position[0]][position[1]] = "s";
                    break;
                case "down":
                    field[position[0]][position[1]] = "*";
                    position[0]++;
                    if(position[0] > size - 1){
                        position[0] = 0;
                    }
                    if(isFood(field, position)) {
                        food++;
                    }
                    if(isEnemy(field, position)){
                        isEnemy = true;
                    }
                    field[position[0]][position[1]] = "s";
                    break;
                case "right":
                    field[position[0]][position[1]] = "*";
                    position[1]++;
                    if(position[1] > size - 1){
                        position[1] = 0;
                    }
                    if(isFood(field, position)) {
                        food++;
                    }
                    if(isEnemy(field, position)){
                        isEnemy = true;
                    }
                    field[position[0]][position[1]] = "s";
                    break;
                case "left":
                    field[position[0]][position[1]] = "*";
                    position[1]--;
                    if(position[1] < 0){
                        position[1] = size - 1;
                    }
                    if(isFood(field, position)) {
                        food++;
                    }
                    if(isEnemy(field, position)){
                        isEnemy = true;
                    }
                    field[position[0]][position[1]] = "s";
                    break;
            }
            if(isEnemy) {
                System.out.println("You lose! Killed by an enemy!");
                return;
            }
            if(noFoodLeft(field)){
                break;
            }
        }
        int countLeftFood = countFood(field);


        if(countLeftFood == 0) {
            System.out.println("You win! Final python length is " + food);
        } else {
            System.out.printf("You lose! There is still %d food to be eaten.", countLeftFood);
        }
    }

    private static int countFood(String[][] field) {
        int count = 0;
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field[row].length; col++) {
                if(field[row][col].equals("f")) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean noFoodLeft(String[][] field) {
        boolean food = false;
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field[row].length; col++) {
                if(field[row][col].equals("f")) {
                 food = true;
                }
            }
        }
        return !food;
    }

    private static boolean isEnemy(String[][] field, int[] position) {
        return field[position[0]][position[1]].equals("e");
    }

    private static boolean isFood(String[][] field, int[] position) {
        if(field[position[0]][position[1]].equals("f")) {
            return true;
        }
        return false;
    }


    private static int[] getPosition(String[][] field) {
        int[] position = new int[2];
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field[row].length; col++) {
                if(field[row][col].equals("s")) {
                    position[0] = row;
                    position[1] = col;
                }
            }
        }
        return position;
    }

    private static String[][] fillField(int size, Scanner scanner) {
        String[][] field = new String[size][size];
        for (int row = 0; row < size; row++) {
            field[row] = scanner.nextLine().split(" ");
        }
        return field;
    }
}
