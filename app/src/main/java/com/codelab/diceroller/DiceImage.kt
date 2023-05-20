package com.codelab.diceroller

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource

@Composable
fun DiceImage(resourceId: Int) {
    Image(
        painter = painterResource(id = resourceId),
        contentDescription = resourceId.toString()
    )
}