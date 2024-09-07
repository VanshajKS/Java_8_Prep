package lambdaExpressions;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

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
    System.out.println("");

}
