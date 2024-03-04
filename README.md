**OVERVIEW**  
The Command-Line-File-Operations tool is a java based tool that is used to perform the operations on file that is Sorting, Removing the lines from the file.
This java based File Operation Tool was created using Eclipse workspace.

**FEATURES**  
1.**Sorting the Files**: You can sort the lines in the file in Ascending, Descending, Ascending Case-Sensitive, Descending Case-Sensitive order.  
2. **Line Manipulation**: You can remove the lines from 
  -One file that are in the other file.  
  -One file that are not in the other file.  
3. **Custom Configurations**: The config.properties file specifies the input file path, output file path and log file path.  
4. **Exception Handling**: The Exceptions are handled and logged them into logfile.log.

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
