package defaultmethods;

//default methods are introduced to avoid the implementation new implemented class of the child class
public interface DefaultMethod {

    String doSomething();

    default String help(){
        return "Plese helpp me !!";
    }
}
