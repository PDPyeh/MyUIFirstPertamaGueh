package com.example.myuifirstpertamagueh

import android.R.attr.padding
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myuifirstpertamagueh.ui.theme.SFProDisplay


@Composable
fun ActivitasPertama(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 100.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Header
        Text(
            text = stringResource(id = R.string.prodi),
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = SFProDisplay
        )
        Text(
            text = stringResource(id = R.string.univ),
            fontSize = 22.sp,
            fontFamily = SFProDisplay
        )

        Spacer(modifier = Modifier.height(25.dp))


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
                .background(
                    brush = Brush.radialGradient(
                        colors = listOf(
                            Color(0xFF53589A),
                            Color(0xFF45455B),
                            Color(0xFFEFEFEF)
                        ),
                        center = Offset(400f, 400f),
                        radius = 1200f
                    ),
                    shape = RoundedCornerShape(16.dp)
                )
                .clip(RoundedCornerShape(16.dp))
        ) {
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = Color.Transparent),
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
            ) {
                Row(modifier = Modifier.padding(8.dp)) {
                    val gambar = painterResource(id = R.drawable.huto)
                    Image(
                        painter = gambar,
                        contentDescription = null,
                        modifier = Modifier
                            .size(100.dp)
                            .padding(5.dp)
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Column {
                        Text(
                            text = stringResource(id = R.string.nama),
                            fontSize = 30.sp,
                            fontFamily = SFProDisplay,
                            color = Color.White,
                            modifier = Modifier.padding(top = 15.dp)
                        )
                        Text(
                            text = stringResource(id = R.string.alamat),
                            fontSize = 20.sp,
                            fontFamily = SFProDisplay,
                            color = Color.Yellow,
                            modifier = Modifier.padding(top = 10.dp)
                        )
                    }
                }
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
                .background(
                    color = Color.Blue,
                    shape = RoundedCornerShape(16.dp)
                )
                .clip(RoundedCornerShape(16.dp))
        ){
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = Color.Transparent),
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
            ) {
                Row(modifier = Modifier.padding(8.dp)) {
                    val gambar = painterResource(id = R.drawable.huto)
                    Image(
                        painter = gambar,
                        contentDescription = null,
                        modifier = Modifier
                            .size(100.dp)
                            .padding(5.dp)
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Column{
                        Text(
                            text = stringResource(id = R.string.nama2),
                            fontSize = 28.sp,
                            fontFamily = SFProDisplay,
                            color = Color.White,
                            modifier = Modifier.padding(top = 10.dp)
                        )

                    }

                }
            }
    }
}




