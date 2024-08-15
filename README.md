
<h1>Key Features of Lombok:</h1>
<h3>Getters and Setters:</h3>

1)With Lombok, you can annotate your class with @Getter and @Setter, and it will automatically generate the getter and setter methods for all the fields in your class.</br>
2)You can also annotate individual fields if you only want specific fields to have getters or setters.

<hr>
<h3>Constructors:</h3>

@NoArgsConstructor, @AllArgsConstructor, and @RequiredArgsConstructor can be used to automatically generate constructors.
@NoArgsConstructor creates a no-argument constructor.
@AllArgsConstructor creates a constructor with all the fields as parameters.
@RequiredArgsConstructor creates a constructor for final fields and fields with @NonNull.
