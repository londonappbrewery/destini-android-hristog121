package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    // TODO: Steps 4 & 8 - Declare member variables here:
    private Button buttonTopRed;
    private Button buttonBottomBlue;
    private TextView storyText;
    private int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        buttonTopRed = findViewById(R.id.buttonTop);
        buttonBottomBlue = findViewById(R.id.buttonBottom);
        storyText = findViewById(R.id.storyTextView);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        buttonTopRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex == 1) {
                    storyText.setText(R.string.T3_Story);
                    buttonTopRed.setText(R.string.T3_Ans1);
                    buttonBottomBlue.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                } else if (mStoryIndex == 3) {
                    storyText.setText(R.string.T6_End);
                    buttonTopRed.setVisibility(View.GONE);
                    buttonBottomBlue.setVisibility(View.GONE);
                } else if(mStoryIndex == 2){
                    storyText.setText(R.string.T3_Story);
                    buttonTopRed.setText(R.string.T3_Ans1);
                    buttonBottomBlue.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                }


            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        buttonBottomBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex == 1) {
                    storyText.setText(R.string.T2_Story);
                    buttonTopRed.setText(R.string.T2_Ans1);
                    buttonBottomBlue.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                } else if (mStoryIndex == 2) {
                    storyText.setText(R.string.T4_End);
                    buttonTopRed.setVisibility(View.GONE);
                    buttonBottomBlue.setVisibility(View.GONE);
                }else if(mStoryIndex == 3){
                    storyText.setText(R.string.T5_End);
                    //Hide the buttons
                    buttonTopRed.setVisibility(View.GONE);
                    buttonBottomBlue.setVisibility(View.GONE);
                }


            }
        });


    }
}
