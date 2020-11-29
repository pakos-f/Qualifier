# Qualifier

Imagine a classic scenario – a set of beans that implements the same bean type, and injection points for those beans. 


Usually, when bean type has multiple implementations, you deal with a Java interface type at that point Spring framework 
will throw a NoUniqueBeanDefinitionException. 

This is because Spring doesn't know which bean to inject. 
To avoid this problem, there are several solutions.


By using the @Qualifier annotation, we can eliminate the issue of which bean needs to be injected.
