package classesandobjects;

public class NestedClasses {
    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();
        OuterClass.InnerClass innerObj = outerObj.new InnerClass();
        innerObj.printInnerClassMembers();
        innerObj.printOuterClassMembers(outerObj);
        innerObj.callOuterMethod();

        OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();
        staticNestedClass.accessOuterStaticVariableAndMethods();
        staticNestedClass.printOuterClassNonStaticMembersUsingOuterObj(outerObj);

    }
}

class OuterClass {
    private int x=10;
    static int y = 20;

    private int sum(int a,int b){
        return a+b;
    }

    private static int avg(int a,int b){
        return (a+b)/2;
    }

    class InnerClass {
        int x = 65;

        //able to access instance variable of its own class
        void printInnerClassMembers(){
            System.out.println("Inner x: "+this.x);
        }

        //able to access instance variable of its outer class even it is private
        void printOuterClassMembers(OuterClass outer){
            System.out.println("Outer x: "+outer.x);
        }

        //able to access instance methods of its outer class even it is private
        void callOuterMethod(){
            System.out.println("sum(34,56): "+sum(34,56));
        }
    }

    static class StaticNestedClass {

        // able to access non-static variables using  object's reference
        void printOuterClassNonStaticMembersUsingOuterObj(OuterClass outer){
            System.out.println("Outer x: "+outer.x);
        }

        // not able to access non-static variables
        /*
        void printOuterClassNonStaticMembersUsingWithOutObjRef(){
            System.out.println("Outer x: "+x);
        }
        */

        // able to access static variables and methods of outer class
        void accessOuterStaticVariableAndMethods(){
            System.out.println("static y: "+y);
            System.out.println("avg(30,60): "+avg(30,60));
        }
    }
}


