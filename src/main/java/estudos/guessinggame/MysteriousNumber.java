package estudos.guessinggame;

public class MysteriousNumber {
    int number;

    public MysteriousNumber() {
        this.number = generateRandomNumber(1, 999);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    private int generateRandomNumber(int min, int max) {
        int rng = (int) (Math.random() * (max-min));
        return rng;
    }
    
    public void generateAgain() {
        this.number = generateRandomNumber(1, 999);
    }
}
