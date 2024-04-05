package com.example.bill_tipsplit.widgets

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


val IconButtonSizeModifier = Modifier.size(40.dp)

@Composable
//fun RoundIconButton (
//
//    imageVector: ImageVector,
//    onClick: () -> Unit,
//    modifier: Modifier = Modifier,
//    tint: Color = Color.Black.copy(alpha = 0.8f),
//    backgroundColor: Color = MaterialTheme.colorScheme.background,
//    elevation: Dp = 4.dp
//            ) {
//    Card(
//        modifier = modifier
//            .padding(all = 14.dp)
//            .clickable { onClick.invoke() }
//            .then(IconButtonSizeModifier),
//        shape = CircleShape,
//        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
//    ) {
//        Icon(imageVector = imageVector,
//            contentDescription = "Plus and minus icon",
//            tint = tint)
//    }
//}
fun RoundIconButton (
    imageVector: ImageVector,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    tint: Color = Color.Black.copy(alpha = 0.8f),
    backgroundColor: Color = MaterialTheme.colorScheme.background,
    elevation: Dp = 4.dp
) {
    Card(
        modifier = modifier
            .padding(all = 14.dp)
            .clickable { onClick.invoke() }
            .then(IconButtonSizeModifier),
        shape = CircleShape,
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Box(
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = imageVector,
                contentDescription = "Plus and minus icon",
                tint = tint,
                modifier = Modifier.size(24.dp) // Adjust size as needed
            )
        }
    }
}
