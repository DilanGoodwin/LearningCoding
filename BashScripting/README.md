
# Bash Shell Scripting

TLDR: Shell scripts complete basic tasks.

When having to repeat a task manually several times for the same things I find it easier to just create simple scripts that are quick to run taking a few user inputs. Each of the programs within this folder will be explained below including why they were made and the functions that they complete.

## C#Builder.sh
When following along with the 'Learning C#' course I had to create several folders that would contain a single C# program. Doing this repeatedly for the entire course became quite tedious quickly. Rather than doing it manually I quickly created a shell script that creates the folders and initialises them for C# programming with minimal user input.
Syntx for running this script is: `sh C\#Builder.sh <Target Location> <Master File Name> <Secondary File Names>`
Once you have entered the master file name you can add as manu secondary file names as you would like and it will create all those files for you. This program does require that you have `dotnet` install as it uses it to initialise the files for C# programming.

## C#BuilderV2.sh
Similar to the original (`C#Builder.sh`) this program creates files for programming in C# but it also adds specific things to the main file it creates. Rather than just using the `dotnet` platform to initialise the folders for C# programming it removes the `Program.cs` file created by `dotnet` and replaces it with a file named after the folder it is create within, adding the C# code to print "Hello World' while it is at it.
The same syntx is used for this program as for its original version `C#Builder.sh`.

## DocTmpFolder.sh
When downloading files from the internet I find that I just let the downloads folder on my computer just get filled with random stuff that I used once and will never need again. So rather than letting it get to that stage this script creates a folder within my Documents called `tmp` that I use to store anything that I am downloading. Now all I need to do is re-run the script and if the folder already exists it will remove it and then create another one.
I do not think that it will be particularly useful to other people as I tend to move things that I am planning on keeping out of the folder the moment they have been downloaded but it is still something I thought would be cool to make.


## ScalaBlankProject.sh
Programming in Scala is something that was fairly new to me and I was only really introduced to it because it was what the university I am going to is currently teaching. Uni recommended that we use Eclipse IDE as it works with Scala but I am currently running an M1 Mac and it is not currently compaitable with it (could not seem to get Rosetta 2 to work with it). So instead I used a combination of Metals and SBT (Scala Build Tool) with Visual Studio Code to make the programs.
Now I could use Metals to create a blank project for me every single time but then I would have to remember command and still re-name several things to get it the way I liked it (or more appropriately needed it for uni). So instead I created a script that makes all the files I need to program in Scala with Visual Studio code.
Syntax for running the script: `sh ScalaBlankProject.sh <TargetLocation> <FileName>` 
All it does is create the folder structure and then make the common 'Hell World' program. Still doing it this way means that if I ever wanted to add a specific library to all my furture Scala programs I can just add it to this file and then not have to worry about it again.

## ScalaUniversityFolders.sh
I just needed a quick way to create folders to store all of my university work. This is not something I see other people using.
