What is Java 8?

  Java 8 is a newer version of Java that helps us:
  
  Write less code
  
  Write clean code

  Make Java faster and smarter

              
Features in Java8
-------------------
1. Interface Enhancement
2. Functional Interface
3. Lambda Expression
4. Stream API
5. Date & Time API

1. Interface Enhancement

    Default methods

    Static methods


2. Functional Interface

@FunctionalInterface
    interface Calculator {
        int add(int a, int b);
    }



3.Lambda Experssions

    we can write the lambda experssions for functional interface without methodname, not the retun type just with expressio0ns an d parameters
    
    Calculator c = (a, b) -> a + b;
    System.out.println(c.add(5, 10));

4. Stream API
        filter() - reduce

        map()- mapping
        
        sorted() -sorting
        
        collect()- gathering
        
        forEach() - enchamnet of for lop


5. Date & Time API


          LocalDate date = LocalDate.now();
          LocalTime time = LocalTime.now();
          LocalDateTime dateTime = LocalDateTime.now();





Interface Enhancement---------	Default and static methods



Functional Interface---------	  One abstract method interface


Lambda Expression	Shorter-----  function syntax
Stream API	------------------  Functional data processing
Date & Time API	-------------   Modern, thread-safe date handling

   




   


