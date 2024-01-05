import java.util.ArrayList;
import java.util.LinkedList;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        Child first = new Child();
        Child second = new Child("Ivan");
       }
}

abstract class  Parent {
    private String name;
    static {
        out.println("Parent:static 1");
    }

    {
        out.println("Parent:instance 1");
    }

    static {
        out.println("Parent:static 2");
    }
    Parent () {
        out.println("Parent:constructor");
    }

    {
        out.println("Parent:instance 2");
    }
    Parent (String name) {
        out.println("Parent:name-constructor");

    }
}
class Child extends Parent {
    static {
        out.println("Child:static 1");
    }

    {
        out.println("Child:instance 1");
    }

    static {
        out.println("Child:static 2");
    }
    Child () {
        out.println("Child:constructor");
    }

    Child (String name) {
        out.println("Child:name-constructor");

    }
    {
        out.println("Child:instance 2");
    }
}