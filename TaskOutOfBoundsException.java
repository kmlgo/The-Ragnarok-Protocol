/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package CSAA2;

/**
 *
 * @author user
 */
public class TaskOutOfBoundsException extends Exception {

    /**
     * Creates a new instance of <code>TaskOutOfBoundsException</code> without
     * detail message.
     */
    public TaskOutOfBoundsException() {
    }

    /**
     * Constructs an instance of <code>TaskOutOfBoundsException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public TaskOutOfBoundsException(String msg) {
        super(msg);
    }
}
