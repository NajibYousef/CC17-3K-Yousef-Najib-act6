package com.example.a30daysoffitness

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ExerciseAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Create a list of exercises
        val exercises = listOf(
            Exercise(1, "Jumping Jacks",
                "A great full-body warm-up.\n" +
                        "Start standing with your feet together and arms at your sides. Jump and spread your feet while raising your arms overhead. Return to the start. Repeat.",
                R.drawable.exercise1
            ),
            Exercise(2, "Squats",
                "Builds lower body strength.\n" +
                        "Stand with feet shoulder-width apart. Lower your hips down and back as if sitting in a chair. Keep your chest up and knees over toes. Push through your heels to stand.",
                R.drawable.exercise2
            ),
            Exercise(3, "Push-Ups",
                "Upper body and core strength exercise.\n" +
                        "Start in a plank position. Lower your body until your chest almost touches the floor. Push back up while keeping your core tight.",
                R.drawable.exercise3
            ),
            Exercise(4, "Plank",
                "Strengthens the core and stabilizers.\n" +
                        "Start on your forearms and toes, keeping your body in a straight line from head to heels. Hold the position without letting your hips drop.",
                R.drawable.exercise4
            ),
            Exercise(5, "Mountain Climbers",
                "Full-body exercise with cardio benefits.\n" +
                        "Begin in a high plank. Drive one knee towards your chest, then switch legs quickly, as if running in place.",
                R.drawable.exercise5
            ),
            Exercise(6, "Burpees",
                "Full-body workout and calorie burner.\n" +
                        "From standing, squat down, place your hands on the floor, and jump your feet back into a plank. Perform a push-up, jump your feet forward, and jump up.",
                R.drawable.exercise6
            ),
            Exercise(7, "Active Recovery (Yoga or Walking)",
                "Helps muscles recover and reduces soreness.\n" +
                        "Light yoga or a brisk 20-minute walk to loosen up muscles and maintain flexibility.",
                R.drawable.exercise7
            ),
            Exercise(8, "Lunges",
                "Builds lower body strength and balance.\n" +
                        "Step forward with one leg, lower your hips until both knees are bent at 90 degrees. Push back to standing.",
                R.drawable.exercise8
            ),
            Exercise(9, "Tricep Dips",
                "Strengthens triceps and shoulders.\n" +
                        "Sit on the edge of a bench or chair. Lower your body by bending your elbows, then push back up.",
                R.drawable.exercise9
            ),
            Exercise(10, "Russian Twists",
                "Targets the obliques and core.\n" +
                        "Sit on the floor with knees bent, lean back slightly. Twist your torso to the left, then right, touching the ground on each side.",
                R.drawable.exercise10
            ),
            Exercise(11, "Jump Rope",
                "Great cardio and coordination booster.\n" +
                        "Jump with both feet while rotating the rope. Keep your jumps low to the ground to maintain speed.",
                R.drawable.exercise11
            ),
            Exercise(12, "Bicycle Crunches",
                "Core-focused exercise for abs and obliques.\n" +
                        "Lie on your back with hands behind your head. Bring one knee toward your chest and twist your opposite elbow towards it, alternating sides.",
                R.drawable.exercise12
            ),
            Exercise(13, "Step-ups",
                "Great for legs and glutes.\n" +
                        "Step onto a sturdy platform or bench with one leg, drive through your heel, and step back down.",
                R.drawable.exercise13
            ),
            Exercise(14, "Active Recovery (Stretching or Foam Rolling)",
                "Rest and reset with muscle recovery techniques.\n" +
                        "Focus on stretching or foam rolling your muscles to enhance flexibility and relieve tension.",
                R.drawable.exercise14
            ),
            Exercise(15, "High Knees",
                "Improves agility and cardiovascular health.\n" +
                        "Jog in place, bringing your knees up towards your chest with each step. Keep your core tight.",
                R.drawable.exercise15
            ),
            Exercise(16, "Deadlifts",
                "Builds hamstrings, glutes, and lower back strength.\n" +
                        "Stand with feet hip-width apart. Hinge at your hips while keeping a flat back, lower until you feel a stretch in your hamstrings, then return to standing.",
                R.drawable.exercise16
            ),
            Exercise(17, "Shoulder Taps",
                "Strengthens the shoulders and core.\n" +
                        "Start in a high plank. Tap one shoulder with the opposite hand, alternating sides while keeping hips stable.",
                R.drawable.exercise17
            ),
            Exercise(18, "Side Lunges",
                "Builds leg strength and flexibility.\n" +
                        "Step to the side with one leg, lowering your hips. Push back to standing. Alternate sides.",
                R.drawable.exercise18
            ),
            Exercise(19, "Wall Sit",
                "Strengthens quads and builds endurance.\n" +
                        "Stand against a wall, lower into a squat position with your back flat and hold.",
                R.drawable.exercise19
            ),
            Exercise(20, "Skaters",
                "Improves agility and leg strength.\n" +
                        "Jump laterally from one foot to the other, mimicking a speed skater's motion.",
                R.drawable.exercise20
            ),
            Exercise(21, "Box Jumps",
                "Power and explosive leg strength.\n" +
                        "Jump onto a sturdy box or platform, landing softly, then step down and repeat.",
                R.drawable.exercise21
            ),
            Exercise(22, "Superman",
                "Strengthens lower back and core.\n" +
                        "Lie face down and lift your arms, chest, and legs off the floor, holding for a few seconds before lowering.",
                R.drawable.exercise22
            ),
            Exercise(23, "Side Plank",
                "Targets the obliques and stabilizers.\n" +
                        "Lie on one side, prop yourself up on your forearm, and hold a straight body position.",
                R.drawable.exercise23
            ),
            Exercise(24, "Glute Bridges",
                "Strengthens glutes and hamstrings.\n" +
                        "Lie on your back, knees bent, lift your hips toward the ceiling by pressing through your heels.",
                R.drawable.exercise24
            ),
            Exercise(25, "Spider-Man Push-Ups",
                "Engages core and upper body.\n" +
                        "In a push-up position, bring one knee towards the elbow on the same side as you lower your chest. Alternate sides.",
                R.drawable.exercise25
            ),
            Exercise(26, "Jump Squats",
                "Builds explosive power and cardio fitness.\n" +
                        "Perform a squat, then jump explosively upwards. Land softly and repeat.",
                R.drawable.exercise26
            ),
            Exercise(27, "Burpee to Pull-Up",
                "Combines full-body conditioning with upper body strength.\n" +
                        "Perform a burpee, jump into a pull-up, then repeat.",
                R.drawable.exercise27
            ),
            Exercise(28, "Full-Body Circuit",
                "A comprehensive, high-intensity workout.\n" +
                        "Include a mixture of exercises targeting various muscle groups. Customize your circuit as needed.",
                R.drawable.exercise28
            ),
            Exercise(29, "Kettlebell Swings",
                "Works full body and enhances coordination.\n" +
                        "Swing a kettlebell from between your knees to eye level, using your hips for momentum.",
                R.drawable.exercise29
            ),
            Exercise(30, "Kettlebell Clean and Press",
                "Combines strength and coordination.\n" +
                        "Lift a kettlebell from the floor to shoulder height, then press it overhead. Repeat on both sides.",
                R.drawable.exercise30
            )
        )

        // Initialize the adapter
        adapter = ExerciseAdapter(exercises)
        recyclerView.adapter = adapter
    }
}
