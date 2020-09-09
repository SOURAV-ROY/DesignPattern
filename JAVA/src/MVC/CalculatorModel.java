package MVC;

public class CalculatorModel {
    private int calculationValue;

    public void addTwoNumber(int firstNumber, int secondNumber) {
        calculationValue = firstNumber + secondNumber;
    }
    public int getCalculationValue(){
        return calculationValue;
    }
}
