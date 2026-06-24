# Java In-Class Practice Exercises

In the `L3` package, create a new class called `JavaPractice` with a main method.
For each task, an example input and output are given.
Feel free to use the [JavaDocs](https://docs.oracle.com/en/java/javase/25/docs/api/index.html)
as a resource.

## Scanner Setup

Using a `Scanner` object, get an integer `n` from the user.

## Task 1: Printing Numbers

If `n` is 1, have the user enter 2 doubles `a` and `b` and another integer
`m` on separate lines. Print the numbers.

### Example Input:

1

5.5

10.7

15

### Example Output:

a = 5.5, b = 10.7, m = 15

# Task 2: Writing a Math Function

Write a static method called `quadFun` that takes `a`,
`b` (two doubles) and `m` (an integer) as
arguments and returns a double that equals am<sup>2</sup> + b.
If `n` is 2, call `quadFun` with arguments `a`, `b`, and `m`.

### Example Input:

2

4.6

9.5

20

### Example Output:

1849.5

# Task 3: Using Arrays
If `n` is 3, get an int `m` from the user.
1. Create a double array of size `m`.
2. Get `m` doubles from the user and enter these in the array.
3. Using a for loop, print the average of the numbers in the array as a floating-point value with 2 decimal places.
4. Print the contents in reverse order.

### Example Input:

3

4

10.1

20.2

30.5

40.9

### Example Output:

Average = 25.42

arr[3] = 40.9

arr[2] = 30.5

arr[1] = 20.2

arr[0] = 10.1
