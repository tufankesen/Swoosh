package com.tufankesen.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.tufankesen.swoosh.R
import com.tufankesen.swoosh.Utilities.EXTRA_LEAGUE
import com.tufankesen.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeaguesText.text = "Looking for $league $skill league near you..."
    }
}