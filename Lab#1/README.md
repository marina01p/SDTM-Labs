# Topic: *Creational Design Patterns*
## Author: *Petici Marina*
## Task:

1. Choose an OO programming language and a suitable IDE or Editor (No frameworks/libs/engines allowed);
2. Select a domain area for the sample project;
3. Define the main involved classes and think about what instantiation mechanisms are needed;
4. Based on the previous point, implement atleast 3 creational design patterns in your project;

## Some Theory:
In software engineering, creational design patterns are a way of structuring code to make it more simple, maintainable and effective.

Some examples of this kind of design patterns are :

   * Singleton
   * Builder
   * Prototype
   * Object Pooling
   * Factory Method
   * Abstract Factory
   
## Implementation & Explanation:

The project is written in Java JDK 15.

Implemented creational design pattern used in this laboratory work are:
  1. Builder
  2. Singleton
  3. Factory Method
  4. Abstract Factory

### Builder
The builder is needed when:
- you want is to avoid using complex constructors (because long lists of parameters are confusing and do not give you much flexibility when creating a class);
- you want to move the construction of complex objects out of the constructor;
- you want to improve code scalability.

For this laboratory work, I created 4 Builders (JellyBeansBuilder.java, LollipopBuilder.java, MintBuilder.java, SourJellyBuilder.java), by that ensuring that I collect all information from 4 already existing classes (JellyBeans.java, Lollipop.java, Mint.java, SourJelly.java) (which I refactored) on the builder objects. 
```
    @Override
    public void setProduct(String productName) {
        this.mint.setProduct(productName);
    }

```
### Abstract Factory

```
public interface AbstractFactory {
    Candy sellCandy(String name);
}
```

### Singleton
```
    public static JellyBellyFactory getJellyBellyFactory() {
        if (jellyBellyFactory == null)
            jellyBellyFactory = new JellyBellyFactory();
        return jellyBellyFactory;
    }
```
### Factory Method
```
switch (product) {
            case "sour jelly":
                SourJellyBuilder sourJellyBuilder = new SourJellyBuilder();
                candySeller.makeHariboSourJelly(sourJellyBuilder);
                return sourJellyBuilder.getProduct();
                ...
            case "mint":
                MintBuilder mintBuilder = new MintBuilder();
                candySeller.makeHariboMint(mintBuilder);
                return mintBuilder.getProduct();
                default:
                    return  null;
                  }
```
## Results/Screenshots/Conclusions:
Main Online Candy Store Screen:
![alt text](https://github.com/marina01p/SDTM-Labs/blob/main/Lab%231/Screeshots/screen_1.png)


Searching for a product:
![alt text](https://github.com/marina01p/SDTM-Labs/blob/main/Lab%231/Screeshots/screen_2.png)


Buying hte product:
![alt text](https://github.com/marina01p/SDTM-Labs/blob/main/Lab%231/Screeshots/screen_3.png)
