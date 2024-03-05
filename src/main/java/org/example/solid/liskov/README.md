In the Open/Closed example, we followed Liskov Substitution Principle, which means, that we mustn't change the behaviour of the subclass.
If client expects to get true or false, and it is implemented in the way that it returns only true or false in the parent class, we must 
retain this behaviour, and return only true or false. 
In the example, I throw the exception in the subclass, but in the parent class it doesn't throw any. This example clearly shows not following 
third principle of SOLID. 