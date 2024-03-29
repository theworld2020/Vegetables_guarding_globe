package com.shashank.vegetablesorderappui.view.dashboard

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shashank.vegetablesorderappui.R
import com.shashank.vegetablesorderappui.navigation.MainActions
import com.shashank.vegetablesorderappui.theme.*


@Composable
fun VegetableDetail(actions: MainActions, veg: String) {
    Log.d("VegetableDetail", "Received Vegetable Name: $veg")
    val context = LocalContext.current
    Toast.makeText(context, "Vegetable Name: $veg", Toast.LENGTH_SHORT).show()


/*fun VegetableDetail(actions: MainActions, vegetableName: String) {
    val context = LocalContext.current
    Log.d("VegetableDetail", "Received Vegetable Name: $vegetableName")
    Toast.makeText(context, "Vegetable ID: $vegetableName", Toast.LENGTH_SHORT).show()*/
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(azureishWhite)
    ) {
        Spacer(modifier = Modifier.height(24.dp))
        Row(
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .clip(CircleShape)
                    .background(white)
                    .padding(8.dp),
            ) {
               /* Icon(
                    modifier = Modifier.size(12.dp),
                    painter = painterResource(id = R.drawable.left_arrow),
                    contentDescription = stringResource(R.string.text_back_icon),
                )*/
            }
            Box(
               // contentAlignment = Alignment.Center,
                modifier = Modifier
                    .clip(CircleShape)
                    .background(white)
                    .padding(8.dp),
            )/* {
                Icon(
                    modifier = Modifier.size(20.dp),
                    imageVector = Icons.Default.Favorite,
                    contentDescription = stringResource(R.string.text_heart_icon),
                    tint = Color.Red
                )
            }*/
        }
        Spacer(modifier = Modifier.height(32.dp))
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                modifier = Modifier.size(200.dp),
                painter = painterResource(id = R.drawable.red_capsicum),
                contentDescription = "Tomato Image",
                contentScale = ContentScale.Crop
            )
        }
        Spacer(modifier = Modifier.height(44.dp))
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .clip(RoundedCornerShape(16.dp, 16.dp, 0.dp, 0.dp))
                .background(white)
                .padding(24.dp)
        )
        {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                /*Text(
                    text = "Sawi Hijau",
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp
                )*/
               /* Text(
                    text = "Rs. 14.00/Kg",
                    color = gold,
                    fontSize = 14.sp
                )*/
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "INVINCIBLE\n" +
                        "\n" +
                        "\"Mark Grayson, aka Invincible, is fairly new to being a hero, but he's been put through the ringer in that short amount of time. Mark's dad is Nolan Grayson, aka Omni-Man, which makes Invincible half Viltrumite. The kid's not nearly as powerful as his old man, thank God. He's still got an impressive array of power, though. He's super strong, super-fast, he can fly, he's nigh invulnerable and he can heal super quick. All these powers come in handy because this kid is green as hell. Even though he's still a work in progress, he's an invaluable hero to have on our side. We should do everything within our power to make Invincible a Guardian of the Globe and not have him turn out like his Dad. He might be the only person who can save us from Omni-Man.\" - Cecil Stedman\n" +
                        "\n" +
                        "Role: Attacker\n" +
                        "Faction: Earth's Defenders\n" +
                        "Main skill: Supersonic",
                color = Color.Gray,
                fontSize = 14.sp
            )
            Spacer(modifier = Modifier.height(28.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
            ) {

                Column(
                    modifier = Modifier
                        .wrapContentHeight()
                ) {
                    Text(
                        text = "Total",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = black,
                    )
                    Text(
                        text = "Rs. 14.00/Kg",
                        fontSize = 14.sp,
                        color = gold,
                    )
                }
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .background(lightSilver)
                        .padding(4.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        modifier = Modifier.size(20.dp, 20.dp),
                        imageVector = Icons.Default.Add,
                        contentDescription = stringResource(R.string.text_add_icon),
                        tint = white
                    )
                }
            }
            Spacer(modifier = Modifier.height(24.dp))
            Button(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(24.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = blue
                ),
                onClick = { /*TODO*/ }) {
                Text(
                    text = "Next",
                    color = Color.White,
                    fontSize = 14.sp
                )
            }
        }
    }
}
