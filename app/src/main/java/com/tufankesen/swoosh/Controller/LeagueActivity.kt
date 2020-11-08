package com.tufankesen.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import com.tufankesen.swoosh.Utilities.EXTRA_PLAYER
import com.tufankesen.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*
import com.tufankesen.swoosh.Model.Player
import com.tufankesen.swoosh.Utilities.EXTRA_PLAYER

class LeagueActivity : BaseActivity() {
    var player = Player("", "")

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState != null)
        {
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View){
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        player.league = "mens"
    }

    fun onWomensClicked(view: View){
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        player.league = "womens"
    }

    fun onCoedClicked(view: View){
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false
        player.league = "co-ed"
    }

    fun leagueNextClicked(view: View) {
        if(player.league != "")
        {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this, "Please select a league",Toast.LENGTH_SHORT).show()
        }

    }


}