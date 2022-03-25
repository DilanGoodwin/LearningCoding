
import org.junit.Test
import junit.framework.TestCase
import org.junit.Assert

import lib.Module
import app.ModuleFactory

class ModuleTest{
    @Test def testSetModuleLeader{
        var module=ModuleFactory.module001
        module.setModuleLeader("John Smith")
        Assert.assertEquals("John Smith",module.getModuleLeader())
    }

    @Test def addNewStudent{
        var module=ModuleFactory.module001
        var numberOfStudents=module.getNumberOfStudents
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

    @Test def addAndRemove{
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
