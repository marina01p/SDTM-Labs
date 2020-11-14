# Topic: *Structural Design Patterns*
## Author: *Petici Marina*

## Table of contents
* [Introduction](#introduction)
* [Objectives](#objectives)
* [Implementation](#implementation)
* [Results](#results)
* [Status](#status)

## Introduction

Structural design patterns are concerned with how classes and objects can be composed, to form larger structures. They enable you to create systems without rewriting or customizing the code because these patterns provide the system with enhanced reusability and robust functionality.

Some examples of this kind of design patterns are :

   * Adapter
   * Bridge
   * Composite
   * Decorator
   * Facade
   * Flyweight
   * Proxy
   
## Objectives

1. By extending your project (Lab#1*), implement at least 3 structural design patterns:

    * The implemented design pattern should help to perform the tasks involved in your system;
    * The object creation mechanisms/patterns can now be buried into the functionalities instead of using them into the client;
    * There should only be one client for the whole system;

    *[Lab#1](https://github.com/marina01p/SDTM-Labs/tree/main/Lab%231)
  
2. Keep your files grouped (into packages/directories) by their responsibilities;

3. Document your work in a separate markdown file according to the required structure.


## Implementation

### Tools

* Intellij IDEA
* Java SE 15

Implemented structural design pattern, for this laboratory work, are:

### Adapter

The adapter pattern convert the interface of a class into another interface clients expect. 
It lets classes work together that couldn’t otherwise because of incompatible interfaces.

First, I created an interface (incompatible with my previous one *Candy.java* (domain.candy.Candy)) - *Packet.java* (domain.packet.Packet), and two classes that implement
this interfece, located in the same package. (setComposition() / setConstitution)

Then, I created the adapter itself *PacketAdapter*. It allows my code to have a subcategory in the candy storage, which empowers cliets to buy packages.

```
public class PacketAdapter implements Candy {
    private final Packet pack;

    public PacketAdapter(Packet packet){
        this.pack =  packet;
    }

    @Override
    public String toString() {
        return pack.toString();
    }
```


### Decorator
Decorator pattern allows a user to add new functionality to an existing object without altering its structure. 
This type of design pattern comes under structural pattern as this pattern acts as a wrapper to existing class.


This pattern creates a decorator class which wraps the original class and provides additional functionality keeping class methods signature intact.

```
    private final String customFlavour;

    public FlavourDecorator(AbstractFactory abstractFactory, String customFlavour) {
        super(abstractFactory);
        this.customFlavour = customFlavour;
    }

```

### Facade
Facade pattern hides the complexities of the system and provides an interface to the client using which the client can access the system. 
This type of design pattern comes under structural pattern as this pattern adds an interface to existing system to hide its complexities.

This pattern involves a single class which provides simplified methods required by client and delegates calls to methods of existing system classes.

```
    private final AbstractFactory candyFactory;

    public CandyFacade(AbstractFactory abstractFactory) {
        this.candyFactory = abstractFactory;
    }
```
## Results

Implementing this design patterns into my code empowered me to extend its functionality.

Now with the help of decorator and facade, the client have a special section, with diffrent flavours from different manufacturers.

![alt text](https://github.com/marina01p/SDTM-Labs/blob/main/Lab%232/screenshots/screen-01.png)

Adapter on the other hand, allows the client to choose a package after their shopping is done.
![alt text](https://github.com/marina01p/SDTM-Labs/blob/main/Lab%232/screenshots/screen-02.png)


## Status
This project is finished.
