public class Fibonacci {
    public int fibonacci(int indexNum) {
        if (indexNum == 0) {
            return 0;
        } else if(indexNum == 1 || indexNum == 2) {
            return 1;
        } else {
            return fibonacci(indexNum - 1) + fibonacci(indexNum - 2);
        }
    }
}
