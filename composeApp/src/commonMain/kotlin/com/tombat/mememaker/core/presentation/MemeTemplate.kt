package com.tombat.mememaker.core.presentation

import mememaker.composeapp.generated.resources.Res
import mememaker.composeapp.generated.resources.allDrawableResources
import org.jetbrains.compose.resources.DrawableResource

data class MemeTemplate(
    val id: String,
    val drawableResource: DrawableResource
)

val memeTemplates = Res
    .allDrawableResources
    .filterKeys { it.startsWith("meme_template") }
    .map { (key, value) ->
        MemeTemplate(
            id = key,
            drawableResource = value
        )
    }
