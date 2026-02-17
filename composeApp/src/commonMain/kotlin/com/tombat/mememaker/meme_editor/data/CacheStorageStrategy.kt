package com.tombat.mememaker.meme_editor.data

import com.tombat.mememaker.meme_editor.domain.SaveToStorageStrategy

expect class CacheStorageStrategy: SaveToStorageStrategy {
    override fun getFilePath(fileName: String): String
}