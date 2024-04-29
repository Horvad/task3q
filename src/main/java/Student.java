public class Student {
    private static final int BASE_COEF = 6;

    public double def(float x){
        double value = 100;
        if(x>BASE_COEF){
            value *=1+(BASE_COEF/10.0);
        };
        return value;
    }
}
