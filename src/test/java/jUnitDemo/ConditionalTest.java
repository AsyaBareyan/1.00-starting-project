package jUnitDemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

class ConditionalTest {
    @Test
    @Disabled("Don't run until JIRA #123 is resolved")
    void basicTest(){

    }
    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testForWindowsOnly(){

    }
}
