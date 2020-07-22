public class GreenCellsInNextGeneration {

    public int countGreenCellsInGenerations(int[][] firstGen, int x1, int y1, int n) {
        int countGreenCellInGen = 0;
        int[][] nextGeneration = firstGen;
        GenerationN generationN = new GenerationN ();

        for (int i = 0; i < n; i++) {
            nextGeneration = generationN.makeTheNextGen(nextGeneration);

            if ( nextGeneration[x1][y1] == 1) {
                countGreenCellInGen++;
            }
        }

        return countGreenCellInGen;
    }
}
