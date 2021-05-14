# gurutest

This is a starting point for a test of Guru Reviewer integration with Github Actions.

### What's included

- A minimalistic Maven-based Java project with a single class file.
- A minimalistic Github Action that builds the project on every push event.

This is ready to use so you can focus on the actual Guru Reviewer setup process.

### How to build the project locally

`mvn package`

### How to run the `App` main class

`java -cp target/gurutest-1.0-SNAPSHOT.jar com.guru.App`

### How to run the Action

Due to the presence of `myaction.yml` in `.github/workflows`, the action will run `mvn package` every time you `push` anything.

