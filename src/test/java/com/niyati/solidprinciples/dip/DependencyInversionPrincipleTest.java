package com.niyati.solidprinciples.dip;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class DependencyInversionPrincipleTest {
    @Test
    void testDependencyInversionPrinciple(){
        Manager manager1=new Manager(new SuperWorker());
        assertEquals("Working Much More",manager1.manage());

        Manager manager2=new Manager(new Worker());
        assertEquals("Working",manager2.manage());

    }

}