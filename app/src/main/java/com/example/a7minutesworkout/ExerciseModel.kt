package com.example.a7minutesworkout

class ExerciseModel(
    private var id: Int,
    private var name: String,
    private var image: Int,
    private var isCompleted: Boolean,
    private var isSelected: Boolean,
) {
    fun setId(id: Int) {
        this.id = id
    }
    fun getId(): Int {
        return id
    }
    fun setName(name: String) {
        this.name = name
    }
    fun getName(): String {
        return name
    }
    fun setImage(image: Int) {
        this.image = image
    }
    fun getImage(): Int {
        return image
    }
    fun setisSelected(isSelected: Boolean) {
        this.isSelected = isSelected
    }
    fun getisSelected(): Boolean {
        return isSelected
    }
    fun setisCompleted(isCompleted: Boolean) {
        this.isCompleted = isCompleted
    }
    fun getisCompleted(): Boolean {
        return isCompleted
    }
}
