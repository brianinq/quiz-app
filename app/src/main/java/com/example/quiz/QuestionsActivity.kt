package com.example.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.quiz.databinding.ActivityQuestionsBinding

class QuestionsActivity : AppCompatActivity() {
    lateinit var binding: ActivityQuestionsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityQuestionsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val questionsList = Constants.getQuestions()
//        Log.d("Questions", "${questionsList.size}")

        val position = 1
        val question: Question? = questionsList[position -1]

        binding.progressBar.progress = position
        binding.tvProgress.text = "${position} / ${binding.progressBar.max}"

        binding.tvQuestion.text = question!!.question
        binding.ivImage.setImageResource(question.image)
        binding.tvOptionOne.text = question!!.optionOne
        binding.tvOptionTwo.text = question!!.optionTwo
        binding.tvOptionThree.text = question!!.optionThree
        binding.tvOptionFour.text = question!!.optionFour
    }
}