
<h1>Key Features of Lombok:</h1>
<h3>Getters and Setters:</h3>

1)With Lombok, you can annotate your class with @Getter and @Setter, and it will automatically generate the getter and setter methods for all the fields in your class.</br>
2)You can also annotate individual fields if you only want specific fields to have getters or setters.

<hr>
<h3>Constructors:</h3>

1)@NoArgsConstructor, @AllArgsConstructor, and @RequiredArgsConstructor can be used to automatically generate constructors.</br>
2)@NoArgsConstructor creates a no-argument constructor.</br>
3)@AllArgsConstructor creates a constructor with all the fields as parameters.</br>
4)@RequiredArgsConstructor creates a constructor for final fields and fields with @NonNull.
<hr>
<h3>Benefits of Using Lombok:</h3>
<h5>Reduces Boilerplate Code:</h5> Lombok cuts down on repetitive code, making your classes much cleaner and easier to read.
<h5>Improves Maintainability:</h5> By reducing the amount of code, there is less to maintain and fewer opportunities for bugs to be introduced.
<h5>Encourages Best Practices:</h5> Lombok encourages the use of best practices like immutability and the builder pattern, which can lead to more robust code.
<hr>

<h3>Setting Up Lombok:</h3>
To use Lombok, you need to add it as a dependency in your project. For example, in a Maven project

