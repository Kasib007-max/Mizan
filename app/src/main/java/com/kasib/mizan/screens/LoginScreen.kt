package com.kasib.mizan.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val Background = Color(0xFF101412)
private val Emerald = Color(0xFF36B878)
private val LightEmerald = Color(0xFF69E0AC)
private val PrimaryText = Color(0xFFF4F5F2)
private val SecondaryText = Color(0xFF929B95)
private val FieldBackground = Color(0xFF191F1B)

@Composable
fun LoginScreen(
    onSignInClick: (String, String) -> Unit = { _, _ -> },
    onGoogleClick: () -> Unit = {},
    onCreateAccountClick: () -> Unit = {},
    onForgotPasswordClick: () -> Unit = {}
) {

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var showPassword by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Background)
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 28.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(55.dp))

        // MIZAN BRANDING

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "MIZAN",
                color = PrimaryText,
                fontSize = 27.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 4.sp
            )

            Spacer(modifier = Modifier.width(10.dp))

            Text(
                text = "ميزان",
                color = Emerald,
                fontSize = 22.sp
            )
        }

        Spacer(modifier = Modifier.height(55.dp))

        // SMALL BRAND ACCENT

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            Box(
                modifier = Modifier
                    .width(24.dp)
                    .height(2.dp)
                    .background(Emerald)
            )

            Text(
                text = "YOUR FINANCIAL JOURNEY",
                color = Emerald,
                fontSize = 10.sp,
                fontWeight = FontWeight.SemiBold,
                letterSpacing = 2.sp
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        // MAIN HEADING

        Text(
            text = "Your money,\nyour next move.",
            color = PrimaryText,
            fontSize = 34.sp,
            fontWeight = FontWeight.Bold,
            lineHeight = 42.sp,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(13.dp))

        Text(
            text = "A clearer picture of every rupee starts here.",
            color = SecondaryText,
            fontSize = 14.sp,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(42.dp))

        // EMAIL LABEL

        InputLabel("EMAIL ADDRESS")

        Spacer(modifier = Modifier.height(10.dp))

        LoginInput(
            value = email,
            onValueChange = { email = it },
            placeholder = "Enter your email",
            keyboardType = KeyboardType.Email
        )

        Spacer(modifier = Modifier.height(23.dp))

        // PASSWORD LABEL

        InputLabel("PASSWORD")

        Spacer(modifier = Modifier.height(10.dp))

        LoginInput(
            value = password,
            onValueChange = { password = it },
            placeholder = "Enter your password",
            isPassword = true,
            showPassword = showPassword,
            onTogglePassword = {
                showPassword = !showPassword
            }
        )

        Spacer(modifier = Modifier.height(13.dp))

        // FORGOT PASSWORD

        Text(
            text = "Forgot password?",
            color = Emerald,
            fontSize = 13.sp,
            modifier = Modifier
                .align(Alignment.End)
                .clickable {
                    onForgotPasswordClick()
                }
        )

        Spacer(modifier = Modifier.height(30.dp))

        // SIGN IN BUTTON

        Button(
            onClick = {
                onSignInClick(email.trim(), password)
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp),
            shape = RoundedCornerShape(17.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Emerald
            ),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 8.dp,
                pressedElevation = 2.dp
            )
        ) {

            Text(
                text = "Sign In  →",
                color = Background,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 0.5.sp
            )
        }

        Spacer(modifier = Modifier.height(25.dp))

        // DIVIDER

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(1.dp)
                    .background(Color.White.copy(alpha = 0.10f))
            )

            Text(
                text = "  OR CONTINUE WITH  ",
                color = SecondaryText,
                fontSize = 10.sp,
                letterSpacing = 1.sp
            )

            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(1.dp)
                    .background(Color.White.copy(alpha = 0.10f))
            )
        }

        Spacer(modifier = Modifier.height(23.dp))

        // GOOGLE BUTTON

        OutlinedButton(
            onClick = onGoogleClick,
            modifier = Modifier
                .fillMaxWidth()
                .height(57.dp),
            shape = RoundedCornerShape(15.dp),
            border = androidx.compose.foundation.BorderStroke(
                1.dp,
                Color.White.copy(alpha = 0.15f)
            ),
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = PrimaryText
            )
        ) {

            Text(
                text = "G",
                color = PrimaryText,
                fontSize = 19.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.width(12.dp))

            Text(
                text = "Continue with Google",
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium
            )
        }

        Spacer(modifier = Modifier.height(35.dp))

        // CREATE ACCOUNT

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = "New to MIZAN? ",
                color = SecondaryText,
                fontSize = 13.sp
            )

            Text(
                text = "Create an account",
                color = LightEmerald,
                fontSize = 13.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.clickable {
                    onCreateAccountClick()
                }
            )
        }

        Spacer(modifier = Modifier.height(40.dp))

        // PRIVACY FOOTER

        Text(
            text = "YOUR FINANCES. YOUR PRIVACY.",
            color = SecondaryText.copy(alpha = 0.65f),
            fontSize = 9.sp,
            letterSpacing = 2.sp
        )

        Spacer(modifier = Modifier.height(25.dp))
    }
}


// INPUT LABEL COMPONENT

@Composable
fun InputLabel(text: String) {

    Text(
        text = text,
        color = SecondaryText,
        fontSize = 10.sp,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = 1.5.sp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 3.dp)
    )
}


// REUSABLE INPUT COMPONENT

@Composable
fun LoginInput(
    value: String,
    onValueChange: (String) -> Unit,
    placeholder: String,
    isPassword: Boolean = false,
    showPassword: Boolean = false,
    onTogglePassword: () -> Unit = {},
    keyboardType: KeyboardType = KeyboardType.Text
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .clip(RoundedCornerShape(14.dp))
            .background(FieldBackground)
            .border(
                width = 1.dp,
                color = Color.White.copy(alpha = 0.09f),
                shape = RoundedCornerShape(14.dp)
            )
            .padding(horizontal = 17.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Box(
            modifier = Modifier.weight(1f),
            contentAlignment = Alignment.CenterStart
        ) {

            if (value.isEmpty()) {

                Text(
                    text = placeholder,
                    color = SecondaryText.copy(alpha = 0.75f),
                    fontSize = 14.sp
                )
            }

            BasicTextField(
                value = value,
                onValueChange = onValueChange,
                singleLine = true,
                keyboardOptions = KeyboardOptions(
                    keyboardType = if (isPassword) {
                        KeyboardType.Password
                    } else {
                        keyboardType
                    }
                ),
                textStyle = TextStyle(
                    color = PrimaryText,
                    fontSize = 14.sp
                ),
                visualTransformation = if (
                    isPassword && !showPassword
                ) {
                    PasswordVisualTransformation()
                } else {
                    VisualTransformation.None
                }
            )
        }

        if (isPassword) {

            Text(
                text = if (showPassword) "HIDE" else "SHOW",
                color = Emerald,
                fontSize = 10.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 1.sp,
                modifier = Modifier.clickable {
                    onTogglePassword()
                }
            )
        }
    }
}