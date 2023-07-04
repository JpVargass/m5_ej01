package cl.jpvs.m5_ej01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import cl.jpvs.m5_ej01.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.buttonFirstFragment.setOnClickListener(v -> {
                    showFirstFragment();
                }
        );
    }

    private void showFirstFragment() {
        FirstFragment firstFragment = FirstFragment.newInstance("","");
        getSupportFragmentManager().beginTransaction().replace(R.id.mainContainer, firstFragment, "First").commit();
    }
}