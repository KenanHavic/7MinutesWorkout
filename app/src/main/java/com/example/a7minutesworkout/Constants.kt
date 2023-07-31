package com.example.a7minutesworkout

object Constants {
    fun defaultExerciseList(): ArrayList<ExerciseModel> {
        val exerciseList = ArrayList<ExerciseModel>()
        val jumpingJacks = ExerciseModel(1, "Jumping Jacks", R.drawable.ic_jumping_jacks, false, false)
        exerciseList.add(jumpingJacks)
        val wallSit = ExerciseModel(2, "Wall Sit", R.drawable.ic_wall_sit, false, false)
        exerciseList.add(wallSit)
        val pushUp = ExerciseModel(3, "Push Up", R.drawable.ic_push_up, false, false)
        exerciseList.add(pushUp)
        val pushUpAndRotation = ExerciseModel(4, "Push Up and Rotation", R.drawable.ic_push_up_and_rotation, false, false)
        exerciseList.add(pushUpAndRotation)
        val abdominalCrunch = ExerciseModel(5, "Abdominal Crunch", R.drawable.ic_abdominal_crunch, false, false)
        exerciseList.add(abdominalCrunch)
        val plank = ExerciseModel(6, "Plank", R.drawable.ic_plank, false, false)
        exerciseList.add(plank)
        val sidePlank = ExerciseModel(7, "Side plank", R.drawable.ic_side_plank, false, false)
        exerciseList.add(sidePlank)
        val lunge = ExerciseModel(8, "Lunge", R.drawable.ic_lunge, false, false)
        exerciseList.add(lunge)
        val squat = ExerciseModel(9, "Squat", R.drawable.ic_squat, false, false)
        exerciseList.add(squat)
        val stepUpOnToChair = ExerciseModel(10, "Step up on to chair", R.drawable.ic_step_up_onto_chair, false, false)
        exerciseList.add(stepUpOnToChair)
        val tricepsDipOnChair = ExerciseModel(11, "Triceps dip on chair", R.drawable.ic_triceps_dip_on_chair, false, false)
        exerciseList.add(tricepsDipOnChair)
        val highKneesRunningInPlace = ExerciseModel(12, "High knees running in place", R.drawable.ic_high_knees_running_in_place, false, false)
        exerciseList.add(highKneesRunningInPlace)
        return exerciseList
    }
}
