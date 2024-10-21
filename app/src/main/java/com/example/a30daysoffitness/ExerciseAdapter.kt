// ExerciseAdapter.kt
package com.example.a30daysoffitness

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class ExerciseAdapter(private val exercises: List<Exercise>) : RecyclerView.Adapter<ExerciseAdapter.ExerciseViewHolder>() {

    class ExerciseViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val cardView: CardView = view.findViewById(R.id.card_view)
        val exerciseName: TextView = view.findViewById(R.id.exercise_name)
        val exerciseDescription: TextView = view.findViewById(R.id.exercise_description)
        val exerciseImage: ImageView = view.findViewById(R.id.exercise_image)
        val exerciseDay: TextView = view.findViewById(R.id.exercise_day)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_exercise, parent, false)
        return ExerciseViewHolder(view)
    }

    override fun onBindViewHolder(holder: ExerciseViewHolder, position: Int) {
        val exercise = exercises[position]
        holder.exerciseDay.text = "Day ${exercise.day}"
        holder.exerciseName.text = exercise.name
        holder.exerciseDescription.text = exercise.description
        holder.exerciseImage.setImageResource(exercise.imageResId)
    }

    override fun getItemCount() = exercises.size
}