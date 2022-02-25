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
- `./gradlew run --args="filename true"` to see a random quote printed in terminal. Note that true is not a boolean value, but a string.
to get a random quote you must write true.
- `./gradlew test` to verify tests are working.


## Feature Tasks

### Feature Task 1 (day 1 of lab)

Use the file recentquotes.json to show random popular book quotes. The app should choose one quote each time it is run.


#### Tests for Feature 1
- `appHasValidPrintLine` tests if a quote and author are being accessed from JSON file.
- `appThrowException` tests if an Exception is made when accessing the JSON file. 

#### Interesting concepts

- How to use `GSON`
- What classes to encapsulate when using this functionality.
- How does the `App` class use the classes I write?
- How do I test this functionality?

### Feature Task 2 (day 2 of lab)

Add the ability to access quotes from a thirdparty API. If the request fails, then use the "recentquotes.json" to display a 
random quote instead. Also add the ability to cache the quote accessed from the API in the JSON file to be used for future reference.

#### Tests for Feature 2
- `appTestDataFromApiComparedToLocal` tests to get random quote from api and compares it too locally stored accessed from the json file.

## Resources/Citations

- [GSON User Guide](https://github.com/google/gson/blob/master/UserGuide.md)
- [Quote API](https://favqs.com/api)


