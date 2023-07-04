package cl.jpvs.m5_ej01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import cl.jpvs.m5_ej01.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}