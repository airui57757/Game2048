package com.airui.game2048;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends Activity {
	
	
	private static MainActivity mainActivity = null;
	private TextView tvScore;
	private int score = 0;
	
	
	public MainActivity() {
		mainActivity = this;
	}
	
	public static MainActivity getMainActivity() {
			return mainActivity;
		}
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        tvScore = (TextView) findViewById(R.id.tv_score);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	getMenuInflater().inflate(R.menu.main, menu);
    	return true;
    }
    
    public void clearScore(){
    	score = 0;
    	showScore();
    }
    
    public void showScore(){
    	tvScore.setText(score + "");
    }
    
    public void addScore(int s){
    	score +=s;
    	showScore();
    }
    
   
    
    

    
}
