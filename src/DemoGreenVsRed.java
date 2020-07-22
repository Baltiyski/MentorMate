import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoGreenVsRed {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Take the input from the user
        String input = reader.readLine();

        //Create row and col(x and y) form the first line of the input
        int x = Integer.parseInt(input.split(",")[0]);
        int y = Integer.parseInt(input.split(",")[1]);

        //Creating the first generation from the input
        int[][] firstGen = new int[x][y];
        for (int i = 0; i < x; i++) {
            input = reader.readLine();
            for (int j = 0; j < y; j++) {
                firstGen[i][j] = Integer.parseInt(input.split("")[j]);
            }
        }

        //Last line of the input, taking the coordinates x1 and y1 and generation N
        input = reader.readLine();
        int x1 = Integer.parseInt(input.split(", ")[0]);
        int y1 = Integer.parseInt(input.split(", ")[1]);
        int n = Integer.parseInt(input.split(", ")[2]);

        GreenCellsInNextGeneration greenCellsInNextGeneration = new GreenCellsInNextGeneration();
        System.out.printf("There are %d green cells in each generation", greenCellsInNextGeneration.countGreenCellsInGenerations(firstGen,x1,y1,n));

        //Closing the BufferedReader
        reader.close();
    }
}
