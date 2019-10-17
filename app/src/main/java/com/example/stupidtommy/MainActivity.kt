package com.example.stupidtommy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

// : means extends in java
class MainActivity : AppCompatActivity() {

    //onCreate = main()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Create the UI
        //R = resources
        setContentView(R.layout.activity_main)
        //TODO : Continue Here Thanks

        //Java int x; vs Kotlin var x : Int
        //val = value and var = variable
        //findViewById = link UI to code

        val buttonDonClickMe : Button = findViewById(R.id.buttonDonClickMe);
        buttonDonClickMe.setOnClickListener{ showMessage()};
    }

    private fun showMessage(){
        textViewMessage.setText(getString(R.string.warning_message));
    }
}
