package lets.play.tdd;

public class FizzBuzz {

    public String generateSoundForInput(int i) {
        if(i%3 ==0 && i%5==0) return "FizzBuzz";
        if(i%3 == 0) return "Fizz";
        else if(i%5 == 0) return "Buzz";
        return String.valueOf(i);
    }
}
