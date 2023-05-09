public class Number {
    private int number;
    private int quantityOfNumber;

    public Number(int number, int quantityOfNumber) {
        this.number = number;
        this.quantityOfNumber = quantityOfNumber;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getQuantityOfNumber() {
        return quantityOfNumber;
    }

    public void setQuantityOfNumber(int quantityOfNumber) {
        this.quantityOfNumber = quantityOfNumber;
    }

    @Override
    public String toString() {
        return number + " - liczba wystąpień " + quantityOfNumber;
    }
}