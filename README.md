# gurutest

This is a starting point for a test of Guru Reviewer integration with Github Actions.

### What's included

- A minimalistic Maven-based Java project with a single class file.
- A minimalistic Github Action that builds the project on every push event.

The above are ready to use, so you can focus on the actual Guru Reviewer setup process.

### How to build the project locally

`mvn package`

### How to run the `App` main class locally

`java -cp target/gurutest-1.0-SNAPSHOT.jar com.guru.App`

### How to run the action on the server side

Simply `git push`. The action will execute `mvn package` every time you do so.

### How to see the action results

1. Go to the Github page for your repo. Click on the *Actions* tab.
1. Click on any workflow run to see the actions that were executed.
1. Click the `My-Action` box to see the run log of that action.

