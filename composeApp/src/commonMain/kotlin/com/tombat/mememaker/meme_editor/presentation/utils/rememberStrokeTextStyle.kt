package com.tombat.mememaker.meme_editor.presentation.utils

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PaintingStyle.Companion.Stroke
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tombat.mememaker.core.theme.Fonts

@Composable
fun rememberStrokeTextStyle(
    fontSize: TextUnit = 36.sp,
    fontFamily: FontFamily = Fonts.Impact,
    strokeColor: Color = Color.Black,
    strokeWidth: Dp = 3.dp,
    textAlign: TextAlign = TextAlign.Center
): TextStyle{
    val density = LocalDensity.current
    return remember(fontSize, fontFamily, strokeColor, strokeWidth, textAlign) {
        TextStyle(
            fontSize = fontSize,
            fontFamily = fontFamily,
            color = strokeColor,
            textAlign = textAlign,
            drawStyle = Stroke(
                width = with(density) { strokeWidth.toPx() },
                miter = 10f,
                join = StrokeJoin.Round,
            )
        )
    }
}
