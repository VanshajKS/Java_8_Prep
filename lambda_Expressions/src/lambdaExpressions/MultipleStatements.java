package lambdaExpressions;

@FunctionalInterface
interface Sayable2{
    String say(String message);
}
public class MultipleStatements {
     public static void main(String[] args){

//         You can pass multiple statements in lambda expression
         Sayable2 person=(message)->{
           String str1="I would like to say,";
           String str2= str1+message;
           return str2;
         };
         System.out.print(person.say("time is precious."));
     }
}
