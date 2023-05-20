package com.codelab.diceroller

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource

@Composable
fun RollButton(onClick: () -> Unit) {
    Button(onClick) {
        Text(text = stringResource(R.string.roll))
    }
}