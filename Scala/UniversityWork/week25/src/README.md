# Week 25: Completing an Implementation

The test class for this weeks lab was designed to be used within Scala Eclipse but the version that will be stored within the code files will be changed to work with Visual Studio Code as that is the IDE that I use.

## 1. Introduction
This lab a class is implemented according to a number test cases provided. Process follows test drive/test first development approach. This means test written before implementation. Now using this build class library. Core class called `Module` given here:

```
package lib

class Module(private var moduleCode:String,private var moduleTitle:String,private var moduleLeader:String){
  def this(){
    this("","","")
  }

  private var students:Array[Option[String]]=new Array[Option[String]](30)

  for(i<-0 until 30){
    students(i)=None
  }

  // Adds student to student array, puts student first empty space within student array. No space within student array or student already within module then not added. Returns True if student added, False student not added. 
  def addStudent(student:String): Boolean={
    return false
  }

  // Tells number students on module. Defined by number non-empty space in student array. Returns number students.
  def getNumberOfStudents: Int=0

  // Removes student from module. Does this by setting position in array to None. Returns True student was removed, False student not removed because not on module
  def removeStudent(student:String): Boolean=false

  // Tells if student on module. Return True student on module, False student not on module.
  def isOnModule(student:String): Boolean=false

  // Set moduleLeader
  def setModuleLeader(moduleLeader:String){

  }

  // Tells current module leader
  def getModuleLeader: String=""
}
```

Each method has comment explaining what method does. Methods are either empty or return dummy value. Task is to implement those methods. Guidance to complete this task is the comments & the test cases in test class. There is also an object creating a preconfigured instance of module:

```
package app

import lib.Module

object ModuleFactory{
  def module001: Module=new Module("Module001","Computer Science","")
}
```

Test class:

```
package test

import lib.Module
import app.ModuleFactory
import org.junit.Test
import org.junit.Assert

class ModuleTest{
  @Test def testSetModuleLeader{
    var module=ModuleFactory.module001
    module.setModuleLeader("John Smith")
    Assert.assertEquals("John Smith",module.getModuleLeader)
  }
  @Test def addNewStudent{
    var module=ModuleFactory.module001
    var numberOfStudents=module.getNumberOfStudents
    module.addStudent("John Doe")
    Assert.assertTrue(module.isOnModule("John Doe"))
    Assert.assertEquals(numberOfStudents+1,module.getNumberOfStudents)
  }
  @Test def addStudentTwice{
    var module=ModuleFactory.module001
    var numberOfStudents=module.getNumberOfStudents
    module.addStudent("John Doe")
    module.addStudent("John Doe")
    Assert.assertTrue(module.isOnModule("John Doe"))
    Assert.assertEquals(numberOfStudents+1,module.getNumberOfStudents)
  }
  @Test def addTooManyStudents{
    var module=ModuleFactory.module001
    for(i<-0 until 40){
      module.addStudent("John"+i+" Doe")
    }
    Assert.assertTrue(module.isOnModule("John0 Doe"))
    Assert.assertFalse(module.isOnModule("John30 Doe"))
    Assert.assertEquals(30,module.getNumberOfStudents)
  }
  @Test def addAndRemovesStudent{
    var module=ModuleFactory.module001
    var numberOfStudents=module.getNumberOfStudents
    module.addStudent("John Doe")
    Assert.assertTrue(module.isOnModule("John Doe"))
    Assert.assertEquals(numberOfStudents+1,module.getNumberOfStudents)
    module.removeStudent("John Doe")
    Assert.assertFalse(module.isOnModule("John Doe"))
    Assert.assertEquals(numberOfStudents,module.getNumberOfStudents)
  }
}
```

Test gives you more clues about Module class. As you create the class the test should start to pass.
