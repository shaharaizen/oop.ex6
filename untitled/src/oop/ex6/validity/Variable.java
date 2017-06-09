package oop.ex6.validity;

public class Variable {

    public enum Type {INT, DOUBLE, STRING, BOOLEAN, CHAR}
    private String name;
    private Type type;
    private boolean assigned;
//    private Object value;

    Variable(String name, Type type, boolean assigned){
        this.name = name;
        this.type = type;
        this.assigned = assigned;
    }

//    Variable(Type type, Object value){
////        this.value = value;
//        this.type = type;
//        assigned = true;
//
//    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(){
        assigned = true;
    }
}