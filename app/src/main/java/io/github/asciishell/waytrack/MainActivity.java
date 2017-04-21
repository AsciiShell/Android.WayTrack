package io.github.asciishell.waytrack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onMyButtonClick(View view)
    {
        TextView editText = (TextView)findViewById(R.id.textView);
        Random r = new Random();
        int i1 = r.nextInt(4);
        if (i1 == 0){
            editText.setText("Вперед!");
        }
        else if(i1 == 1){
            editText.setText("Налево!");
        }
        else if(i1 == 2){
            editText.setText("Направо!");
        }
        else if(i1 == 3){
            editText.setText("Назад!");
        }
    }
}
