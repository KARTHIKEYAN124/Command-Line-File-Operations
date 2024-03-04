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
1.SortAsc: The FileOperations.exe command The SortAsc command is used to sort the lines in the file in ascending order.
Usage: FileOperations.exe SortAsc.  
2.SortDesc: The SortDesc command is used to sort the lines in the file in descending order.
Usage: FileOperations.exe SortDesc.  
3.SortAscCase: The SortAscCase command is used to sort the lines in the file in ascending order of case sensitivity.
Usage: FileOperations.exe SortAscCase.  
4.SortDescCase: The SortDescCase command is used to sort the lines in the file in descending order of case sensitivity.
Usage:FileOperations.exe SortDescCase.  
5.RemoveLinesIn: THe RemoveLinesIn command is used to remove the lines from one file that is present in another file.
Usage: FileOperations.exe RemoveLineIn.  
6.RemoveLinesNotIn: The RemoveLinesNotIn command is used to remove the lines from one file that are not present in another file.
Usage: FileOperations.exe RemoveLinesNotIn.     



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


