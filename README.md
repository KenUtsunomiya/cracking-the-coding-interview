# Cracking the Coding Interview
This is a repository to solve problems from [Cracking the Coding Interview 6th Edition](https://www.amazon.co.jp/-/en/Gayle-Laakmann-McDowell/dp/0984782850) in Java.

## Rules
Check out to your branch and solve problems on it. (e.g. `ken-solve-problems`)


## Solve problems
To solve problem, follw these steps:

1. Navigate to the chapter folder (e.g., `01-arrays-and-strings`).
2. To set up environment, run: 
    ```sh
    make setup DIR=1.1
    ``` 
    Replace `1.1` with the problem number you are to solve.
3. Solve the problem

## Run tests
To run tests for a specific problem, follow these steps:

1. Navigate to the chapter folder (e.g., `01-arrays-and-strings`).
2. To run tests, run:
    ```sh
    make test DIR=1.1
    ```
    Replace `1.1` with the problem number you've solved.

3. This will compile and execute the test file in the specified directory, then clean up the compiled files.
