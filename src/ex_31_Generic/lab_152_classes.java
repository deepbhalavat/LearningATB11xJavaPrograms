package ex_31_Generic;

public class lab_152_classes {
    public static void main(String[] args) {
        GenericClass<Integer> intobref = new GenericClass(5);
        GenericClass<String> Strobref = new GenericClass("Deep");

    }

}

class GenericClass<T>{
    private T data;

    public GenericClass(T data){
        this.data = data;
    }

    public T getData(){
        return this.data;
    }
}
