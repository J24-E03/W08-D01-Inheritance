# Lab Instructions: User and Actor Classes with Inheritance

---

## Objective
In this lab, you will work with the movies lab from the previous lesson (W07-D04-Classes-Objects). You will do the following:
1. Refactor the `Actor` class to extend a new `User` class, which encapsulates shared user attributes and functionality.
2. Enhance the `Movie` class to work seamlessly with the new inheritance structure.
3. Demonstrate the use of inheritance, method overriding, polymorphism, and validation.

---

## Instructions

### Step 1: Create the `User` Class
1. **Define the Class**:
   - Create a new class named `User`

2. **Add Fields**:
   - `name` (String): The user’s name.
   - `age` (int): The user’s age.
   - `email` (String): The user’s email.
   - `userType` (String): The type of user (e.g., "Actor", "Director").

3. **Constructor**:
   - Create a constructor to initialize all fields.
   - Validate the following:
     - `name` should not be null or empty.
     - `age` should be between 0 and 130.
     - `email` should contain an "@" symbol.
   - Print an error message and set default values for invalid data.

4. **Getters and Setters**:
   - Write getters and setters for all fields.
   - Ensure each setter performs validation.

5. **Add Methods**:
   - `void displayUserInfo()`: Print the user’s details in a formatted way.
   - You can also have this be a toString() method

---

### Step 2: Refactor the `Actor` Class
1. **Extend the `User` Class**:
   - Update the `Actor` class to extend the `User` class.

2. **Move Common Attributes**:
   - Remove the `name` and `age` fields from the `Actor` class. These are already provided by the `User` class.

3. **Add Actor-Specific Fields**:
   - Keep the following fields in the `Actor` class:
     - `nationality` (String): The actor’s nationality.
     - `hasWonOscar` (boolean): Whether the actor has won an Oscar.
     - `debutYear` (int): The year the actor made their debut.
     - `movies` (`ArrayList<Movie>`): A list of movies the actor has worked on.

4. **Update the Constructor**:
   - Use the `super` keyword to call the `User` class constructor for shared attributes.
   - Initialize actor-specific fields.

5. **Override `displayUserInfo()`**:
   - Call `super.displayUserInfo()` to display user details.
   - Append actor-specific details such as nationality, Oscar status, debut year, and movies.

---

### Step 3: Modify the `Movie` Class
1. **Update the Actors Field**:
   - Ensure the `actors` field in the `Movie` class is an `ArrayList<Actor>`.

2. **Add/Update Methods**:
   - `void addActorToMovie(Actor actor)`: Add an actor to the movie's `actors` list if not already present.
   - Update any existing methods to account for the new inheritance structure.

---

### Step 4: Testing
1. **Create Objects**:
   - Instantiate a few `User` objects with valid and invalid data.
   - Instantiate a few `Actor` objects using the updated class.

2. **Test Methods**:
   - Add movies to an actor’s `movies` list.
   - Add actors to a movie’s `actors` list.
   - Display actor and movie details using overridden methods.