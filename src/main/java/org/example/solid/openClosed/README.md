In this example, I demonstrated using of Open/Closed principle, which stands for Open for Extension and Closed for Modifying. 
If we want to make some changes, we should extend this class and modify our code there.
Also, inside our subclass we shouldn't change the behaviour, for instance, if the method inside the parent class returns true 
or false, we shouldn't throw any exceptions, if inside parent class it doesn't. We follow these rules, in order to avoid some
error in future. 