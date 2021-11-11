# Design_patterns
I practice and keep the design patterns I learnt here.

The description of a design pattern includes a name, a description of the design problem or context it addresses, a solution template, and a discussion of the consequences of applying the pattern.


## TemplateMethod
- when you want a behavior(method) be fixed for all subclasses of an AbstractClass(construtor is protected)
- note that the method should be final and should use abstract method(s) if it has custom step(s)

## Command
- When you want the functionality of undoing and redoing
- be careful not to break the encapsulation of classes simply to allow command objects to operate on target objects
### Law of Demeter
i.e.provide intermediate service so that the internal objects encapsolated do not have to be accessed
#### the code of method should only access:
- the instance variable of its implicit parameter
- the argument passed to the method
- any new object created within the method
- gobally available variables

## Prototype
- when you want to initialize some internal structure whose type may not be known at complie time
- it use polymorphic copying

## Decorator
- when you want to add functionality but don't want to change the whole interface

## Composite
- when you want a group of objects be manipulated the same way as single objects
- will not ensure the code is correct

## Singleton
- when you only want one instance of a stateful object

## Flyweight
- when you want every instance of an object is unique

## NullObject
- when you want a way to represent object have no value
- no need to create a seperate class of null but rather just use the one created in the interface

## Strategy
- when you want a method be able to apply to a group of object with similar functionality
### Interface Segregation Principle(ISP)
client code should not be forced to depend on interfaces it does not need

## Iterator
- when you want to access an internal collection without violating encapsulation and information hiding properties
