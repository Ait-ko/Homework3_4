package  com.example.homework3_4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.homework3_4.databinding.Continent_Binding;


import java.util.ArrayList;

public  class Fragment_continent extends Fragment implements OnClick {
    private Continent_Binding binding;
    private ContinentAdapter continentAdapter;
    private ArrayList<Continent> continentList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        binding= Continent_Binding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        continentAdapter = new ContinentAdapter(continentList, this::onItemClick);
        binding.rvContinent.setAdapter(continentAdapter);
    }

    private void loadData() {
        continentList.add(new Continent("Евразия"));
        continentList.add(new Continent("Африка"));
        continentList.add(new Continent("Австралия"));
        continentList.add(new Continent("Северная Америка"));
        continentList.add(new Continent("Южная Америка"));

    }


    @Override
    public void onItemClick(int position) {
        Continent continent = continentList.get(position);
        Bundle bundle = new Bundle();
        bundle.putInt("key", position);

        Fragment_country fragment = new Fragment_country();
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).addToBackStack(null).commit();
    }
}