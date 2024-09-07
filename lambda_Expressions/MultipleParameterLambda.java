package lambdaExpressions;

public class MultipleParameterLambda {
    interface  Function1{
        int operation(int a, int b);
    }
    interface  Function2{
        void sayMessage(String message);
    }
    private int operate(int a, int b, Function1 function1){
        return function1.operation(a,b);
    }
    private static void main(String args[]){
        Function1 add=(int x,int y)->x+y;
        Function1 multiply=(int x,int y)->x*y;
    }
    MultipleParameterLambda multipleParameterLambda=new MultipleParameterLambda();
    System.out.println("Addition is"+multipleParameterLambda.operate(6,2,add));
    System.out.println("Multiplication is"+multipleParameterLambda.operate(6,2,multiply));

    Function2 function2=message -> System.out.println("Hello"+message);
    function2.message("MultipleparameterLambda executed");

}
