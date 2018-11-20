# Stack project with Gradle

## Install Gradle

Installation is only required if the gradle wrapper not exists in project directory.

### Install Gradle on windows

https://docs.gradle.org/4.10.2/userguide/installation.html#microsoft_windows_users_2


### Install Gradle on linux

https://docs.gradle.org/4.10.2/userguide/installation.html#linux_macos_users_2

or

```
cd /tmp
wget https://services.gradle.org/distributions/gradle-4.10.2-bin.zip
sudo mkdir /opt/gradle
sudo unzip -d /opt/gradle gradle-4.10.2-bin.zip
ls /opt/gradle/gradle-4.10.2
export PATH=$PATH:/opt/gradle/gradle-4.10.2/bin     // add to ~/.bashrc or .profile
```

### Create new gradle wrapper project

```
mkdir myproject
cd myproject
gradle init
```

## Gradle-Wrapper - Different Operating Systems (OS)

```
./gradlew.bat  // for Windows
./gradlew      // for Linux & Mac OS
```

## Gradle-Wrapper - Commands

```
./gradlew task          # show all gradle tasks
./gradlew --help        # show all parameters of gradle

./gradlew eclipse       # geneate eclipse project files. Now you can import gradle project as java project
./gradlew cleanEclipse  # removes all generated eclipse project files

./gradlew clean         # delete all generated files
./gradlew build         # build productive sources
./gradlew test          # run unit tests
./gradlew check         # run all checks
./gradlew javadoc       # generate java doc
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

## References

See for more information:

* https://www.tutorialspoint.com/gradle/gradle_build_a_java_project.htm
* https://docs.gradle.org/4.10.2/userguide/gradle_wrapper.html
* https://docs.gradle.org/4.10.2/userguide/installation.html#installation
