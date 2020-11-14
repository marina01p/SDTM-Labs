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

The project is written in Java JDK 15.

Implemented structural design pattern used in this laboratory work are:

### Adapter
The adapter pattern convert the interface of a class into another interface clients expect. 
It lets classes work together that couldn’t otherwise because of incompatible interfaces.

In order to implement it in my project, I created an interface *Packet* (domains.packet.Packet), and two classes that implement this interface, located in the same package directory - *GiftBox* and *PlasticBag*. The adapter itself is *PacketAdapter* (utilities.adapter.PacketAdapter).

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
The Decorator pattern is a structural pattern that lets you attach additional functionalities to an object dynamically. 
In other words, the client has the freedom to create an object and then extend it by adding a variety of “features” to it.
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
    private final AbstractFactory furnitureFactory;

    public CandyFacade(AbstractFactory furnitureFactory) {
        this.furnitureFactory = furnitureFactory;
    }
```
## Results


## Status
This project is finished.
