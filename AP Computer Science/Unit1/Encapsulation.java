package Unit1;

public class Encapsulation
{
    /**
     * Reasons why to use private methods
     * 
     * In order to add something, a private method can ALWAYS be changed safely, 
     * because you know for sure that is called only from the own class, 
     * no external classes are able to call a private method 
     * (they can't even see it).
     * 
     * So having a private method is always good as you know there is no 
     * problem about changing it, even you can safely add more parameters to 
     * the method.
     * 
     * Now think of a public method, anyone could call that method,
     * so if you add/remove a parameter, you will need to change also 
     * ALL the calls to that method.
     * 
     * Always ask youself, does this need to be public???
     * 
     * Constant fields - its ok to be public
     * 
     * http://stackoverflow.com/questions/7749052/private-methods-over-public-methods
     */
    
    
    /**
     * Public vs no modifier
     * 
     * A class may be declared with the modifier public, 
     * in which case that class is visible to all classes everywhere. 
     * 
     * If a class has no modifier (the default, also known as package-private), 
     * it is visible only within its own package 
     * 
     * https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
     */
    
    
    
    /**
     * Access
     * public - class, package, world
     * protected - class, package, subclass  (will learn more about later)
     * no modifier - class, package
     * private - class
     * 
     */
    
    
    /**
     * black box
     * 
     * A SUBROUTINE CONSISTS OF INSTRUCTIONS for performing some task, 
     * chunked together and given a name. "Chunking" allows you to deal with a 
     * potentially very complicated task as a single concept. 
     * Instead of worrying about the many, many steps that the computer might 
     * have to go though to perform that task, you just need to remember the 
     * name of the subroutine. Whenever you want your program to perform the task, 
     * you just call the subroutine. Subroutines are a major tool for dealing with 
     * complexity.
     * 
     * A subroutine is sometimes said to be a "black box" because you can't see 
     * what's "inside" it (or, to be more precise, you usually don't want to see 
     * inside it, because then you would have to deal with all the complexity that 
     * the subroutine is meant to hide). Of course, a black box that has no way of 
     * interacting with the rest of the world would be pretty useless. 
     * A black box needs some kind of interface with the rest of the world, 
     * which allows some interaction between what's inside the box and what's 
     * outside. A physical black box might have buttons on the outside that you can
     * push, dials that you can set, and slots that can be used for passing 
     * information back and forth. Since we are trying to hide complexity, 
     * not create it, we have the first rule of black boxes:
     * 
     * http://math.hws.edu/javanotes/c4/s1.html
     */
    
    
    /**
     * Encapsulation
     * 
     * Encapsulation in Java is a mechanism of wrapping the data (variables) 
     * and code acting on the data (methods) together as as single unit. 
     * In encapsulation the variables of a class will be hidden from other classes,
     * and can be accessed only through the methods of their current class, 
     * therefore it is also known as data hiding.
     * 
     * To achieve encapsulation in Java
     *      Declare the variables of a class as private.
     *      Provide public setter and getter methods to modify and 
     *      view the variables values.
     *      
     * http://www.tutorialspoint.com/java/java_encapsulation.htm
     * 
     * 
     * 
     * 
     */
}