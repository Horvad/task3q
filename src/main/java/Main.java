public class Main {
    public static void main(String[] args) {
        Student studentAction = new Student(){
            @Override
            public double def(float x) {
                return super.def(x);
            }
        };
    }
}
