import java.lang.invoke.StringConcatFactory;

public class testing {
    public static class parent {
        int myMethod(){
            return 500;
        }
    }
    static class  Child extends parent{
        int myMethod(){
            return 1000;
        }
    }
    public static void main(String[] args) {
        parent p  =new parent();
        Child c = new Child();
        System.out.println(p.myMethod());
        System.out.println(c.myMethod());
    }
}
