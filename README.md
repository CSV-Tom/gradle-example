# Stack project with gradle

An example project from the exercise with productive and test code.
In the following the installation and usage of the gradle wrapper is described.
It is important to distinguish between the **gradle wrapper** and **gradle**.

## What is the difference between using `gradlew` and `gradle`?

The difference lies in the fact that `./gradlew` indicates you are using a __gradle wrapper__. The wrapper is generally part of a project and it automatically includes the installation of gradle.
If you are using gradle without the wrapper you would have to manually install gradle - for example, on a mac brew install gradle and then invoke gradle using the gradle command.
In both cases you are using gradle, but the former solution is more convenient and ensures version consistency across different machines.
The official installation instructions can be found under the following links:

* Install Gradle on Windows : https://docs.gradle.org/4.10.2/userguide/installation.html#microsoft_windows_users_2
* Install Gradle on Linux or Mac OS : https://docs.gradle.org/4.10.2/userguide/installation.html#linux_macos_users_2


__Important:__ Installation is only required if the gradle wrapper not exists in the project directory. The example project already contains a gradle wrapper for Windows and Unix.


## Prepare environment for execution of java programs and gradlew

1. Installation of the __Java Development Kit (JDK)__ is required.
2. After the installation of the JDK open a new console window and enter the command `java -version` in the command line.
   ```
   java version "1.8.0_111"
   Java(TM) SE Runtime Environment (build 1.8.0_111-b14)
   Java HotSpot(TM) 64-Bit Server VM (build 25.111-b14, mixed mode)
   ```
3. Download the sample project as ZIP archives or via git clone from here (https://github.com/CSV-Tom/gradle-example).
4. Unzip the project and change to the root level of the sample project.
5. Execute command `gradlew` or `./gradlew` in the command line. Check that the firewall is not causing you any trouble.
   ```
   Welcome to Gradle 4.10.2!

   Here are the highlights of this release:
    - Incremental Java compilation by default
    - Periodic Gradle caches cleanup
    - Gradle Kotlin DSL 1.0-RC6
    - Nested included builds
    - SNAPSHOT plugin versions in the `plugins {}` block

   For more details see https://docs.gradle.org/4.10.2/release-notes.html
   ```

6. Troubleshooting:
   ```
   ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.

   Please set the JAVA_HOME variable in your environment to match the location of your Java installation.
   ```
   Set JAVA_HOME variable under the system variables in Windows and set the path to the installed JDK.


## Gradle-Wrapper - Example Project for different Operating Systems (OS)

```
.
├── build.gradle
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
├── README.md
├── settings.gradle
└── src
    ├── main
    │   └── java
    └── test
        └── java
```

__Windows__: On Windows, the gradle wrapper can be executed with the following command `gradlew`.

__Unix__: On Linux or Mac OS the gradle wrapper can be executed with the following command `./gradlew`.

To execute the commands, you must first switch to the root level of the sample project, where two scripts `gradlew` or `gradlew.bat` are located. Have a look at the scripts for a better understanding.

__Attention:__ You must be in the root directory of the sample project.


## Gradle-Wrapper - Commands

```
./gradlew
./gradlew --help        # show all parameters of gradle
./gradlew task          # show all gradle tasks

./gradlew eclipse       # geneate eclipse project files. Now you can import gradle project as java project
./gradlew cleanEclipse  # removes all generated eclipse project files

./gradlew clean         # delete all generated files
./gradlew build         # build productive sources
./gradlew test          # run unit tests
./gradlew check         # run all checks
./gradlew javadoc       # generate java doc

./gradlew build test check run
```

## Gradle-Wrapper - Show task dependencies (see for more information help and tasks)

```
./gradlew clean -i
./gradlew build -i
./gradlew test -i
```

## Gradle Wrapper - Show debug information (see for more information help and tasks)

```
./gradlew clean -d
./gradlew build -d
./gradlew test -d
```

# Program Gradle

## Installing Gradle

Manual installation steps for gradle on Linux or Windows

```
cd /tmp
wget https://services.gradle.org/distributions/gradle-4.10.2-bin.zip
sudo mkdir /opt/gradle
sudo unzip -d /opt/gradle gradle-4.10.2-bin.zip
ls /opt/gradle/gradle-4.10.2
export PATH=$PATH:/opt/gradle/gradle-4.10.2/bin
```
So that the program gradle is available in every command line, it can be added to the `.bashrc` or `.profile`.

## Initialise a new project

Initialise a new project about the program **gradle** with a **gradle wrapper** for Linux and Windows:

```
mkdir myproject
cd myproject
gradle init
```

# References

See for more information:

* https://www.tutorialspoint.com/gradle/gradle_build_a_java_project.htm
* https://docs.gradle.org/4.10.2/userguide/gradle_wrapper.html
* https://docs.gradle.org/4.10.2/userguide/installation.html#installation
