package com.oceanhero.search.extensions

import android.content.ClipData
import android.content.ClipboardManager

/**
 * Copies the [text] to the clipboard with the label `URL`.
 */
fun ClipboardManager.copyToClipboard(text: String) {
    primaryClip = ClipData.newPlainText("URL", text)
}
