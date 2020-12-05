# Topic: *Behavioral Design Patterns*
## Author: *Petici Marina*

## Table of contents
* [Introduction](#introduction)
* [Objectives](#objectives)
* [Implementation](#implementation)
* [Results](#results)
* [Status](#status)

## Introduction

In software engineering, behavioral design patterns have the purpose of identifying common communication patterns between different software entities. By doing so, these patterns increase flexibility in carrying out this communication.

Some examples of this kind of design patterns are :

* Chain of Responsibility
* Command
* Interpreter
* Iterator
* Mediator
* Observer
* Strategy
   
## Objectives

1. By extending your project (Lab#2*), implement appropriate behavioral design patterns:

    * The implemented design pattern should help to perform the tasks involved in your system;
    * The object creation mechanisms/patterns can now be buried into the functionalities instead of using them into the client;
    * There should only be one client for the whole system;

    *[Lab#2](https://github.com/marina01p/SDTM-Labs/tree/main/Lab%232)
  
2. Keep your files grouped (into packages/directories) by their responsibilities;

3. Document your work in a separate markdown file according to the required structure.


## Implementation

### Tools

* Intellij IDEA
* Java SE 15

Implemented behavioral design pattern, for this laboratory work, are:

### Interpreter

Interpreter pattern is used to define a grammatical representation for a language and provides an interpreter to deal with this grammar.
For my project, I decided to create a search bar, in order for clients to check if a certain product or factory is available at the candy store.

In order to implement it, I've created an interface *Expression* (interpreter.Expression), which has one method - public boolean interpret. We pass a string to it.
```
public interface Expression {
    boolean interpret(String context);
}
```
*Interpreter* class, gets the data from *Expression* interface and interprets it 
with the help of method interpret. (Method interpret() takes the data, tokenizes it, loopsthrough and then checks
if it contains the console.input required string and returns true is exists || false if it does not).

```
    public boolean interpret(String str) {
        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
            String test = st.nextToken();
            if(test.matches(String.valueOf(data))) {
                return true;
            }
        } return false;
    }
}
```

In *Main.java* it is displayed with the help of:
```
Expression define = buildInterpreterTree();
```

```
define.interpret(searchProduct) \\ returns true||false
```

## Chain of responsibilities
Chain of responsibility pattern is used to achieve loose coupling in software design where a request from the client is passed to a chain of objects to process them. 
Later, the object in the chain will decide themselves who will be processing the request and whether the request is required to be sent to the next object in the chain or not.

In order to implement it into my candy store, I've created and abstract class *Handler* (chain_of_responsibilities.Handler) with a Handler successor.
```
protected Handler successor;
    
public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
```
Then, I've created a public class, called *Request* (and a public enum *RequestType* where I've stored the commands for every successor (GOOD_REVIEW, BAD_REVIEW)) which sets getters to amount of reviews and type.
    
    ```
    public Request(RequestType requestType, int amount) {
        this.requestType = requestType;
        this.amount = amount;
    }
    ```
Also, I created 2 classes which extends Handle and represent career positions (*Director.java* which deals with good reviews and *VP.java* which deals with bad review and pretentious clients, because has more experience).

## Results

For a user-friendly display, I've created two additional cases in my switch statement ('f' for search bar and 'o' for leaving a review).



If the client input of a product or factory is true, it displays its availability:


![alt text](https://github.com/marina01p/SDTM-Labs/blob/main/Lab%233/screenshots/screenshot1.png)


On the other hand, if the product or factory are nonexistent, it displays its unavailability:


![alt text](https://github.com/marina01p/SDTM-Labs/blob/main/Lab%233/screenshots/screenshot2.png)



If a user rates with stars between range of [3-5], we get a response from our director:



![alt text](https://github.com/marina01p/SDTM-Labs/blob/main/Lab%233/screenshots/screenshot3.png)


If a user rates with stars between range of [3-5], we get a response from our VP:


![alt text](https://github.com/marina01p/SDTM-Labs/blob/main/Lab%233/screenshots/screenshot4.png)
## Status
This project is finished.
