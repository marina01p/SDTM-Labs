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

Implemented behavioral design pattern, for this laboratory work, is:

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
## Results

For an user friendly display, I've created an additional in my switch statement.
If the client input of a product or factory is true, it displays its availability:
![alt text](https://github.com/marina01p/SDTM-Labs/blob/main/Lab%233/screenshots/screenshot1.png)

On the other hand, if the product or factory are inexistent, it displays its unavailability:
![alt text](https://github.com/marina01p/SDTM-Labs/blob/main/Lab%233/screenshots/screenshot2.png)


## Status
This project is finished.
