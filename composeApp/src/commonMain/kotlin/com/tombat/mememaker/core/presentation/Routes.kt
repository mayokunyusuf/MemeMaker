package com.tombat.mememaker.core.presentation

import kotlinx.serialization.Serializable

sealed interface Route {

    @Serializable
    data object MemeGallery : Route

    @Serializable
    data class MemeEditor(
        val templateId: String
    ) : Route
}
