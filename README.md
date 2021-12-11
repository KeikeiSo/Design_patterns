# Design_patterns
I practice and keep the design patterns I learnt here.

The description of a design pattern includes a name, a description of the design problem or context it addresses, a solution template, and a discussion of the consequences of applying the pattern.


## Observer
- when you want many object to observe some data
- note that model will store a list of observers objects
- and you should decide what parameter should be passed to the callback methods

## TemplateMethod
- when you want a behavior(method) be fixed for all subclasses of an AbstractClass(whose constructor must be protected)
- note that the method should be final and should use abstract method(s) if it has custom step(s)
### Liskov substitution principle (LSP)
subclasses should not restrict what client of superclass can do with an instance
#### methods of subclasses **cannot**:
- have stricter preconditions
- have less strict postconditions
- take more specific types as parameter
- make the method less accessible
- throw more checked exceptions
- have a less specific return type

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
- when you want to support a interchangeable family of algorithm 
### Interface Segregation Principle(ISP)
client code should not be forced to depend on interfaces it does not need

## Iterator
- when you want to access an internal collection without violating encapsulation and information hiding properties


# Antipatterns

## PRIMITIVE OBSESSION
- tendency to use primitive types to represent other abstraction

## INAPPROPRIATE INTIMACY
- interact too much with individual instances variables inside an object



