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
package com.example.androiddevchallenge.domain

import com.example.androiddevchallenge.R

class DogRepository {

    private val dogs = listOf(
        Dog(1, "Rex", 1, "Golden Retriever", R.drawable.puppy1),
        Dog(2, "Lady", 2, "Cocker Spaniel", R.drawable.puppy2),
        Dog(3, "Max", 3, "Jack Russel Terrier", R.drawable.puppy3),
        Dog(4, "Buddy", 1, "Labrador", R.drawable.puppy4),
        Dog(5, "Rocky", 5, "Terrier", R.drawable.puppy5),
        Dog(6, "Blue", 8, "Australian Shepherd", R.drawable.puppy6),
        Dog(7, "Balthazar", 10, "Japanese Spitz", R.drawable.baltha),
        Dog(1, "Rex", 1, "Golden Retriever", R.drawable.puppy1),
        Dog(2, "Lady", 2, "Cocker Spaniel", R.drawable.puppy2),
        Dog(3, "Max", 3, "Jack Russel Terrier", R.drawable.puppy3),
        Dog(4, "Buddy", 1, "Labrador", R.drawable.puppy4),
        Dog(5, "Rocky", 5, "Terrier", R.drawable.puppy5),
        Dog(6, "Blue", 8, "Australian Shepherd", R.drawable.puppy6),
        Dog(7, "Balthazar", 10, "Japanese Spitz", R.drawable.baltha),
        Dog(1, "Rex", 1, "Golden Retriever", R.drawable.puppy1),
        Dog(2, "Lady", 2, "Cocker Spaniel", R.drawable.puppy2),
        Dog(3, "Max", 3, "Jack Russel Terrier", R.drawable.puppy3),
        Dog(4, "Buddy", 1, "Labrador", R.drawable.puppy4),
        Dog(5, "Rocky", 5, "Terrier", R.drawable.puppy5),
        Dog(6, "Blue", 8, "Australian Shepherd", R.drawable.puppy6),
        Dog(7, "Balthazar", 10, "Japanese Spitz", R.drawable.baltha),
        Dog(1, "Rex", 1, "Golden Retriever", R.drawable.puppy1),
        Dog(2, "Lady", 2, "Cocker Spaniel", R.drawable.puppy2),
        Dog(3, "Max", 3, "Jack Russel Terrier", R.drawable.puppy3),
        Dog(4, "Buddy", 1, "Labrador", R.drawable.puppy4),
        Dog(5, "Rocky", 5, "Terrier", R.drawable.puppy5),
        Dog(6, "Blue", 8, "Australian Shepherd", R.drawable.puppy6),
        Dog(7, "Balthazar", 10, "Japanese Spitz", R.drawable.baltha),
        Dog(1, "Rex", 1, "Golden Retriever", R.drawable.puppy1),
        Dog(2, "Lady", 2, "Cocker Spaniel", R.drawable.puppy2),
        Dog(3, "Max", 3, "Jack Russel Terrier", R.drawable.puppy3),
        Dog(4, "Buddy", 1, "Labrador", R.drawable.puppy4),
        Dog(5, "Rocky", 5, "Terrier", R.drawable.puppy5),
        Dog(6, "Blue", 8, "Australian Shepherd", R.drawable.puppy6),
        Dog(7, "Balthazar", 10, "Japanese Spitz", R.drawable.baltha),
        Dog(1, "Rex", 1, "Golden Retriever", R.drawable.puppy1),
        Dog(2, "Lady", 2, "Cocker Spaniel", R.drawable.puppy2),
        Dog(3, "Max", 3, "Jack Russel Terrier", R.drawable.puppy3),
        Dog(4, "Buddy", 1, "Labrador", R.drawable.puppy4),
        Dog(5, "Rocky", 5, "Terrier", R.drawable.puppy5),
        Dog(6, "Blue", 8, "Australian Shepherd", R.drawable.puppy6),
        Dog(7, "Balthazar", 10, "Japanese Spitz", R.drawable.baltha),
        Dog(1, "Rex", 1, "Golden Retriever", R.drawable.puppy1),
        Dog(2, "Lady", 2, "Cocker Spaniel", R.drawable.puppy2),
        Dog(3, "Max", 3, "Jack Russel Terrier", R.drawable.puppy3),
        Dog(4, "Buddy", 1, "Labrador", R.drawable.puppy4),
        Dog(5, "Rocky", 5, "Terrier", R.drawable.puppy5),
        Dog(6, "Blue", 8, "Australian Shepherd", R.drawable.puppy6),
        Dog(7, "Balthazar", 10, "Japanese Spitz", R.drawable.baltha)
    )

    fun getDogs(): List<Dog> = dogs

    fun getDog(id: Int) = dogs.find { it.id == id }
}
