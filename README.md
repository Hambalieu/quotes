# Quotes

## Contributors

- Shane Roach
- Hambalieu Jallow

## Description

This application returns a random quote by a famous author.

### User Instructions

- Clone the application.
- If running locally `chmod +x gradlew` to gain access.
- `./gradlew run --args="filename false"` to see a quote printed in terminal.
- `./gradlew run --args="filename true"` to see a random quote printed in terminal.
- `./gradlew test` to verify tests are working.


## Feature Tasks

### Feature Task 1

Use the file recentquotes.json to show random popular book quotes. The app should choose one quote each time it is run.


#### Tests for Feature 1
- `appHasValidPrintLine` tests if a quote and author are being accessed from JSON file.
- `appThrowException` tests if an Exception is made when accessing the JSON file. 

#### Interesting concepts

- How to use `GSON`
- What classes to encapsulate when using this functionality.
- How does the `App` class use the classes I write?
- How do I test this functionality?


## Resources/Citations

- [GSON User Guide](https://github.com/google/gson/blob/master/UserGuide.md)



