package main.java;

public class InvalidDateInputException extends DukeException {
    InvalidDateInputException() {
        super("Invalid date format! Please put it something" +
                "like 2020-12-31 1800 for 31 December 2020 6 pm.");
    }
}
