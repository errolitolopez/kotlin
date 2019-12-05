package com.whitecloak.simplecrudapiusingkotlin.infrastrature.util

class TextUtil {
    companion object {
        @JvmStatic
        fun capitalize(text: String): String {
            return text.toUpperCase()
        }
    }
}
