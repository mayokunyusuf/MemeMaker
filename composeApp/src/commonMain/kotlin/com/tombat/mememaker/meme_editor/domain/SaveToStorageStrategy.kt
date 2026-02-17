package com.tombat.mememaker.meme_editor.domain

interface SaveToStorageStrategy {
    fun getFilePath(fileName: String): String
}