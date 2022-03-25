
package lib

class Module(private var moduleCode:String,private var moduleTitle:String,private var moduleLeader:String){
    def this(){
        this("","","")
    }

    private var students: Array[Option[String]]=new Array[Option[String]](30)

    for(i<-0 until 30){
        students(i)=None
    }

    // Adds student to student array, puts student first empty space within student array. No space within student array or student already within module then not added. Returns true if student added, false student not added.
    def addStudent(student:String): Boolean={
        if(students contains Some(student)){
            return false
        }else{
            for(x<-0 until students.length){
                if(students(x)==None){
                    students(x)=Some(student)
                    return true
                }
            }
            return false
        }
    }

    // Tells number students on module. Defined by number non-empty space in student array. Returns number students.
    def getNumberOfStudents: Int={
        var numberStudents: Int=0
        for(x<-0 until students.length){
            if(students(x).nonEmpty){
                numberStudents+=1
            }
        }
        return numberStudents
    }

    // Removes student from module. Does this by setting position in array None. Returns true student was removed, false student not removed because not on module.
    def removeStudent(student:String): Boolean={
        if(students contains Some(student)){
            for(x<-0 to students.length-1){
                if(students(x)==Some(student)){
                    students(x)=None
                }
            }
            return true
        }else{  
            return false
        }
    }

    // Tells if student on module. Return true student on module, false student not on module
    def isOnModule(student:String): Boolean={
        if(students contains Some(student)){
            return true
        }else{
            return false
        }
    }

    // Set module leader
    def setModuleLeader(modulesLeader:String): Unit={
        moduleLeader=modulesLeader
    }

    // Tells current module leader
    def getModuleLeader(): String=moduleLeader
}