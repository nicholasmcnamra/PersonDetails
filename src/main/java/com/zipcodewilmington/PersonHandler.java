package com.zipcodewilmington;
import java.util.*;
/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    
    public String whileLoop() {
        StringBuilder result = new StringBuilder();
        // create a `counter`
        int index = 0;
        // while `counter` is less than length of array
        while (index < personArray.length) {
            // begin loop
            // use `counter` to identify the `current Person` in the array
            Person currentPerson = personArray[index];
            // get `string Representation` of `currentPerson`
            String stringRep = currentPerson.toString();
            // append `stringRepresentation` to `result` variable
            result.append(stringRep);
            index += 1;
        }
            // end loop
        return result.toString();
    }



    public String forLoop() {
        StringBuilder result = new StringBuilder();
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
        // begin loop
        for (int i = 0; i < personArray.length; i++) {
            // use `counter` to identify the `current Person` in the array
            Person currentPerson = personArray[i];
            // get `string Representation` of `currentPerson`
            String stringRep = currentPerson.toString();
            // append `stringRepresentation` to `result` variable
            result.append(stringRep);
        }





            // end loop

        return result.toString();
    }



    public String forEachLoop() {
        StringBuilder result = new StringBuilder();
        Person[] people = personArray;
        // identify array's type
        // identify array's variable-name


        // use the above discoveries to declare for-each-loop signature
        // begin loop
        for (Person person : people) {
            // get `string Representation` of `currentPerson`
            String stringRep = person.toString();
            // append `stringRepresentation` to `result` variable
            result.append(stringRep);
        }



            // end loop

        return result.toString();
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
