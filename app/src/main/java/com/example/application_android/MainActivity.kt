package com.example.application_android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.application_android.ui.theme.Application_androidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Application_androidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Final(Modifier)
                    //Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Final(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            //.requiredWidth(width = 375.dp)
            //.requiredHeight(height = 1226.dp)
            .background(color = Color(0xff050b18))
            .padding(horizontal = 24.dp)
    ) {


        // Блок главной картинки и названия
        Box(
            modifier = Modifier
                .requiredWidth(width = 375.dp)
                .requiredHeight(height = 300.dp)

        ) {
            Box(modifier = Modifier) {
                // Главная картинка
                Image(
                    painter = painterResource(id = R.drawable.image16),
                    contentDescription = "image 16",
                    modifier = Modifier
                        .align(
                            alignment = Alignment.TopStart
                        )
                        .requiredWidth(width = 628.dp)
                        .requiredHeight(height = 354.dp)
                )

                // Тень на главной картинке
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 375.dp)
                        .requiredHeight(height = 80.dp)
                        .background(
                            brush = Brush.verticalGradient(
                                0F to Color.Black.copy(alpha = 0.8F),
                                .5f to Color.Black.copy(alpha = 0.5F),
                                1F to Color.Transparent
                            )
                        )
                )

            }
            // Лого и рейтинг
            Row(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 24.dp,
                        y = 270.dp
                    )
                    .requiredWidth(width = 212.dp)
                    .requiredHeight(height = 88.dp)
            ) {

                // Логотип
                Box(
                    modifier = Modifier
                        .requiredSize(size = 88.dp)
                ) {

                    // Рамка логотипа
                    Box(
                        modifier = Modifier
                            .requiredSize(size = 88.dp)
                            .clip(shape = RoundedCornerShape(14.dp))
                            .background(color = Color.Black)
                            .border(
                                border = BorderStroke(2.dp, Color(0xff1f2430)),
                                shape = RoundedCornerShape(14.dp)
                            )
                    )

                    // Логотип
                    Image(
                        painter = painterResource(id = R.drawable.image17),
                        contentDescription = "image 17",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 17.dp,
                                y = 17.dp
                            )
                            .requiredSize(size = 54.dp)
                    )
                }

                Spacer(modifier = Modifier.width(15.dp))

                // Название и рейтинг
                Column(
                    modifier = Modifier
                        .requiredWidth(width = 112.dp)
                        //.requiredHeight(height = 46.dp)
                        .fillMaxSize(1f)
                        .padding(vertical = 5.dp),
                    verticalArrangement = Arrangement.Bottom
                ) {


                    Text(
                        text = "DoTA 2",
                        color = Color.White,
                        lineHeight = 1.3.em,
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            letterSpacing = 0.5.sp
                        )
                    )
                    Row(
                        modifier = Modifier
                            .requiredWidth(width = 112.dp)
                            .requiredHeight(height = 14.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .offset(
                                    x = 0.dp,
                                    y = 1.dp
                                )
                                .requiredWidth(width = 76.dp)
                                .requiredHeight(height = 12.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.group84),
                                contentDescription = "group84",
                                modifier = Modifier
                                    .align(alignment = Alignment.TopStart)
                            )
                        }

                        Spacer(modifier = Modifier.width(8.dp))

                        Text(
                            text = "70M",
                            color = Color(0xff45454d),
                            style = TextStyle(
                                fontSize = 12.sp,
                                letterSpacing = 0.5.sp
                            )
                        )
                    }
                }
            }

        }

        Spacer(modifier = Modifier.height(75.dp))

        // Категории.Тэги
        Row(
            modifier = Modifier
                .requiredWidth(width = 239.dp)
                .requiredHeight(height = 22.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 53.dp)
                    .requiredHeight(height = 22.dp)
                    .clip(shape = RoundedCornerShape(100.dp))
                    .background(color = Color(0xff44a9f4).copy(alpha = 0.24f))

            ) {
                Text(
                    text = "MOBA",
                    color = Color(0xff44a9f4),
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Medium
                    ),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 13.dp,
                            y = 5.dp
                        )
                )


            }
            Spacer(modifier = Modifier.width(10.dp))
            Box(
                modifier = Modifier
                    .requiredWidth(width = 93.dp)
                    .requiredHeight(height = 22.dp)
                    .clip(shape = RoundedCornerShape(100.dp))
                    .background(color = Color(0xff44a9f4).copy(alpha = 0.24f))
            ) {

                Text(
                    text = "MULTIPLAYER",
                    color = Color(0xff41a0e7),
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Medium
                    ),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 13.dp,
                            y = 5.dp
                        )
                )
            }

            Spacer(modifier = Modifier.width(10.dp))

            Box(
                modifier = Modifier
                    .requiredWidth(width = 73.dp)
                    .requiredHeight(height = 22.dp)
                    .clip(shape = RoundedCornerShape(100.dp))
                    .background(color = Color(0xff44a9f4).copy(alpha = 0.24f))
            ) {

                Text(
                    text = "STRATEGY",
                    color = Color(0xff41a0e7),
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Medium
                    ),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 13.dp,
                            y = 5.dp
                        )
                )
            }
        }

        Spacer(modifier = Modifier.height(25.dp))

        // Описание
        Text(
            text = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.",
            color = Color(0xffeef2fb).copy(alpha = 0.7f),
            lineHeight = 1.58.em,
            style = TextStyle(
                fontSize = 12.sp
            ),
            modifier = Modifier
                .requiredWidth(width = 327.dp)

        )

        Spacer(modifier = Modifier.height(15.dp))

        // Картинка и видео
        Row(modifier = Modifier,
            horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterHorizontally)) {
            Box(modifier = Modifier) {
                Image(
                    painter = painterResource(id = R.drawable.image18),
                    contentDescription = "image 18",
                    modifier = Modifier
                        .requiredWidth(width = 240.dp)
                        .requiredHeight(height = 128.dp)
                        .clip(shape = RoundedCornerShape(14.dp))
                )

                IconButton(
                    modifier = Modifier
                        .requiredSize(size = 48.dp)
                        .offset(
                            x = 96.dp,
                            y = 40.dp
                        ),
                    onClick = { }
                ) {
                    Box(modifier = Modifier) {
                        Box(
                            modifier = Modifier
                                .requiredSize(size = 48.dp)
                                .clip(shape = CircleShape)
                                .background(color = Color.White.copy(alpha = 0.24f))
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.arrowright2),
                            contentDescription = "Iconly/Bold/Arrow - Right 2",
                            tint = Color.White,
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(
                                    x = 12.dp,
                                    y = 12.dp
                                )
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.width(180.dp))

            Box(modifier = Modifier) {
                Image(
                    painter = painterResource(id = R.drawable.image19),
                    contentDescription = "image 19",
                    modifier = Modifier
                        .requiredWidth(width = 240.dp)
                        .requiredHeight(height = 128.dp)
                        .clip(shape = RoundedCornerShape(14.dp))
                        .offset(
                            x = 40.dp,
                        )
                )
            }
        }

        Spacer(modifier = Modifier.height(15.dp))

        // Review & Ratings
        Column(
            modifier = Modifier
                .requiredHeight(height = 89.dp)
        ) {
            Text(
                text = "Review & Ratings",
                color = Color(0xffeef2fb),
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 0.6.sp
                )
            )

            Row() {
                Text(
                    text = "4.9",
                    color = Color.White,
                    style = TextStyle(
                        fontSize = 48.sp,
                        fontWeight = FontWeight.Bold
                    )
                )

                Spacer(modifier = Modifier.width(15.dp))

                // Рейтинг и просмотры
                Column(
                    modifier = Modifier
                        .fillMaxSize(1f)
                        .padding(vertical = 15.dp),
                    verticalArrangement = Arrangement.Bottom
                ) {
                    Box() {
                        Image(
                            painter = painterResource(id = R.drawable.group98),
                            contentDescription = "group98",
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                        )
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "70M Reviews",
                        color = Color(0xffa8adb7),
                        style = TextStyle(
                            fontSize = 12.sp,
                            letterSpacing = 0.4.sp
                        ),
                    )
                }
            }
        }

        // Комментарий 1
        Comment(
            name = "Auguste Conte",
            text = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”",
            date = "February 14, 2019",
            id = R.drawable.ellipse9
        )

        Spacer(modifier = Modifier.height(10.dp))

        Divider(
            color = Color(0xff1a1f29),
            modifier = Modifier.requiredWidth(width = 300.dp)
        )

        Spacer(modifier = Modifier.height(15.dp))

        // Комментарий 2
        Comment(
            name = "Jang Marcelino",
            text = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”",
            date = "February 14, 2019",
            id = R.drawable.ellipse91
        )

        Spacer(modifier = Modifier.height(30.dp))

        //  Кнопка Install
        Box(
            modifier = Modifier
                .requiredWidth(width = 327.dp)
                .requiredHeight(height = 64.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 327.dp)
                    .requiredHeight(height = 64.dp)
                    .clip(shape = RoundedCornerShape(12.dp))
                    .background(color = Color(0xfff4d144))
            )
            Text(
                text = "Install",
                color = Color(0xff050b18),
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 0.6.sp
                ),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 134.dp,
                        y = 20.dp
                    )
            )
        }

    }
}

@Composable
fun Comment(name: String, text: String, date: String, @DrawableRes id: Int) {
    // Комментарий
    Column(
        modifier = Modifier
            .requiredWidth(width = 327.dp)
            .requiredHeight(height = 116.dp)
    ) {

        // Шапка комментария
        Row(
            modifier = Modifier
                .requiredWidth(width = 171.dp)
                .requiredHeight(height = 40.dp)
        ) {
            // Фотка
            Image(
                painter = painterResource(id = id),
                contentDescription = "Fotka",
                modifier = Modifier
                    .requiredSize(size = 36.dp)
                    .clip(shape = CircleShape)
            )

            Spacer(modifier = Modifier.width(15.dp))

            // Имя - Дата
            Column(
                modifier = Modifier
                    .requiredWidth(width = 119.dp)
                    .requiredHeight(height = 40.dp)
            ) {
                Text(
                    text = name,
                    color = Color.White,
                    style = MaterialTheme.typography.bodyLarge
                )
                Text(
                    text = date,
                    color = Color.White.copy(alpha = 0.4f),
                    style = TextStyle(
                        fontSize = 12.sp,
                        letterSpacing = 0.5.sp
                    ),
                )
            }
        }

        Spacer(modifier = Modifier.height(15.dp))

        // текст комментария
        Text(
            text = text,
            color = Color(0xffa8adb7),
            lineHeight = 1.67.em,
            style = TextStyle(
                fontSize = 12.sp,
                letterSpacing = 0.5.sp
            ),
            modifier = Modifier
                .requiredWidth(width = 327.dp)
        )

    }


}


@Preview(widthDp = 375, heightDp = 1226)
@Composable
private fun FinalPreview() {
    Final(Modifier)
}

