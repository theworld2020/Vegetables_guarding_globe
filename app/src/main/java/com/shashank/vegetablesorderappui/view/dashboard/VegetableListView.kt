package com.shashank.vegetablesorderappui.view.dashboard

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
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
import com.shashank.vegetablesorderappui.model.Vegetable
import com.shashank.vegetablesorderappui.navigation.MainActions
import com.shashank.vegetablesorderappui.theme.*

@ExperimentalMaterialApi
@Composable
fun VegetableListView(actions: MainActions) {
    val context = LocalContext.current
    var text by remember { mutableStateOf("") }
    val vegetablesItemList = listOf(
        Vegetable(R.drawable.invincible, "Invincible", "", seashell),
        Vegetable(R.drawable.atom, "Atom Eve", "", aliceBlue),
        Vegetable(R.drawable.omni, "Omni-Man", "", cultured),
        Vegetable(R.drawable.robot, "Robot", "", azureishWhite),
        Vegetable(R.drawable.rex, "Rex Splode", "", seashell),
        Vegetable(R.drawable.warwomen, "War Woman", "", aliceBlue),
        Vegetable(R.drawable.black, "Black Samson", "", aliceBlue),
        Vegetable(R.drawable.dupli, "Dupli-Kate", "", cultured),
        Vegetable(R.drawable.theimmortal, "The Immortal", "", azureishWhite),
        Vegetable(R.drawable.green, "Green Ghost", "", seashell),
    )

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        LazyColumn {
            item {
                Spacer(modifier = Modifier.height(24.dp))
                Row(
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 12.dp)
                ) {
                    /*Image(
                        modifier = Modifier.size(16.dp),
                        painter = painterResource(id = R.drawable.left_arrow),
                        contentDescription = "Back Arrow Image"
                    )*/
                    Text(
                        text = "Lengkapi Nutrisimu",
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                    /*Image(
                        modifier = Modifier.size(24.dp),
                        painter = painterResource(id = R.drawable.filter),
                        contentDescription = "Filter Image",
                        contentScale = ContentScale.Crop
                    )*/
                }
                /*Spacer(modifier = Modifier.height(36.dp))
                TextField(
                    modifier = Modifier
                        .fillMaxWidth(),
                    colors = TextFieldDefaults.textFieldColors(
                        backgroundColor = ghostWhite,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                    ),
                    value = text,
                    shape = RoundedCornerShape(32.dp),
                    singleLine = true,
                    onValueChange = { text = it },
                    placeholder = {
                        Text(
                            text = "Carl Sayuran",
                            color = platinum
                        )
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Filled.Search,
                            contentDescription = stringResource(R.string.text_search_icon),
                            tint = lightSilver
                        )
                    },
                )*/
                Spacer(modifier = Modifier.height(24.dp))
            }
            items(vegetablesItemList.windowed(2, 2, true)) { sublist ->
                Row(modifier = Modifier.fillMaxWidth()) {
                    sublist.forEach { item ->
                        Card(
                            modifier = Modifier
                                .fillParentMaxWidth(0.5f)
                                .padding(4.dp),
                            shape = RoundedCornerShape(16.dp),
                            backgroundColor = item.cardBg,
                            onClick = {
                                    val veg = when (item.name) {
                                        "Invincible" -> "Invincible"
                                        "Atom Eve" -> "Atom Eve"
                                        // Add more cases for other vegetable types if needed
                                        else -> "Else"
                                    }
                                Log.d("ItemClicked", "Vegetable Name: $veg")
                                    actions.gotoVegetableDetail(veg)

                               /* val vegetableId =  when (item.name) {
                                    "Invincible" ->actions.gotoVegetableDetail("Invincible")
                                    "Tomato" -> actions.gotoVegetableDetail("Tomato")
                                    // Add more cases for other vegetable types if needed
                                    else -> actions.gotoVegetableDetail("Else")
                                        // Default action or error handling
                                }*/
                               // actions.gotoVegetableDetail()
                              //      Toast.makeText(context, "Vegetable ID: $vegetableId", Toast.LENGTH_SHORT).show()
                            }
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(16.dp)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(4.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Image(
                                        modifier = Modifier
                                            .size(190.dp),
                                        painter = painterResource(item.image),
                                        contentDescription = "Vegetable",
                                    )
                                }
                                Spacer(modifier = Modifier.height(24.dp))
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.Center,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                ) {

                                    Column(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                    ) {
                                        Text(
                                            text = item.name,
                                            fontSize = 13.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = black,
                                        )
                                       /* Text(
                                            text = item.price,
                                            fontSize = 11.sp,
                                            color = black,
                                        )*/
                                    }
                                   /* Box(
                                        modifier = Modifier
                                            .clip(RoundedCornerShape(8.dp))
                                            .background(gold)
                                            .padding(4.dp),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Icon(
                                            modifier = Modifier.size(16.dp, 16.dp),
                                            imageVector = Icons.Default.Add,
                                            contentDescription = stringResource(R.string.text_add_icon),
                                            tint = white
                                        )
                                    }*/

                                }

                            }
                        }
                    }
                }

            }
        }

    }
}