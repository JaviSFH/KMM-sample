package com.jmf.kmmsamples.shared

import kotlin.test.Test
import kotlin.test.assertTrue

class IosGreetingTest {

    @Test
    fun testExample() {
        assertTrue(PlatformUtils().getPlatformName().contains("iOS"), "Check iOS is mentioned")
    }
}