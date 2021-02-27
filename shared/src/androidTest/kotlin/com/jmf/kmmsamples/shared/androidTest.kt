package com.jmf.kmmsamples.shared

import org.junit.Assert.assertTrue
import org.junit.Test

class AndroidPlatformUtilsTest {

    @Test
    fun testExample() {
        assertTrue("Check Android is mentioned", PlatformUtils().getPlatformName().contains("Android"))
    }
}