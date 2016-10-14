/*
 * Java Design Patterns: Decorator
 * Author: Jakub Vojvoda [github.com/JakubVojvoda]
 * 2016
 *
 * Source code is licensed under MIT License
 * (for more details see LICENSE)
 *
 */

package app;

public class Main {
  
  public static void main(String[] args) {
    
    Component component = new ConcreteDecoratorA(
          new ConcreteDecoratorB(new ConcreteComponent()));
            
    component.operation();
  }
}
