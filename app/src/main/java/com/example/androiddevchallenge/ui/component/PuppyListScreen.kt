/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.component

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.indication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.domain.Dog
import com.example.androiddevchallenge.domain.DogRepository

@ExperimentalFoundationApi
@Composable
fun PuppyListScreen(navController: NavHostController) {

    val dogRepository = DogRepository()

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            "Adopt, don't shop!",
            style = MaterialTheme.typography.h6,
            modifier = Modifier.padding(16.dp)
        )
        PuppyGrid(
            dogRepository.getDogs()
        ) {
            navController.navigate("detail/${it.id}")
        }
    }
}

@ExperimentalFoundationApi
@Composable
fun PuppyGrid(dogs: List<Dog>, onDogClick: (Dog) -> Unit) {
    LazyVerticalGrid(
        cells = GridCells.Fixed(5)
    ) {
        items(dogs) { dog ->
            Puppy(dog, onDogClick)
        }
    }
}

@Composable
fun Puppy(dog: Dog, onPuppyClick: (Dog) -> Unit) {
    val interactionSource = remember { MutableInteractionSource() }
    Image(
        painter = painterResource(id = dog.drawableResId),
        contentDescription = null,
        modifier = Modifier
            .height(128.dp)
            .padding(8.dp)
            .clip(shape = RoundedCornerShape(64.dp))
            .clickable {
                onPuppyClick(dog)
            }
            .indication(
                interactionSource,
                rememberRipple(bounded = true)
            ),
        contentScale = ContentScale.Crop,
    )
}
