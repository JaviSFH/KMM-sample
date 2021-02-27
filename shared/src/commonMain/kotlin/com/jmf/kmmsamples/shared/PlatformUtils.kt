package com.jmf.kmmsamples.shared

class PlatformUtils {
    fun getPlatformName(): String {
        return Platform().platform
    }
}
