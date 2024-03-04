<img width="430" alt="image" src="https://github.com/KARTHIKEYAN124/Command-Line-File-Operations/assets/89963351/e8e16f61-4ab0-4b56-a9fa-e9dd46b233c0">**OVERVIEW**
The Command-Line-File-Operations tool is a java based tool that is used to perform the operations on file that is Sorting, Removing the lines from the file.
This java based File Operation Tool was created using Eclipse workspace.

**FEATURES**
1.**Sorting the Files**: You can sort the lines in the file in Ascending, Descending, Ascending Case-Sensitive, Descending Case-Sensitive order.
2. **Line Manipulation**: You can remove the lines from 
* One file that are in the other file.
* One file that are not in the other file.
3. **Custom Configurations**: The config.properties file specifies the input file path, output file path and log file path.
4. **Exception Handling**: The Exceptions are handled and logged them into logfile.log.

**FILE CONTENTS**
***Src**: This Folder contains all the packages and classes that are needed for the program execution. This folder has the following packages file.operations, fileprocessors, main and test.
***file.operations**: The file.operations package contains the classes Config, FileRead, FileWrite.
The Config class contains the key value pairs of configuration settings from config.properties file.
The FileRead class is used to read the contents of the file and return the lines to the FileWrite class.
The FileWrite class is used to write the output contents given by Sorter or LineRemover class to the Output.txt file.
***fileprocessors**: The fileprocessors package contains the classes Sorter and LineRemover.
The Sorter class contains the sorting operation functionalities that is SortAsc, SortDesc, SortAsCaseSens, SortDescCaseSens. 
The LineRemover class contains two methods that is RemoveLinesFromFile2 and RemoveLinesNotInFile2. 
***main**: The main package contains the main class FileOperations.java where the program execution starts.
***test**: The test package contains the FileOperationstest.java which is used to test the FileOperations,java class.

**COMMAND LINE OPTIONS**
1.	SortAsc
2.	SortDesc
3.	SortAscCase
4.	SortDescCase
5.	RemoveLinesIn
6.	RemoveLinesNotIn

**USAGE**
1. **Setup**: Download and Install the latest version of Eclipse Application https://www.eclipse.org/downloads/
2. **Execution**: * To Run the project in the Eclipse Application Right click on the FileOperations.java file that is in the src/main directory click on Run As > Run Configurations. The Run Configurations pop up menu appears, Click on Arguments tab, under program arguments menu mention the task that is to be performed ( SortAsc, SortDesc, SortAscCase, SortDescCase, RemoveLinesIn, RemoveLinesNotIn ) and click on run to perform the task.
* To Run the project in Command line generate the jar and exe files, follow the steps given below to perform the Jar and exe file creation. 
**Steps to create a Jar file** :  
1.	Right click on the project. 
2.	Click on Export from the Dropdown. 
3.	Click on Runnable Jar from the pop up then click on Next.
4.	In the Launch configuration option select the project.
5.	In the Export destination option mention the destination the jar file should be stored.
6.	Click on Finish.
**Steps to create an Exe file** :
1.	Download and Install Laun4j Application from Launch4j Executable Wrapper download | SourceForge.net.
2.	Create a configuration file in xml format, refer Launch4j docs for creating the configuration file https://launch4j.sourceforge.net/docs.html#Runtime_options. 
3.	Open the command prompt and navigate to the Launch4j directory.
4.	Execute the FileOperations.xml file using the launch4j command and click on Enter 
5.	The exe file created will be stored in the path that is specified in the FileOperations.xml file.

*After creating the exe and jar file open command prompt and change the directory to where the exe file is stored, after the directory is changed give the command Example: **FileOperations.exe SortAsc**. 
