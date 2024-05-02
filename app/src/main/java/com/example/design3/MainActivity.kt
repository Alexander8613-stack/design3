package com.example.design3

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.RelativeLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rootView = findViewById<RelativeLayout>(R.id.root_view)
        val redSquareView = View(this)
        redSquareView.setBackgroundColor(resources.getColor(R.color.red))

        val paramsRedSquare = RelativeLayout.LayoutParams(
            RelativeLayout.LayoutParams.WRAP_CONTENT,
            RelativeLayout.LayoutParams.WRAP_CONTENT
        )
        paramsRedSquare.addRule(RelativeLayout.ALIGN_PARENT_TOP)
        paramsRedSquare.addRule(RelativeLayout.ALIGN_PARENT_LEFT)

        val screenWidth = resources.displayMetrics.widthPixels
        val screenHeight = resources.displayMetrics.heightPixels
        val redSquareSize = (screenWidth * 0.3).toInt() // 30% ширины экрана
        paramsRedSquare.width = redSquareSize
        paramsRedSquare.height = redSquareSize

        rootView.addView(redSquareView, paramsRedSquare)

        val yellowSquareView = View(this)
        yellowSquareView.setBackgroundColor(resources.getColor(R.color.yellow))

        val paramsYellowSquare = RelativeLayout.LayoutParams(
            RelativeLayout.LayoutParams.WRAP_CONTENT,
            RelativeLayout.LayoutParams.WRAP_CONTENT
        )
        paramsYellowSquare.addRule(RelativeLayout.ALIGN_TOP, redSquareView.id)
        paramsYellowSquare.addRule(RelativeLayout.ALIGN_LEFT, redSquareView.id)

        val yellowSquareSize = (redSquareSize * 0.2).toInt() // 20% размера красного квадрата
        paramsYellowSquare.width = yellowSquareSize
        paramsYellowSquare.height = yellowSquareSize

        rootView.addView(yellowSquareView, paramsYellowSquare)

        val blackSquareView = View(this)
        blackSquareView.setBackgroundColor(resources.getColor(R.color.black))

        val paramsBlackSquare = RelativeLayout.LayoutParams(
            RelativeLayout.LayoutParams.WRAP_CONTENT,
            RelativeLayout.LayoutParams.WRAP_CONTENT
        )
        paramsBlackSquare.addRule(RelativeLayout.ALIGN_TOP, redSquareView.id)
        paramsBlackSquare.addRule(RelativeLayout.ALIGN_PARENT_RIGHT)
        paramsBlackSquare.rightMargin =755 //

        val blackSquareSize = (redSquareSize * 0.2).toInt() // 20% размера красного квадрата
        paramsBlackSquare.width = blackSquareSize
        paramsBlackSquare.height = blackSquareSize

        rootView.addView(blackSquareView, paramsBlackSquare)

        val orangeSquareView = View(this)
        orangeSquareView.setBackgroundColor(resources.getColor(R.color.orange))

        val paramsOrangeSquare = RelativeLayout.LayoutParams(
            RelativeLayout.LayoutParams.WRAP_CONTENT,
            RelativeLayout.LayoutParams.WRAP_CONTENT
        )

        paramsOrangeSquare.addRule(RelativeLayout.ALIGN_TOP,redSquareView.id)
        paramsOrangeSquare.addRule(RelativeLayout.ALIGN_PARENT_RIGHT)
        paramsOrangeSquare.rightMargin = 755

        val orangeSquareSize = (redSquareSize * 0.1).toInt()
        paramsOrangeSquare.width = orangeSquareSize
        paramsOrangeSquare.height = orangeSquareSize

        rootView.addView(orangeSquareView,paramsOrangeSquare)

        val purpleSquareView = View(this)
        purpleSquareView.setBackgroundColor(resources.getColor(R.color.purple))

        val paramsPurpleSquare = RelativeLayout.LayoutParams(
            RelativeLayout.LayoutParams.WRAP_CONTENT,
            RelativeLayout.LayoutParams.WRAP_CONTENT
        )
        paramsPurpleSquare.addRule(RelativeLayout.ALIGN_PARENT_TOP, redSquareView.id)
        paramsPurpleSquare.addRule(RelativeLayout.ALIGN_PARENT_LEFT, redSquareView.id)

        val purpleSquareSize = (redSquareSize * 0.2).toInt() // 20% размера красного квадрата
        paramsPurpleSquare.width = purpleSquareSize
        paramsPurpleSquare.height = purpleSquareSize

        paramsPurpleSquare.leftMargin = (redSquareSize - purpleSquareSize) / 2
        paramsPurpleSquare.topMargin = (redSquareSize - purpleSquareSize) / 2

        rootView.addView(purpleSquareView, paramsPurpleSquare)

        val blueSquareView = View(this)
        blueSquareView.setBackgroundColor(resources.getColor(R.color.blue))

        val paramsBlueSquare = RelativeLayout.LayoutParams(
            RelativeLayout.LayoutParams.WRAP_CONTENT,
            RelativeLayout.LayoutParams.WRAP_CONTENT
        )
        paramsBlueSquare.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, redSquareView.id)
        paramsBlueSquare.addRule(RelativeLayout.ALIGN_PARENT_LEFT, redSquareView.id)

        val blueSquareSize = (redSquareSize * 0.2).toInt() // 20% размера красного квадрата
        paramsBlueSquare.width = blueSquareSize
        paramsBlueSquare.height = blueSquareSize

        paramsBlueSquare.bottomMargin =1888
        paramsBlueSquare.leftMargin = 0

        rootView.addView(blueSquareView, paramsBlueSquare)
    }
}