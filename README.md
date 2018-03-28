# music-theory-trainer

A command line quiz to test your knowledge about:
* Major keys

This application will generate all possible questions for every configured key. Take a look at [the configuration](#configuration) and [how to run the application](#running).

## Questions
All questions are in eu.wiessenberg.quiz.questions and currently support:

* Guess the amount of flats and sharps for a given major key
* Enter all accidentals for a given major key
* Enter the keys that have the given note
* Guess the key given the list of accidentals
* Guess the degree of one of the seven modes
* Guess the name of one of the seven modes given the degree

# <a name="configuration">Configuration
enter the keys you want to learn in the [app.properties](src/test/resources/app.properties) file.  

# Compile
`
mvn clean package
`

# <a name="running">Running
Run the Main class with an optional amount of questions. For example:

`
java eu.wiessenberg.Main
`

will run the quiz with 10 questions, as:

`
java eu.wiessenberg.Main 50
`

will run the quiz with 50 questions (as long as the sum of all possible generated questions is 50 or more...)
