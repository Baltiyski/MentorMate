/*
Creating the Generation N
 */

public class GenerationN {
    private RulesForGenerations rulesForGenerations = new RulesForGenerations ( );

    public int[][] makeTheNextGen ( int[][] array ) {
        int[][] nexGeneration = new int[ array.length ][ array.length ];
        for ( int row = 0 ; row < array.length ; row++ ) {
            for ( int col = 0 ; col < array.length ; col++ ) {
                int countOne = 0;
                if ( col == 0 && row == 0 ) {

                    countOne = topLeftCorner(array, row, col, countOne);

                } else if ( col == array.length - 1 && row == 0 ) {

                    countOne = topRightCorner (array, row, col, countOne);

                } else if ( col == 0 && row == array.length - 1 ) {

                    countOne = bottomLeftCorner (array, row, col, countOne);

                } else if ( col == array.length - 1 && row == array.length - 1 ) {

                    countOne = bottomRightCorner (array, row, col, countOne);

                } else if ( ( col == 0 && row != 0 ) && ( col == 0 && row != array.length - 1 ) ) {

                    countOne = leftMiddleCorner (array, row, col, countOne);

                } else if ( ( col == array.length - 1 && row != 0 ) && ( col == array.length - 1 && row != array.length - 1 ) ) {

                    countOne = rightMiddleCorner (array, row, col, countOne);

                } else if ( ( col != 0 && row == 0 ) && ( col != array.length - 1 && row == 0 ) ) {

                    countOne = topMiddleCorner (array, row, col, countOne);

                } else if ( ( col != 0 && row == array.length - 1 ) && ( col != array.length - 1 && row == array.length - 1 ) ) {

                    countOne = bottomMiddleCorner (array, row, col, countOne);

                } else {
                    countOne = central (array, row, col, countOne);
                }

                nexGeneration[ row ][ col ] = redOrGreen ( array , row , col , countOne );
            }
        }

        return nexGeneration;
    }

    //Changing the Cell to 0 or 1
    private int redOrGreen ( int[][] array , int row , int col , int count ) {
        if ( array[ row ][ col ] == 0 ) {
            if ( count == 3 || count == 6 ) {
                return rulesForGenerations.redToGreen ( );
            }
        } else {
            if ( !( count == 2 || count == 3 || count == 6 ) ) {
                return rulesForGenerations.greenToRed ( );
            }
        }
        return array[ row ][ col ];
    }

    private int topLeftCorner ( int[][] array , int row , int col , int countOne ) {

        if ( array[ row ][ col + 1 ] == 1 ) {
            countOne++;
        }
        if ( array[ row + 1 ][ col ] == 1 ) {
            countOne++;
        }
        if ( array[ row + 1 ][ col + 1 ] == 1 ) {
            countOne++;
        }

        return countOne;
    }

    private int topRightCorner ( int[][] array , int row , int col , int countOne ) {

        if ( array[ row ][ array.length - 2 ] == 1 ) {
            countOne++;
        }
        if ( array[ row + 1 ][ array.length - 2 ] == 1 ) {
            countOne++;
        }
        if ( array[ row + 1 ][ array.length - 1 ] == 1 ) {
            countOne++;
        }

        return countOne;

    }

    private int bottomLeftCorner ( int[][] array , int row , int col , int countOne ) {

        if ( array[ array.length - 2 ][ col ] == 1 ) {
            countOne++;
        }
        if ( array[ array.length - 2 ][ col + 1 ] == 1 ) {
            countOne++;
        }
        if ( array[ row ][ col + 1 ] == 1 ) {
            countOne++;
        }

        return countOne;

    }

    private int bottomRightCorner ( int[][] array , int row , int col , int countOne ) {

        if ( array[ row ][ array.length - 2 ] == 1 ) {
            countOne++;
        }
        if ( array[ row - 1 ][ array.length - 2 ] == 1 ) {
            countOne++;
        }
        if ( array[ row - 1 ][ array.length - 1 ] == 1 ) {
            countOne++;
        }

        return countOne;

    }

    private int leftMiddleCorner ( int[][] array , int row , int col , int countOne ) {

        if ( array[ row - 1 ][ col ] == 1 ) {
            countOne++;
        }
        if ( array[ row - 1 ][ col + 1 ] == 1 ) {
            countOne++;
        }
        if ( array[ row ][ col + 1 ] == 1 ) {
            countOne++;
        }
        if ( array[ row + 1 ][ col ] == 1 ) {
            countOne++;
        }
        if ( array[ row + 1 ][ col + 1 ] == 1 ) {
            countOne++;
        }

        return countOne;

    }

    private int rightMiddleCorner ( int[][] array , int row , int col , int countOne ) {

        if ( array[ row + 1 ][ col ] == 1 ) {
            countOne++;
        }
        if ( array[ row + 1 ][ col - 1 ] == 1 ) {
            countOne++;
        }
        if ( array[ row ][ col - 1 ] == 1 ) {
            countOne++;
        }
        if ( array[ row - 1 ][ col - 1 ] == 1 ) {
            countOne++;
        }
        if ( array[ row - 1 ][ col ] == 1 ) {
            countOne++;
        }

        return countOne;

    }

    private int topMiddleCorner ( int[][] array , int row , int col , int countOne ) {

        if ( array[ row ][ col - 1 ] == 1 ) {
            countOne++;
        }
        if ( array[ row + 1 ][ col - 1 ] == 1 ) {
            countOne++;
        }
        if ( array[ row + 1 ][ col ] == 1 ) {
            countOne++;
        }
        if ( array[ row + 1 ][ col + 1 ] == 1 ) {
            countOne++;
        }
        if ( array[ row ][ col + 1 ] == 1 ) {
            countOne++;
        }

        return countOne;

    }

    private int bottomMiddleCorner ( int[][] array , int row , int col , int countOne ) {

        if ( array[ row ][ col - 1 ] == 1 ) {
            countOne++;
        }
        if ( array[ row - 1 ][ col - 1 ] == 1 ) {
            countOne++;
        }
        if ( array[ row - 1 ][ col ] == 1 ) {
            countOne++;
        }
        if ( array[ row - 1 ][ col + 1 ] == 1 ) {
            countOne++;
        }
        if ( array[ row ][ col + 1 ] == 1 ) {
            countOne++;
        }

        return countOne;

    }

    private int central ( int[][] array , int row , int col , int countOne ) {

        if ( array[ row ][ col - 1 ] == 1 ) {
            countOne++;
        }
        if ( array[ row - 1 ][ col - 1 ] == 1 ) {
            countOne++;
        }
        if ( array[ row - 1 ][ col ] == 1 ) {
            countOne++;
        }
        if ( array[ row - 1 ][ col + 1 ] == 1 ) {
            countOne++;
        }
        if ( array[ row ][ col + 1 ] == 1 ) {
            countOne++;
        }
        if ( array[ row + 1 ][ col + 1 ] == 1 ) {
            countOne++;
        }
        if ( array[ row + 1 ][ col ] == 1 ) {
            countOne++;
        }
        if ( array[ row + 1 ][ col - 1 ] == 1 ) {
            countOne++;
        }

        return countOne;

    }
}