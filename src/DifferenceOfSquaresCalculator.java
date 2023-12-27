
class DifferenceOfSquaresCalculator {
    int computeDifferenceOfSquares(int input) {
        int sum_numbers = 0;
        int sum_squares = 0;
        for(int i=0; i <= input; i++){
            sum_numbers += i;
            sum_squares += i*i;
        }
        return sum_numbers * sum_numbers - sum_squares;
    }
}