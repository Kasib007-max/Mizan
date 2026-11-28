package com.kasib.mizan.screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val Background = Color(0xFF101412)
private val Emerald = Color(0xFF36B878)
private val LightEmerald = Color(0xFF69E0AC)
private val PrimaryText = Color(0xFFF4F5F2)
private val SecondaryText = Color(0xFF929B95)

@Composable
fun WelcomeScreen(
    onGetBalanceClick: () -> Unit = {}
) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Background)
    ) {

        // Background geometric design

        Canvas(
            modifier = Modifier.fillMaxSize()
        ) {

            val emeraldLine = Emerald.copy(alpha = 0.13f)

            // Upper-left circles

            drawCircle(
                color = emeraldLine,
                radius = 175.dp.toPx(),
                center = Offset(-15.dp.toPx(), 190.dp.toPx()),
                style = androidx.compose.ui.graphics.drawscope.Stroke(
                    width = 1.dp.toPx()
                )
            )

            drawCircle(
                color = emeraldLine,
                radius = 125.dp.toPx(),
                center = Offset(-15.dp.toPx(), 190.dp.toPx()),
                style = androidx.compose.ui.graphics.drawscope.Stroke(
                    width = 1.dp.toPx()
                )
            )

            // Lower-right circles

            drawCircle(
                color = emeraldLine,
                radius = 185.dp.toPx(),
                center = Offset(
                    size.width + 5.dp.toPx(),
                    size.height - 210.dp.toPx()
                ),
                style = androidx.compose.ui.graphics.drawscope.Stroke(
                    width = 1.dp.toPx()
                )
            )

            drawCircle(
                color = emeraldLine,
                radius = 130.dp.toPx(),
                center = Offset(
                    size.width + 5.dp.toPx(),
                    size.height - 210.dp.toPx()
                ),
                style = androidx.compose.ui.graphics.drawscope.Stroke(
                    width = 1.dp.toPx()
                )
            )

            // Decorative lines

            drawLine(
                color = emeraldLine,
                start = Offset(0f, 360.dp.toPx()),
                end = Offset(145.dp.toPx(), 455.dp.toPx()),
                strokeWidth = 1.dp.toPx()
            )

            drawLine(
                color = emeraldLine,
                start = Offset(
                    size.width,
                    size.height * 0.53f
                ),
                end = Offset(
                    size.width - 145.dp.toPx(),
                    size.height * 0.61f
                ),
                strokeWidth = 1.dp.toPx()
            )

            // Small emerald particles

            drawCircle(
                color = Emerald.copy(alpha = 0.3f),
                radius = 3.dp.toPx(),
                center = Offset(
                    size.width * 0.80f,
                    size.height * 0.25f
                )
            )

            drawCircle(
                color = Emerald.copy(alpha = 0.3f),
                radius = 2.5.dp.toPx(),
                center = Offset(
                    size.width * 0.20f,
                    size.height * 0.73f
                )
            )
        }

        // Main branding section

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "MIZAN",
                color = PrimaryText,
                fontSize = 43.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 7.sp
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "ميزان",
                color = Emerald,
                fontSize = 30.sp
            )

            Spacer(modifier = Modifier.height(32.dp))

            Text(
                text = "Your Money. Your Clarity. Your Control.",
                color = SecondaryText,
                fontSize = 14.sp
            )
        }

        // Floating Get the Balance button

        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .padding(
                    start = 30.dp,
                    end = 30.dp,
                    bottom = 48.dp
                )
                .height(68.dp)
                .clip(RoundedCornerShape(23.dp))
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            LightEmerald,
                            Emerald,
                            Color(0xFF21885D)
                        )
                    )
                )
                .clickable {
                    onGetBalanceClick()
                },
            contentAlignment = Alignment.Center
        ) {

            // Crystal shine effect

            Canvas(
                modifier = Modifier.fillMaxSize()
            ) {

                val shinePath = androidx.compose.ui.graphics.Path().apply {
                    moveTo(0f, 0f)
                    lineTo(size.width * 0.62f, 0f)
                    lineTo(size.width * 0.42f, size.height * 0.40f)
                    close()
                }

                drawPath(
                    path = shinePath,
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            Color.White.copy(alpha = 0.35f),
                            Color.White.copy(alpha = 0.02f)
                        )
                    )
                )
            }

            Text(
                text = "Get the Balance",
                color = Background,
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}