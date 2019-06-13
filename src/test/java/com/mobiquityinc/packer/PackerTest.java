package com.mobiquityinc.packer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for Packer
 */
public class PackerTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PackerTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( PackerTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
