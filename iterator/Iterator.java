/*
 * Java Design Patterns: Iterator 
 * Author: Jakub Vojvoda [github.com/JakubVojvoda]
 * 2016
 *
 * Source code is licensed under MIT License
 * (for more details see LICENSE)
 *
 */

package app;

/*
 * Iterator
 * provides the interface that all iterators must implement 
 * and a set of methods for traversing over elements
 */
public interface Iterator {
    
  public void first();
  public void next();
  public boolean isDone();
  public int currentItem();
  // ...
}
