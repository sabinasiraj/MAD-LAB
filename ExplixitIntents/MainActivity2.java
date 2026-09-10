package com.example.explicitintents;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle = getIntent().getExtras();
        if (bundle!=null)
        {
            String imgindex= bundle.getString("ImageIndex");
            SetImage(imgindex);
        }
    }
    private void SetImage(String imgindex) {
        ImageView imageview =(ImageView) findViewById(R.id.img1);
        switch (imgindex)
        {
            case "1": imageview.setImageResource(R.drawable.cat1);
                break;
            case "2": imageview.setImageResource(R.drawable.cat2);
                break;
            case "3": imageview.setImageResource(R.drawable.cat3);
                break;
            case "4": imageview.setImageResource(R.drawable.cat4);
                break;
            default:
                Toast.makeText(this, "not available index", Toast.LENGTH_SHORT).show();
        }

    }
}